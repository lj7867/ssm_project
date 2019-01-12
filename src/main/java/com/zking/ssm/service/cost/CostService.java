package com.zking.ssm.service.cost;

import com.github.pagehelper.Page;
import com.zking.ssm.model.fx.Cost;
import com.zking.ssm.util.PageBean;
import com.zking.ssm.vo.FXvo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface CostService {

    int insert(FXvo record);

    List<Map<String,Object>> queryCostPager(Cost cost, PageBean pageBean);

    Map<String,Object> querySimgleCost(Cost cost);

    int editCgFx(FXvo fXvo);
}