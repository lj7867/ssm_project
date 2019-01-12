package com.zking.ssm.service.cost;

import com.zking.ssm.vo.FXvo;
import org.springframework.stereotype.Repository;

public interface LadderService {

    int insert(FXvo record);

    int editLadder(FXvo fXvo);

    int delLadder(FXvo fXvo);

}