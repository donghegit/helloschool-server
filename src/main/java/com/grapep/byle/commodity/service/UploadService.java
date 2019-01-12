package com.grapep.byle.commodity.service;

import com.grapep.byle.commodity.entity.Commodity;
import com.grapep.byle.commodity.entity.CommodityWithBLOBs;
import com.grapep.byle.common.exception.ByleException;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UploadService {
    String upload(CommodityWithBLOBs commodity, List<MultipartFile> files) throws ByleException;
}
