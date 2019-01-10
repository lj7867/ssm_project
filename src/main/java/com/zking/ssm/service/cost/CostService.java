package com.zking.ssm.service.cost;

import com.github.pagehelper.Page;
import com.zking.ssm.model.fx.Cost;
import com.zking.ssm.util.PageBean;
import com.zking.ssm.vo.FXvo;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CostService {

    int insert(FXvo record);
    List<Cost> queryCostPager(Cost cost, PageBean pageBean);

}