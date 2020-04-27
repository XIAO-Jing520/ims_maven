package cn.xiao.identity.controller;


import cn.xiao.common.subStringStr.SubStringUtils;
import cn.xiao.identity.bean.Module;
import cn.xiao.identity.bean.Role;
import cn.xiao.identity.service.InterF.ModuleServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;


//模块管理
@Controller
@RequestMapping("/identity/module")
public class ModuleController {

    @Autowired
    private ModuleServiceI moduleService;

    //加载模块管理主界面
    @RequestMapping(value = "/mgrModule")
    public String mainModule(Model model) {

        List<Module> modules = moduleService.moduleLoad("");
        model.addAttribute("modules", modules);
        return "identity/module/mgrModule";
    }

    //树形插件异步请求
    @ResponseBody
    @RequestMapping(value = "/ModuleAjax", produces = {"application/json;charset=utf-8"})
    public String moduleAjax() {
        String jsonS = moduleService.ajaxModule();
        System.out.println(jsonS);
        return jsonS;
    }

    //树形插件对应的信息
    @RequestMapping(value = "/moduleLoad.action")
    public String moduleLoad(Model model, String code) {
        System.out.println(code+"/////////////////////////////////////////////////////////////////////");
        List<Module> modules = moduleService.moduleLoad(code);
        //查找做大的code
        List<Module> modules2 = moduleService.moduleLoadCode(code);
        String banStr = SubStringUtils.subStr(modules2);

        model.addAttribute("maxCode", banStr);
        model.addAttribute("modules", modules);
        return "identity/module/module";
    }

    //进入添加模块界面
    @RequestMapping("/addModule")
    public String addModule(Model model, String maxCode) {

        model.addAttribute("maxCode", maxCode);
        return "/identity/module/addModule";
    }

    //添加模块
    @RequestMapping("/addModule.action")
    public String addModuleOption(Module module, HttpSession session, Model model, @RequestParam("maxCode") String maxCode) {

        moduleService.addModule(module, session, maxCode);
        model.addAttribute("message", "添加模块成功");
        return "/identity/module/addModule";
    }

    //删除模块
    @RequestMapping("/deleteModule.action")
    public String deleteRole(@RequestParam("moduleIds") String[] moduleIds, Model model) {
        System.out.println(Arrays.toString(moduleIds));
        moduleService.deleteModule(moduleIds);
        model.addAttribute("message", "删除模块成功");
        return "forward:/identity/module/moduleLoad.action";
    }

    //进入修改模块界面
    @RequestMapping("/updateModule")
    public String updateModule(String code, Model model) {

        Module module = moduleService.findModule(code);
        model.addAttribute("module", module);
        return "/identity/module/updateModule";

    }

    //修改模块
    @RequestMapping("/updateModule.action")
    public String updateModuleOption(Module module, Model model, HttpSession session) {

        moduleService.updateModule(module, session);
        model.addAttribute("message", "修改模块成功");
        return "/identity/module/updateModule";

    }
}
