package com.zking.ssm.mapper;

import com.zking.ssm.model.fx.Cost;
import com.zking.ssm.vo.FXvo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CostMapper {

    int insert(FXvo record);

    List<Map<String,Object>> queryCostPager(Cost cost);

    Map<String,Object> querySimgleCost(Cost cost);

    int editCgFx(FXvo fXvo);





}