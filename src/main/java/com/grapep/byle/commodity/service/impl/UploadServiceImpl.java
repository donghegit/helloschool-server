package com.grapep.byle.commodity.service.impl;

import com.grapep.byle.commodity.dao.CommodityMapper;
import com.grapep.byle.commodity.entity.Commodity;
import com.grapep.byle.commodity.entity.CommodityWithBLOBs;
import com.grapep.byle.commodity.service.UploadService;
import com.grapep.byle.common.constants.Constants;
import com.grapep.byle.common.exception.ByleException;
import com.grapep.byle.common.util.QiniuFileUploadUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
@Slf4j
public class UploadServiceImpl implements UploadService {

    @Autowired
    private CommodityMapper commodityMapper;

    /**
     * 发布内容存入数据库
     *
     * @param commodity
     * @param files
     * @return
     */
    @Override
    @Transactional
    public String upload(CommodityWithBLOBs commodity, List<MultipartFile> files) throws ByleException {
        StringBuffer imgUrlName = new StringBuffer();
        try {
            MultipartFile file = null;
            for (int i = 0; i < files.size(); i++) {
                file = files.get(i);
                String fileName = QiniuFileUploadUtil.uploadCommodyImg(file);
                if (i < files.size() - 1) {
                    imgUrlName.append(Constants.QINIU_PROTOCOL +  Constants.QINIU_HEAD_IMG_URL + "/" + fileName + ",");
                } else {
                    imgUrlName.append(Constants.QINIU_PROTOCOL +  Constants.QINIU_HEAD_IMG_URL + "/" + fileName);
                }
            }
        } catch (IOException e) {
            log.error("七牛图像存储失败");
            throw new ByleException("发布内容图片上传失败");
        }
        commodity.setComdPicture(imgUrlName.toString());
        int result = commodityMapper.insertSelective(commodity);
        if (result > 0) {
            return "upload_succ";
        }
        return "upload_fail";
    }
}
