package cn.xiao.hrm.dao;

import cn.xiao.common.dao.BaseDaoImpl;
import cn.xiao.hrm.dao.InterF.DeptDaoI;
import cn.xiao.hrm.dao.InterF.JobDaoI;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class JobDao extends BaseDaoImpl implements JobDaoI {
    @Override
    public List<Map<Integer, String>> getDeptAndJob() {

        String hql="select new Map(code as code,name as name) from Job";
        List <Map<Integer,String>> jobs=find(hql);

        return jobs;
    }
}
