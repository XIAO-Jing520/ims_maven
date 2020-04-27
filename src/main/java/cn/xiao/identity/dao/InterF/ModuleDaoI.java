package cn.xiao.identity.dao.InterF;

import java.util.List;

import cn.xiao.common.dao.BaseDao;
import cn.xiao.identity.bean.Module;


public interface ModuleDaoI extends BaseDao  {


    List<Module> findModule();

    List<Module> moduleLoad(String code);
    List<Module> moduleLoadCode(String code);
    void deleteModule(Module m);


}
