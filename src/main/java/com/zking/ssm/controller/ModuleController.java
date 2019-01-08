package com.zking.ssm.controller;


import com.zking.ssm.model.module.Module;
import com.zking.ssm.service.module.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/module")
public class ModuleController {


    @Autowired
    private ModuleService moduleService;



    @RequestMapping("/initModule")
    @ResponseBody
    public Map<String,Object> initData(Module module){
        Map<String,Object> maps = new HashMap<>();
        module.setPid("-1");
//        List<Module> list = moduleService.initModule(module);
//        System.out.println(list);
        List<Map<String,Object>> maps1 = new ArrayList<>();
        List<Map<String,Object>> maps2 =null;
        List<Module> lst = moduleService.initModule(module);
        Map<String,Object> map =null;
        Map<String,Object> map2 =null;

        for (Module m : lst) {
            map = new HashMap<>();
            map.put("title",m.getTitle());
            map.put("icon",m.getIcon());
            map.put("href",m.getUrl());
            map.put("spread",false);
            module.setPid(m.getId());
            List<Module> modules = moduleService.initModule(module);
            maps2=new ArrayList<>();
            for (Module m2 : modules) {
                map2=new HashMap<>();
                map2.put("title",m2.getTitle());
                map2.put("icon",m2.getIcon());
                map2.put("href",m2.getUrl());
                map.put("spread",false);
                maps2.add(map2);
                map.put("children",maps2);
            }
            maps1.add(map);
        }


        maps.put("contentManagement",maps1);
        //System.out.println(maps);
        return maps;
    }

   /* *//**
     * 所有权限模块
     *
     * @param right
     * @return
     *//*
    public List<Map<String, Object>> bjyuansu(List<Map<String, Object>> a, List<Map<String, Object>> b, String ab) {
        List<Map<String, Object>> lst = new ArrayList<>();
        Map<String, Object> o = null;
        if (0 == a.size() || null == a || 0 == b.size() || null == b) {
            for (Map<String, Object> map : a) {
                o = new HashMap<>();
                if (ab.equals(map.get("rightParentCode"))) {
                    o.put("title", "" + map.get("name"));
                    o.put("value", "" + map.get("rightCode"));
                    List<Map<String, Object>> list2 = bjyuansu(a, b, map.get("rightCode").toString());
                    if (0 != list2.size()) {
                        o.put("data", list2);
                    }
                    lst.add(o);
                }
            }
            return lst;
        } else {
            for (Map<String, Object> map : a) {
                o = new HashMap<>();
                if (b.contains(map)) {
                    if (ab.equals(map.get("rightParentCode"))) {
                        o.put("title", "" + map.get("name"));
                        o.put("value", "" + map.get("rightCode"));
                        o.put("checked", true);
                        List<Map<String, Object>> list2 = bjyuansu(a, b, map.get("rightCode").toString());
                        if (0 != list2.size()) {
                            o.put("data", list2);
                        }
                        lst.add(o);
                    }
                } else {
                    if (ab.equals(map.get("rightParentCode"))) {
                        o.put("title", "" + map.get("name"));
                        o.put("value", "" + map.get("rightCode"));
                        List<Map<String, Object>> list2 = bjyuansu(a, b, map.get("rightCode").toString());
                        if (0 != list2.size()) {
                            o.put("data", list2);
                        }
                        lst.add(o);
                    }
                }
            }
            return lst;
        }

    }*/

}
