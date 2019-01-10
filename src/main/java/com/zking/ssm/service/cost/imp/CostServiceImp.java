package com.zking.ssm.service.cost.imp;

import com.zking.ssm.mapper.CostMapper;
import com.zking.ssm.mapper.LadderMapper;
import com.zking.ssm.model.fx.Cost;
import com.zking.ssm.model.fx.Ladder;
import com.zking.ssm.service.cost.CostService;
import com.zking.ssm.vo.FXvo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class CostServiceImp implements CostService {
    @Autowired
    private CostMapper costMapper;

    @Transactional(readOnly = false)
    @Override
    public int insert(FXvo record) {

        return costMapper.insert(record);
    }

}

