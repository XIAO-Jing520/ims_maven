package cn.xiao.identity.service.InterF;


import cn.xiao.identity.bean.Module;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

public interface PopedomServiceI {

    List<Module> loadThirdModule(String code);
    public void bindPopedom(String[] arr, String roleId, HttpSession session);

    List<String> selectCode(String moduleCode, Long id);
    //根据用户id获取该用户拥有哪些操作权限
    Map<Module, List<Module>> getUserMenuOperas(String userId);

    //获取用户操作权限
    List<String> findOperas(String userId);
}
