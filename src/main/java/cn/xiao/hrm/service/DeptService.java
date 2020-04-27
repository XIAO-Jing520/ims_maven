package cn.xiao.hrm.service;

import cn.xiao.hrm.dao.InterF.DeptDaoI;
import cn.xiao.hrm.dao.InterF.JobDaoI;
import cn.xiao.hrm.service.InterF.DeptServiceI;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class DeptService implements DeptServiceI {

    @Autowired
    private DeptDaoI deptDaoI;
    @Autowired
    private JobDaoI jobDaoI;

    @Override
    public String getDeptAndJob() {

        List<Map<Integer, String>> jobs = jobDaoI.getDeptAndJob();
        List<Map<Integer, String>> depts = deptDaoI.getDeptAndJob();

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("depts",depts);
        jsonObject.put("jobs",jobs);
        return jsonObject.toString();
    }
}
