package cn.xiao.identity.service;


import cn.xiao.identity.bean.Module;
import cn.xiao.identity.bean.User;
import cn.xiao.identity.dao.InterF.ModuleDaoI;
import cn.xiao.identity.service.InterF.ModuleServiceI;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;


@Service
@Transactional
public class ModuleService implements ModuleServiceI {

    @Autowired
    private ModuleDaoI moduleDaoI;

    @Override
    public String ajaxModule() {
        List<Module> modules = moduleDaoI.findModule();
        JSONArray jsonArray = new JSONArray();
        for (Module a : modules) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("code", a.getCode());
            jsonObject.put("vcode", a.getCode().length() == 4 ? "1" : a.getCode().substring(0, a.getCode().length() - 4));
            jsonObject.put("name", a.getName());
            jsonObject.put("url", a.getUrl());
            jsonArray.add(jsonObject);
        }
        return jsonArray.toString();
    }

    @Override
    public List<Module> moduleLoadCode(String code) {
        List<Module> modules = moduleDaoI.moduleLoadCode(code);
        return modules;

    }
    //查找最大的code
    @Override
    public List<Module> moduleLoad(String code) {
        List<Module> modules = moduleDaoI.moduleLoad(code);

        return modules;

    }

    @Override
    public void addModule(Module module, HttpSession session, String maxCode) {
        module.setCreateDate(new Date());
        module.setCode(maxCode);
        module.setCreater((User) session.getAttribute("user_session"));
        module.setDelFlag(1);
        moduleDaoI.save(module);


    }

    @Override
    public void deleteModule(String[] moduleIds) {

        for ( String m:moduleIds ) {
            Module module=moduleDaoI.get(Module.class,m);
            module.setDelFlag(0);
        }
    }

    @Override
    public void updateModule(Module module, HttpSession session) {
        Module module1=moduleDaoI.get(Module.class,module.getCode());
        module1.setModifier((User) session.getAttribute("user_session"));
        module1.setName(module.getName());
        module1.setModifyDate(new Date());
        module1.setRemark(module.getRemark());
        module1.setUrl(module.getUrl());

    }

    @Override
    public Module findModule(String code) {
        return moduleDaoI.get(Module.class,code);
    }



}
