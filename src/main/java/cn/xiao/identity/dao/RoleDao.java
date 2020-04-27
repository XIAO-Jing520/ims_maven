package cn.xiao.identity.dao;


import cn.xiao.common.dao.BaseDaoImpl;

import cn.xiao.common.pager.PageModel;
import cn.xiao.identity.bean.User;
import cn.xiao.identity.dao.InterF.RoleDaoI;

import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class RoleDao extends BaseDaoImpl implements RoleDaoI {

    @Override
    public List<User> selectRoleUser(String id, PageModel pageModel) {
        String hql="select u from User u inner join u.roles r where u.delFlag = '1' and r.id = "+Integer.valueOf(id);
        return findByPage(hql,pageModel,null);
    }

    @Override
    public List<User> selectRoleUserNot(String id, PageModel pageModel) {
        StringBuffer hql = new StringBuffer();
        hql.append("select u from User u  where u.delFlag = '1' and u.userId  not in(");
        //获取角色已经绑定了哪些用户id
        hql.append("select u.userId from User u inner join u.roles r where u.delFlag = '1' and r.id = "+Integer.valueOf(id)+")");
        return this.findByPage(hql.toString(), pageModel, null);
    }
    }

