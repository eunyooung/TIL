package com.sist.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.sist.vo.*;

public interface CategoryMapper {
    
    @Select("SELECT cno,title,subject,poster "
            + "FROM food_category")
    public List<CategoryVO> categoryListData();

    @Select("SELECT title,subject "
            + "FROM food_category "
            + "WHERE cno=#{cno}")
    public CategoryVO categoryInfoData(int cno);
}