package com.sist.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;
import com.sist.dao.*;
import com.sist.vo.*;

@Controller
public class LocationController {

    @GetMapping("seoul/location/list.do")
    public String seoul_location_list(Model model) {
        model.addAttribute("main_jsp", "../seoul/location/list.jsp");
        return "main/main";
    }
}