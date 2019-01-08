package com.zking.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sf")
public class SfController {

    @RequestMapping("/toSqwyf")
    public String toSqwyf(){
        return "/Sf/Sqwyf";
    }
    @RequestMapping("/toScwyf")
    public String toScwyf(){
        return "/Sf/Scwyf";
    }
}
