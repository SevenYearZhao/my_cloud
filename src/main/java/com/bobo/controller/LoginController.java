package com.bobo.controller;

import com.alibaba.fastjson.JSONObject;
import com.bobo.bean.base.TblRole;
import com.bobo.json.Common;
import com.bobo.bean.base.TblUserRecord;
import com.bobo.json.Permission;
import com.bobo.json.Permissions;
import com.bobo.json.UserInfo;
import com.bobo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bobo
 * @date 2020-09-07
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/auth/login")
    public JSONObject login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session) {
        System.out.println(username + " ----> " + password);
        TblUserRecord userRecord = loginService.login(username, password);
        System.out.println(userRecord);
        userRecord.setToken(userRecord.getUserName());
        session.setAttribute("record", userRecord);
        Common common = new Common(userRecord);
        System.out.println(common);
        return JSONObject.parseObject(JSONObject.toJSONString(common));
    }

    @RequestMapping("/auth/2step-code")
    public String other() {
        System.out.println("/auth/2step-code");
        return "success";
    }

    @RequestMapping("/users/info")
    public JSONObject userInfo(HttpSession session) {
        TblUserRecord userRecord = (TblUserRecord) session.getAttribute("record");
        TblRole tblRole = userRecord.getTblRole();
        String[] split = tblRole.getRolePrivileges().split("-");
        List<Permission> permissionList = new ArrayList<>(split.length);
        for (String s : split) {
            permissionList.add(new Permission(s));
        }
        Permissions permissions = new Permissions();
        permissions.setPermissions(permissionList);

        UserInfo userInfo = new UserInfo(userRecord.getUserName(), permissions);
        Common common = new Common(userInfo);
        return JSONObject.parseObject(JSONObject.toJSONString(common));
    }

    @RequestMapping("/auth/logout")
    public JSONObject loginOut(HttpSession session) {
        System.out.println("loginOut");
        session.invalidate();
        return JSONObject.parseObject(JSONObject.toJSONString(new Common(null)));
    }

    @RequestMapping("/test")
    public String test() {
        System.out.println("test 波波 哈哈");
        return "success 波波 nice";
    }
}
