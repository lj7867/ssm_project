package com.zking.ssm.controller;

import com.zking.ssm.model.dict.Dict;
import com.zking.ssm.service.dict.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/dict")
public class DictController {
    @Autowired
    private DictService dictService;

    @RequestMapping("/queryDict")
    @ResponseBody
    public List<Dict> initDict(Dict dict){
        List<Dict> list = dictService.queryDict(dict);
        return list;
    }
}
