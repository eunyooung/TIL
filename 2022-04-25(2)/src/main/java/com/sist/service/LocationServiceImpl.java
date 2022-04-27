package com.sist.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sist.dao.*;
import com.sist.vo.*;

@Service
public class LocationServiceImpl implements LocationService {
    
    @Autowired
    private LocationMapper lMapper;
    
    @Autowired
    private NatureMapper nMapper;
    
    @Override
    public List<LocationVO> locationListData(Map map) {
        // TODO Auto-generated method stub
        return lMapper.locationListData(map);
    }

    @Override
    public int locationTotalPage() {
        // TODO Auto-generated method stub
        return lMapper.locationTotalPage();
    }

    @Override
    public LocationVO locationDetailData(int no) {
        // TODO Auto-generated method stub
        return lMapper.locationDetailData(no);
    }

    @Override
    public List<NatureVO> natureListData(Map map) {
        // TODO Auto-generated method stub
        return nMapper.natureListData(map);
    }

    @Override
    public int natureTotalPage() {
        // TODO Auto-generated method stub
        return nMapper.natureTotalPage();
    }

    @Override
    public NatureVO natureDetailData(int no) {
        // TODO Auto-generated method stub
        return nMapper.natureDetailData(no);
    }
}