package cn.xiao.hrm.dao.InterF;

import cn.xiao.common.dao.BaseDao;

import java.util.List;
import java.util.Map;

public interface JobDaoI extends BaseDao {
    List<Map<Integer, String>> getDeptAndJob();
}
