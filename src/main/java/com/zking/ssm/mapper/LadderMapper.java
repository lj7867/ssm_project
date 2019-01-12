package com.zking.ssm.mapper;

import com.zking.ssm.controller.FxController;
import com.zking.ssm.model.fx.Ladder;
import com.zking.ssm.vo.FXvo;
import org.springframework.stereotype.Repository;

@Repository
public interface LadderMapper {

    int insert(FXvo record);

    int editLadder(FXvo fXvo);

    int delLadder(FXvo fXvo);


}