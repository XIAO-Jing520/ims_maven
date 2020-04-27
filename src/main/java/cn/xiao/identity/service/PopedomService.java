package cn.xiao.identity.service;


import cn.xiao.identity.bean.Module;
import cn.xiao.identity.dao.InterF.PopedomDaoI;
import cn.xiao.identity.service.InterF.PopedomServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


@Service
@Transactional
public class PopedomService implements PopedomServiceI {

    @Autowired
    private PopedomDaoI popedomDaoI;


    //绑定操作权限
    @Override
    public void bindPopedom(String[] arr, String roleId, HttpSession session) {
        popedomDaoI.bindPopedom( arr,  roleId,  session);

    }

    @Override
    public List<String> selectCode(String moduleCode, Long id) {
      return popedomDaoI.selectCode(moduleCode,id);
    }

    //绑定操作，加载三级模块
    @Override
    public List<Module> loadThirdModule(String code) {

        return popedomDaoI.loadThirdModule(code);
    }
    //根据用户id获取该用户拥有哪些操作权限
    @Override
    public Map<Module, List<Module>> getUserMenuOperas(String userId) {
        //获取用户的权限信息
        List<String> operas = popedomDaoI.getUserMenuOperas(userId);
        System.out.println("operas:"+operas);
        Map<Module, List<Module>> maps = new LinkedHashMap<>();
        //创建List集合用于封装  map集合的value信息
        List<Module> modules = null;
        //遍历获取到的二级模块信息
        for(int i=0;i<operas.size();i++) {
            //获取二级模块code
            String seCode = operas.get(i);
            //根据二级模块code获取模块对象信息
            Module seModule = popedomDaoI.getModuleByCode(seCode);
            if(seModule == null) {
                continue;
            }
            //根据二级模块code获取一级模块信息
            String fcode = seCode.substring(0, 4);
            System.out.println("fcode;"+fcode);
            //根据一级模块获取模块对象
            Module firstModule = popedomDaoI.get(Module.class, fcode);
            if(!maps.containsKey(firstModule)) {
                //常见集合用于封装二级模块信息
                modules = new ArrayList<Module>();
                maps.put(firstModule, modules);
            }
            modules.add(seModule);
        }

        return maps;
    }

    //获取用户操作权限
    @Override
    public List<String> findOperas(String userId) {
        List<String> operasCodes = popedomDaoI.findOperas(userId);
        List<String> operasUrl = new ArrayList<>();
        for(int i=0;i<operasCodes.size();i++) {
            Module module = popedomDaoI.getModuleByCode(operasCodes.get(i));
            if(module == null) {
                continue;
            }
            operasUrl.add(module.getUrl());
        }
        return operasUrl;
    }


}
