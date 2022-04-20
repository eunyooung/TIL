package com.sist.react.service;

import java.util.*;

import com.sist.react.vo.*;

public interface ReactService {
    
    public List<CategoryVO> foodCategoryData(Map map);
    public List<FoodVO> foodCategoryListData(int cno);
    public CategoryVO foodCategoryInfoData(int cno);
    public FoodVO foodDetailData(int no);
    
    // seoul
    public List<SeoulVO> seoulLocationData(Map map);
    public int seoulLocationTotalPage();
}