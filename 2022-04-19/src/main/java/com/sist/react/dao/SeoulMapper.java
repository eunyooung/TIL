package com.sist.react.dao;

import java.util.*;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.sist.react.vo.*;

@Repository
@Mapper
public interface SeoulMapper {
    public List<SeoulVO> seoulLocationData(Map map);
    public int seoulLocationTotalPage();
}