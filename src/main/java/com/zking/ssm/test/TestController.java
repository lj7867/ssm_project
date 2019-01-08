package com.zking.ssm.test;

import org.apache.ibatis.jdbc.Null;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("test")
    public String test() throws Exception{

        throw new NullPointerException();

    }
}
