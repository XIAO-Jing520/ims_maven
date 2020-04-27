package cn.xiao.identity.dao.InterF;

import cn.xiao.common.dao.BaseDao;
import cn.xiao.common.pager.PageModel;
import cn.xiao.identity.bean.User;

import java.util.List;

public interface RoleDaoI extends BaseDao {
    List<User> selectRoleUser(String id, PageModel pageModel);

    List<User> selectRoleUserNot(String id, PageModel pageModel);
}
