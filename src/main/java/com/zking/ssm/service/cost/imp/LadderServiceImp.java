package com.zking.ssm.service.cost.imp;

import com.zking.ssm.mapper.LadderMapper;
import com.zking.ssm.service.cost.LadderService;
import com.zking.ssm.vo.FXvo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LadderServiceImp implements LadderService {
    @Autowired
    private LadderMapper ladderMapper;

    @Override
    public int insert(FXvo record) {
        return ladderMapper.insert(record);
    }
}
