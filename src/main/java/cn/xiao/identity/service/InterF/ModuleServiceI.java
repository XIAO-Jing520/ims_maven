package cn.xiao.identity.service.InterF;


import cn.xiao.identity.bean.Module;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface ModuleServiceI {


    String ajaxModule();

    List<Module> moduleLoad(String code);

    List<Module> moduleLoadCode(String code);

    void addModule(Module module, HttpSession session, String maxCode);

    void deleteModule(String[] moduleIds);

    void updateModule(Module module, HttpSession session);

    Module findModule(String code);


}
