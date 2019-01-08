package com.zking.ssm.mapper;

import com.zking.ssm.model.module.Module;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

@Repository
public interface ModuleMapper {
    List<Module> initModule(Module module);
    List<Module> initModule2(Module module);
}