package com.grapep.byle.security;



import javax.crypto.Cipher;
import java.io.InputStream;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.*;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.util.encoders.Base64;


/**
 * 加密解密工具类
 * @author wangjianbin
 * @create 2017-07-31 15:28
 **/

public class RSAUtil {

    /**
     * 私钥字符串
     */
    private static String PRIVATE_KEY ="MIICXAIBAAKBgQCuVRY8B3+Af5euC9WbgNkJKAiBzqOvrYi9mSST78jd4clpn7vkYHDfHzJiqFz9wjNRLzg9MUREF53bw9yhSljZ7F8JPMryfe8RR2Ed6CJq5nCy/2hvTTw4L6ypDemwe9f9yjIg52oPRPwU8lm8Uj3wKhjedDmZrkO1TAmt3sbQtwIDAQABAoGAHvJ32fwyxCriUEFFkC9VV+zFZdW69QrHRXEULzbX35ufV6LFhgsgvlsZZK4io+F/np/VSfee+L+AhGzGk9NQ5kOC5fe6AgsmWKvHt67eGx8P08TLrsx3moSyno/2tBiH9v3CGOltNTSLJwbIb5G6R8zya7ld5+67yp8y+RMhhGECQQDiVAgcm6QbU//O3fcYHyojNolDUMwJ7eBxbuxbPkSnCfAww5rQU9ayH4PComHbY9h+3yUbWSsm3aCTcdNFY/2pAkEAxS/7vi1rOsThdEdmN3A4J7kFxAaowr8/fNGfmF5Q9WoIBCxoWcH5VpsA1qdqFXakg7NZlqEeSVorMBYcCcWXXwJBAM013/0AafWVXhYVT9uBNlWjNyXf9oDyPFTdfFTmypyh+DRextopijsLNA6f6RZhG4U9komPef7NaLEHvcXm+bECQGIhwg/f/JhPuL+sdMMsNtYV7zeh9MSOduMAU4N5lKK9tOWW0AuzTAn8s8sfn9y0oaTlUbVz02W/2PRiXGvEiNMCQEVUsTwJGPm89MYlD28x4wceX7Mv9C4GB/6eTSYC9mThHzoYt+228WITQ96zoN1l4Cu4uml7fWfyW42OGMB7qUs=";
    /**
     * 公钥字符串
     */
    private static String PUBLIC_KEY ="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCkMzmWUaJ9Xm+qsE+PJ79J MPrjxTZirU1QaIVTjKXzw3YskkRQ6Wh7KgewBINR+H0QoGTVW8mhBF1ZDxI7 +aqqFgD3mOB4Ct1GTwt5a8Qf4n/auLhjXlt31h6qkI2HZFwuIO/c9xJ2d9Hs Ozjl+ZT+N13fd0/bwVxWVizRWjgJMQIDAQAB";


    public static final String KEY_ALGORITHM = "RSA";


    /**
     * 读取密钥字符串
     * @throws Exception
     */

    public static void convert() throws Exception {
        byte[] data = null;

        try {
            InputStream is = RSAUtil.class.getResourceAsStream("/enc_pri");
            int length = is.available();
            data = new byte[length];
            is.read(data);
        } catch (Exception e) {
        }

        String dataStr = new String(data);
        try {
            PRIVATE_KEY = dataStr;
        } catch (Exception e) {
        }

        if (PRIVATE_KEY == null) {
            throw new Exception("Fail to retrieve key");
        }
    }



    /**
     * 私钥解密
     *
     * @param data
     * @return
     * @throws Exception
     */
    public static byte[] decryptByPrivateKey(byte[] data) throws Exception {
        convert();
//        byte[] keyBytes = Base64Util.decode(PRIVATE_KEY);
//        PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);
//        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
//        Key privateKey = keyFactory.generatePrivate(pkcs8KeySpec);
        Key privateKey = makePrivateKey(PRIVATE_KEY);
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);

        return cipher.doFinal(data);
    }

    /**
     *
     * @param data
     * @param key
     * @return
     * @throws Exception
     */
    public static byte[] encryptByPublicKey(byte[] data, String key) throws Exception {
        byte[] keyBytes = Base64Util.decode(key);
        X509EncodedKeySpec pkcs8KeySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        Key publicKey = keyFactory.generatePublic(pkcs8KeySpec);

//        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        return cipher.doFinal(data);
    }

    /**
     *  引入第三方密码工具包 处理编码
     * @param stored
     * @return
     * @throws GeneralSecurityException
     * @throws Exception
     */
    public static PrivateKey makePrivateKey(String stored) throws GeneralSecurityException, Exception {
        /*byte[] data = Base64.getDecoder().decode(stored);
        PKCS8EncodedKeySpec spec = new  PKCS8EncodedKeySpec(data);
        KeyFactory fact = KeyFactory.getInstance("RSA");
        return fact.generatePrivate(spec);*/
        byte[] data = Base64Util.decode(stored);
        ASN1EncodableVector v = new ASN1EncodableVector();
        v.add(new ASN1Integer(0));
        ASN1EncodableVector v2 = new ASN1EncodableVector();
        v2.add(new ASN1ObjectIdentifier(PKCSObjectIdentifiers.rsaEncryption.getId()));
        v2.add(DERNull.INSTANCE);
        v.add(new DERSequence(v2));
        v.add(new DEROctetString(data));
        ASN1Sequence seq = new DERSequence(v);
        byte[] privKey = seq.getEncoded("DER");
        PKCS8EncodedKeySpec spec = new  PKCS8EncodedKeySpec(privKey);
        KeyFactory fact = KeyFactory.getInstance("RSA");
        PrivateKey key = fact.generatePrivate(spec);
        return key;

    }


//    public static void main(String[] args) throws Exception {
//        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance(KEY_ALGORITHM);
//        keyPairGen.initialize(1024);
//        KeyPair keyPair = keyPairGen.generateKeyPair();
//        PrivateKey privateKey = keyPair.getPrivate();
//        PublicKey publicKey = keyPair.getPublic();
//        System.out.println(Base64.encode(privateKey.getEncoded()));
//        System.out.println(Base64.encode(publicKey.getEncoded()));
//        convert();
//        byte[] enR = encryptByPublicKey("老王来了。。。".getBytes("utf-8"),PUBLIC_KEY);
//        System.out.println(enR.toString());
//        byte[] result = decryptByPrivateKey(enR,PRIVATE_KEY);
//        System.out.println(new String(result,"utf-8"));
//
//

//    }

}
