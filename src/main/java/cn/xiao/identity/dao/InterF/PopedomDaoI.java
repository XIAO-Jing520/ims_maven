package cn.xiao.identity.dao.InterF;

import cn.xiao.common.dao.BaseDao;
import cn.xiao.identity.bean.Module;

import javax.servlet.http.HttpSession;
import java.util.List;


public interface PopedomDaoI extends BaseDao  {

    List<Module> loadThirdModule(String code);

    void bindPopedom(String[] arr, String roleId, HttpSession session);

    List<String> selectCode(String moduleCode, Long id);

    List<String> getUserMenuOperas(String userId);

    Module getModuleByCode(String seCode);

    List<String> findOperas(String userId);
}
