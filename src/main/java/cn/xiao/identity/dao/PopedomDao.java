package cn.xiao.identity.dao;

import cn.xiao.common.dao.BaseDaoImpl;
import cn.xiao.identity.bean.Module;
import cn.xiao.identity.bean.Popedom;
import cn.xiao.identity.bean.Role;
import cn.xiao.identity.bean.User;
import cn.xiao.identity.dao.InterF.ModuleDaoI;
import cn.xiao.identity.dao.InterF.PopedomDaoI;
import cn.xiao.identity.service.InterF.PopedomServiceI;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Repository
public class PopedomDao extends BaseDaoImpl implements PopedomDaoI {
    //加载三级模块
    @Override
    public List<Module> loadThirdModule(String code) {
        System.out.println("loadThirdModuleDAO***************************************************************");
        String hql = "from Module where code like ? and length(code)=?";
        List<Module> modules = (List<Module>) find(hql, new Object[]{code + "%", code.length() + 4});
        return modules;
    }

    //绑定操作权限
    @Override
    public void bindPopedom(String[] arr, String roleId, HttpSession session) {

        Set<Popedom> popedomLists = new HashSet<>();
        Set<Popedom> popedomLists2 = new HashSet<>();
        //清空权限
        String hql = "";
        for (String b : arr) {
            List<Popedom> popedomList = (List<Popedom>) find("from Popedom where role.id=? and opera.code=?", new Object[]{Long.valueOf(roleId), b});
            deleteAll(popedomList);
        }
        //绑定权限
        for (String a : arr) {
            Popedom popedom = new Popedom();
            popedom.setCreateDate(new Date());
            popedom.setCreater((User) session.getAttribute("user_session"));
            Role role = get(Role.class, Long.valueOf(roleId));
            popedom.setRole(role);
            popedom.setOpera(get(Module.class, a));
            String strCode = a.substring(0, a.length() - 4);
            popedom.setModule(get(Module.class, strCode));
            popedomLists.add(popedom);
        }
        this.saveAll(popedomLists);


    }

    @Override
    public List<String> selectCode(String moduleCode, Long id) {
        return (List<String>) find("SELECT opera.code from Popedom where role.id=? and module.id=?", new Object[]{id, moduleCode});


    }

    //根据用户id获取该操作权限
    @Override
    public List<String> getUserMenuOperas(String userId) {
        //创建 StringBuffer 对象，用于拼接hql语句
        StringBuffer hql = new StringBuffer();
        hql.append("select distinct module.code from Popedom where role.id in (");
        //通过子查询获取当前用户拥有哪些角色  查询用户与角色的中间表
        hql.append(" select  r.id  from Role r inner join r.users u where u.userId = ? ) order by module.code asc");
        return (List<String>) this.find(hql.toString(), new String[]{userId});
    }

    //根据二级模块code获取模块对象信息
    @Override
    public Module getModuleByCode(String seCode) {
        String hql = "from Module where delFlag ='1' and code = ?";

        return this.findUniqueEntity(hql, seCode);
    }

    //获取用户操作权限
    @Override
    public List<String> findOperas(String userId) {
        String hql = "select distinct opera.code from Popedom where role.id in (select  r.id  from Role r inner join r.users u where u.userId = ? )";
        return (List<String>) this.find(hql, new Object[]{userId});
    }


}
