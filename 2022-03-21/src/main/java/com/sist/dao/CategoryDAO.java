package com.sist.dao;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sist.mapper.*;
import com.sist.vo.*;

@Repository
public class CategoryDAO {
    
    @Autowired
    private CategoryMapper mapper;

    public List<CategoryVO> categoryAllData() {
        return mapper.categoryAllData();
    }

    public CategoryVO categoryInfodata(int cno) {
        return mapper.categoryInfodata(cno);
    }

    public List<FoodVO> categoryFoodListData(int cno) {
        return mapper.categoryFoodListData(cno);
    }
}