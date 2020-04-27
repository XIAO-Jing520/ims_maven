package cn.xiao.hrm.dao;

import cn.xiao.common.dao.BaseDaoImpl;
import cn.xiao.hrm.dao.InterF.DeptDaoI;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class DeptDao extends BaseDaoImpl implements DeptDaoI  {
    @Override
    public List<Map<Integer, String>> getDeptAndJob() {

        String hql="select new Map(id as id, name as name) from Dept";
        List <Map<Integer,String>> depts=find(hql);

        return depts;

    }
}
