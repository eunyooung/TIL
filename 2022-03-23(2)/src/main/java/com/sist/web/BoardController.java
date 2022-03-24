package com.sist.web;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.sist.dao.*;


@Controller
public class BoardController {

    @Autowired
    private BoardDAO dao;

    @GetMapping("board/list.do")
    public String board_list(Model model) {
        List<BoardVO> list = dao.boardListData();
        model.addAttribute("list", list);
        return "board/list";
    }

    @PostMapping("board/find.do")
    public String board_find(String[] fs, String ss, Model model) {
        Map map = new HashMap();
        map.put("fsArr", fs);
        map.put("ss", ss);
        List<BoardVO> list = dao.boardFindData(map);
        model.addAttribute("list", list);
        return "board/find";
    }
}