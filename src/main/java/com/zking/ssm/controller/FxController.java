package com.zking.ssm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fx")
public class FxController {

    @RequestMapping("/toCgfx")
    public String toCgFx(){
        return "/Fx/CGfx";
    }
    @RequestMapping("/toGtfx")
    public String toGtFx(){
        return "/Fx/Gtfx";
    }
    @RequestMapping("/toLsfx")
    public String toLsFx(){
        return "/Fx/Lsfx";
    }
}
