package com.jarjune.ams.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/home")
    @ResponseBody
    public Map index() {
        Map map = new HashMap();
        map.put("username", "jarjune");
        return map;
    }
}
