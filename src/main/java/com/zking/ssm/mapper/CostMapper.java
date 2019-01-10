package com.zking.ssm.mapper;

import com.zking.ssm.model.fx.Cost;
import com.zking.ssm.vo.FXvo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CostMapper {

    int insert(FXvo record);

    List<Cost> queryCostPager(Cost cost);



}