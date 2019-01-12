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

    @RequestMapping("/toSetfx")
    public String tosetFx(){
        return "/Fx/setFx";
    }

    @RequestMapping("/toAddGtfx")
    public String toaddGtFx(){
        return "/Fx/addGtFx";
    }


    @RequestMapping("/addCgFx")
    @ResponseBody
    public Map<String,Object> addCgfx(FXvo fXvo){
        fXvo.setCostId(UUID.randomUUID().toString().replace("-",""));

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

        System.out.println(cost.getCostWay()+"费项");
        List<Map<String,Object>> costs = costService.queryCostPager(cost,pageBean);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageBean.getTotal());
        map.put("data", costs);
        return map;
    }


    @RequestMapping("/querySingleCost")
    @ResponseBody
    public Map<String,Object> querySingleCost(Cost cost){
        String costId = cost.getCostId();
        //System.out.println("id"+costId);
        Map<String, Object> map = costService.querySimgleCost(cost);
        return map;
    }

    @RequestMapping("/editCgFx")
    @ResponseBody
    public Map<String,Object> editCgfx(FXvo fXvo){
        Cost cost = new Cost();
        cost.setCostId(fXvo.getCostId());
        Map<String, Object> maps = costService.querySimgleCost(cost);

        int insert = costService.editCgFx(fXvo);

        System.out.println("lee==="+fXvo.getLee());

        /*
        * jt=jt dj=jt
        * jt=dj
        * */



        if(!maps.get("cost_stair").toString().equals(fXvo.getCostStair())
                && fXvo.getCostStair().equals("jt")){
                //改为阶梯计算
            System.out.println("改为阶梯计算");
            ladderService.insert(fXvo);
        }
        if(maps.get("cost_stair").toString().equals("jt") && fXvo.getCostStair().equals("jt")){
            //改为阶梯计算
            System.out.println("直接修改阶梯计算");
            ladderService.editLadder(fXvo);
        }
        if(!maps.get("cost_stair").toString().equals(fXvo.getCostStair())
                && fXvo.getCostStair().equals("dj")){
            System.out.println("删除阶梯价格，改为单价计算");
                //删除阶梯价格，改为单价计算
            ladderService.delLadder(fXvo);
        }

        Map<String,Object> map = new HashMap<>();
        boolean b = true;
        if(insert>=1){
            map.put("success",b);
            map.put("message","修改成功");
        }else{
            b=false;
            map.put("success",b);
            map.put("message","修改失败");
        }
        return map;
        // return null;
    }

}
