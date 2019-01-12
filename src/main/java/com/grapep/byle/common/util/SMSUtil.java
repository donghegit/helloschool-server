package com.grapep.byle.common.util;




public class SMSUtil {
	
	public static final String IP="http://120.77.67.104/msg/HttpSendSM?";
	public static final String Account="zhjwlkjzx";
	public static final String Password="KXqGedS0";
	
	public static String getContent(String randomNum){
		return "(AED)在线管理平台 验证码:"+randomNum+"。如非本人操作，请忽略此短信。";	
	}
	

	
	/**
	 * 拆分返回字符串
	 * @author donghe
	 *
	 */
	public static class ResponseString{
		private String time;  //时间
		private String code;  //返回码
		private String msgId; //消息id
		
		public ResponseString(String response){
			System.out.println("response:"+response);
			String[] ss = response.split("\n");
			if(ss.length>=2){
				msgId=ss[1];
			}
			
			String[] sss=(ss[0]).split(",");
			if(sss.length>=2){
				time=sss[0];
				code=sss[1];
			}
		}
		
		public String getCode() {
			return code;
		}
		
		public String getMsgId() {
			return msgId;
		}
		
		public String getTime() {
			return time;
		}	
	}
}
