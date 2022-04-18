package com.sist.last.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sist.last.dao.*;
import com.sist.last.entity.*;

@RestController
public class MusicRestController {
    
    @Autowired
    private MusicDAO dao;
    
    @PostMapping("/music/detail")
    public MusicEntity music_detail(int no) {
        MusicEntity vo = dao.musicDetail(no);
        return vo;
    }
}