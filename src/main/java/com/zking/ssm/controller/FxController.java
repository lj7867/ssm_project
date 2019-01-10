package com.zking.ssm.controller;


import com.github.pagehelper.Page;
import com.zking.ssm.model.fx.Cost;
import com.zking.ssm.service.cost.CostService;
import com.zking.ssm.service.cost.LadderService;
import com.zking.ssm.util.PageBean;
import com.zking.ssm.vo.FXvo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/fx")
public class FxController {

    @Autowired
    private CostService costService;
    @Autowired
    private LadderService ladderService;






    @RequestMapping("/toCgfx")
    public String toCgFx(){
        return "/Fx/CGfx";
    }

    @RequestMapping("/toGtfx")
    public String toGtFx(){ return "/Fx/Gtfx"; }

    @RequestMapping("/toLsfx")
    public String toLsFx(){
        return "/Fx/Lsfx";
    }

    @RequestMapping("/toAddfx")
    public String toaddFx(){
        return "/Fx/addFx";
    }




    @RequestMapping("/addCgFx")
    @ResponseBody
    public Map<String,Object> addCgfx(FXvo fXvo){
        fXvo.setCostId(UUID.randomUUID().toString().replace("-",""));
        fXvo.setCostWay("cg");
        int insert = costService.insert(fXvo);
        if (fXvo.getCostStair().equals("jt")){
            ladderService.insert(fXvo);
        }
        Map<String,Object> map = new HashMap<>();
        boolean b = true;
        if(insert>=1){
            map.put("success",b);
            map.put("message","添加成功");
        }else{
            b=false;
            map.put("success",b);
            map.put("message","添加失败");
        }
        return map;
       // return null;
    }

    @RequestMapping("/queryCostPage")
    @ResponseBody
    public Map<String,Object> queryCostPage(Cost cost, HttpServletRequest req){
        PageBean pageBean = new PageBean();
        pageBean.setRequest(req);
        List<Cost> costs = costService.queryCostPager(cost,pageBean);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageBean.getTotal());
        map.put("data", costs);
        return map;
    }

}
