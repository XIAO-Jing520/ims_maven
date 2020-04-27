package cn.xiao.common.subStringStr;

import cn.xiao.identity.bean.Module;

import java.util.List;

public class SubStringUtils {
    public static String subStr(List<Module> modules){
        int max = 0;
        int len = 0;
        String banStr="";
        String maxCode = "";
        for (Module m : modules) {
            if (Integer.valueOf(m.getCode()) > max) {
                maxCode = m.getCode();
            }
        }
        int  maxId = Integer.valueOf(maxCode.substring(maxCode.length()-2,maxCode.length()))+1;

        if (maxCode.length() == 4) {
            if (maxId > 10) {
                banStr = "00" + maxId;

            } else {
                banStr = "000" + maxId;
            }
        } else if (maxCode.length() == 8) {
            if (maxId > 10) {
                banStr = maxCode.substring(0, 6) + maxId;
            } else {
                banStr = maxCode.substring(0, 7) + maxId;

            }
        } else {
            if (maxId > 10) {
                banStr = maxCode.substring(0, 10) + maxId;
            } else {
                banStr = maxCode.substring(0, 11) + maxId;

            }
        }
        return banStr;
    }
}
