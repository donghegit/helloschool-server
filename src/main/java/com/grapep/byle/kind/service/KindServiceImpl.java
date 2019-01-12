package com.grapep.byle.kind.service;

import com.grapep.byle.kind.dao.KindMapper;
import com.grapep.byle.kind.entity.Kind;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Describe: TODO
 * @Author : donghe
 * @DateTime: 2017.11.28  20:54
 */

@Slf4j
@Service
public class KindServiceImpl implements KindService{

    @Autowired
    private KindMapper kindMapper;

    @Override
    public List<Kind> getAllKind() {
        return kindMapper.selectAllKind();
    }
}
