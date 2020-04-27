package cn.xiao.identity.dao;

import java.util.List;

import cn.xiao.common.dao.BaseDaoImpl;
import cn.xiao.identity.bean.Module;
import cn.xiao.identity.dao.InterF.ModuleDaoI;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Repository;


@Repository
public class ModuleDao extends BaseDaoImpl implements ModuleDaoI {


    @Override
    public List<Module> findModule() {
        String hql = "from Module where delFlag='1'";
        return find(hql);
    }

    @Override
    public List<Module> moduleLoad(String code) {

        String hql = "from Module where delFlag='1' and code like? and length(code)=?";
        if (StringUtils.isEmpty(code)) {
            return (List<Module>) find(hql, new Object[]{"%", 4});
        }
        return (List<Module>) find(hql, new Object[]{code + "%", code.length() == 12 ? 12 : code.length() + 4});


    }

    @Override
    public List<Module> moduleLoadCode(String code) {

        String hql = "from Module where  code like? and length(code)=?";
        if (StringUtils.isEmpty(code)) {
            return (List<Module>) find(hql, new Object[]{"%", 4});
        }
        return (List<Module>) find(hql, new Object[]{code.length() == 12 ? code.substring(0, 8) + "%" : code + "%", code.length() == 12 ? 12 : code.length() + 4});


    }

    @Override
    public void deleteModule(Module m) {


    }



}
