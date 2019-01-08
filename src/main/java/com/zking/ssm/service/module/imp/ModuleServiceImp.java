package com.zking.ssm.service.module.imp;

import com.zking.ssm.mapper.ModuleMapper;
import com.zking.ssm.model.module.Module;
import com.zking.ssm.service.module.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ModuleServiceImp implements ModuleService {

    @Autowired
    private ModuleMapper moduleMapper;

    @Transactional(readOnly = true)
    @Override
    public List<Module> initModule(Module module) {

        return moduleMapper.initModule(module);
    }
}
