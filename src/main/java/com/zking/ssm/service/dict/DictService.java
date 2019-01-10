package com.zking.ssm.service.dict;

import com.zking.ssm.model.dict.Dict;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface DictService {

    List<Dict> queryDict(Dict dict);
}