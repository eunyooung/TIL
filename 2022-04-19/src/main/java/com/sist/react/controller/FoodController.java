package com.sist.react.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sist.react.service.*;
import com.sist.react.vo.*;

@RestController
@CrossOrigin("http://localhost:3000") // port가 다른 경우 접속이 불가능하다
public class FoodController {
    
    @Autowired
    private ReactService service;

    @GetMapping("/food/category")
    public List<CategoryVO> foodCategoryData(int no) {
        Map map = new HashMap();
        if (no == 1) {
            map.put("start", 1);
            map.put("end", 12);
        } else if (no == 2) {
            map.put("start", 13);
            map.put("end", 18);
        } else if (no == 3) {
            map.put("start", 19);
            map.put("end", 30);
        }
        return service.foodCategoryData(map); // List를 JSON으로 변경해서 전송
        // Jackson
    }
    
    @GetMapping("/food/food_list")
    public List<FoodVO> foodListData(int cno) {
        List<FoodVO> list = new ArrayList<FoodVO>();
        list = service.foodCategoryListData(cno);
        return list;
    }
    
    @GetMapping("/food/cate_info")
    public CategoryVO categoryInfo(int cno) {
        CategoryVO vo = new CategoryVO();
        vo = service.foodCategoryInfoData(cno);
        return vo;
    }
    
    @GetMapping("/food/detail")
    public FoodVO foodDetailData(int no) {
        FoodVO vo = service.foodDetailData(no);
        vo.setAddress(vo.getAddress().substring(0,vo.getAddress().indexOf("지")).trim());
        return vo;
    }
}