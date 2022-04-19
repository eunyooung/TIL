package com.sist.react.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sist.react.dao.*;
import com.sist.react.vo.*;

@Service
public class ReactServiceImpl implements ReactService{
    
    @Autowired
    private FoodMapper fMapper;
    @Autowired
    private RecipeMapper rMapper;
    @Autowired
    private SeoulMapper sMapper;
    
	@Override
	public List<CategoryVO> foodCategoryData(Map map) {
		// TODO Auto-generated method stub
		return fMapper.foodCategoryData(map);
	}
}