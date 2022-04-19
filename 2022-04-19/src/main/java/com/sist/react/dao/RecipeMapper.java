package com.sist.react.dao;

import java.util.*;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.sist.react.vo.*;

@Repository
@Mapper
public interface RecipeMapper {
    
   public List<RecipeVO> recipeListData();
}