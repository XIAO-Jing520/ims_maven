package cn.xiao.hrm.controller;

import cn.xiao.hrm.service.InterF.DeptServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/hrm")
public class DeptController {

    @Autowired
    private DeptServiceI deptServiceI;

    @ResponseBody
    @RequestMapping(value = "/getDeptAndJobs",produces = {"application/json;charset=utf-8"})
    public String getDeptAndJobs() {
        System.out.println("getDeptAndJobs==============================");
        String deptServiceIDeptAndJob = deptServiceI.getDeptAndJob();
        System.out.println(deptServiceIDeptAndJob);
        return deptServiceIDeptAndJob;
    }
}
