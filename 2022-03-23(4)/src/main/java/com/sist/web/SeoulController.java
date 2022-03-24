package com.sist.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SeoulController {

    @GetMapping("vuejs/vue3.do")
    public String vuejs_vue3() {
        return "vuejs/vue3";
    }
    
    @GetMapping("vuejs/vue4.do")
    public String vuejs_vue4() {
        return "vuejs/vue4";
    }
}
