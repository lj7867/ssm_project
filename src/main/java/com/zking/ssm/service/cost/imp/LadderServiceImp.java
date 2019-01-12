package com.zking.ssm.service.cost.imp;

import com.zking.ssm.mapper.LadderMapper;
import com.zking.ssm.service.cost.LadderService;
import com.zking.ssm.vo.FXvo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LadderServiceImp implements LadderService {
    @Autowired
    private LadderMapper ladderMapper;

    @Transactional(readOnly = false)
    @Override
    public int insert(FXvo record) {
        return ladderMapper.insert(record);
    }

    @Transactional(readOnly = false)
    @Override
    public int editLadder(FXvo fXvo) {
        return ladderMapper.editLadder(fXvo);
    }

    @Transactional(readOnly = false)
    @Override
    public int delLadder(FXvo fXvo) {
        return ladderMapper.delLadder(fXvo);
    }
}
