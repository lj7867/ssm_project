package com.zking.ssm.service.dict.imp;

import com.zking.ssm.mapper.DictMapper;
import com.zking.ssm.model.dict.Dict;
import com.zking.ssm.service.dict.DictService;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DictServiceImp implements DictService {

    @Autowired
    private DictMapper dictMapper;

    @Transactional(readOnly = true)
    @Override
    public List<Dict> queryDict(Dict dict) {
        return dictMapper.queryDict(dict);
    }
}
