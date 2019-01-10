package com.zking.ssm.mapper;

import com.zking.ssm.model.dict.Dict;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DictMapper {

    List<Dict> queryDict(Dict dict);
}