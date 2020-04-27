package cn.xiao.identity.controller;

import cn.xiao.identity.bean.Module;
import cn.xiao.identity.bean.Role;
import cn.xiao.identity.bean.User;
import cn.xiao.identity.service.InterF.ModuleServiceI;
import cn.xiao.identity.service.InterF.PopedomServiceI;
import cn.xiao.identity.service.InterF.RoleServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@RequestMapping("/identity")
@Controller
public class PopedomController {


    @Autowired
    private PopedomServiceI popedomServiceI;
    //进入绑定操作界面
    @RequestMapping("/role/mgrPopedom")
    public String mgrPopedom(Role role, Model model) {

        System.out.println(role.getId()+"                        "+role.getName());
        model.addAttribute("role", role);
        return "/identity/role/bindPopedom/mgrPopedom";
    }
    //加载三级模块
    @RequestMapping("/role/loadThirdModule.action")
    public String loadThirdModule(Role role, Model model,String moduleCode,String moduleCodeName,Module module) {
        System.out.println("loadThirdModule" + "=------------------------------------");
        System.out.println(role.getId()+"                        "+role.getName());
        List<Module> modules=popedomServiceI.loadThirdModule(moduleCode);
        //查看选中的权限
        List<String> selectCodes=popedomServiceI.selectCode(moduleCode,role.getId());
        System.out.println(selectCodes.toString());
        model.addAttribute("modules",modules);
        model.addAttribute("moduleCodeName",moduleCodeName);
        model.addAttribute("moduleCode",moduleCode);
        model.addAttribute("selectCodes",selectCodes);
        return "/identity/role/bindPopedom/operas";
    }
    //bindPopedom绑定权限
    @RequestMapping("/role/bindPopedom.action")
    public String bindPopedom(String[] arrCodes, Model model, Role role, HttpSession session,String moduleCode,String moduleCodeName) {

        System.out.println("进入bindPopedom------------------------------------------------");
        System.out.println("arr.toString()------------------------------------------------");
        for ( String a:arrCodes  ) {
            System.out.println(a);
        }
        popedomServiceI.bindPopedom(arrCodes, String.valueOf(role.getId()),session);
        model.addAttribute("message","绑定成功");
        model.addAttribute("moduleCodeName",moduleCodeName);
        model.addAttribute("moduleCode",moduleCode);
        model.addAttribute("role",role);
        return "forward:/identity/role/loadThirdModule.action";
    }
}
