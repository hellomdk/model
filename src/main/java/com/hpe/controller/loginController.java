package com.hpe.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.hpe.pojo.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class loginController {
    private static Map<String, UserInfo> usersMap=new HashMap<String, UserInfo>();
    @RequestMapping("/login")
    public String login(UserInfo user,HttpServletRequest req){
        usersMap.put(user.getName(), user);
        req.getSession().setAttribute("user", user);
        req.getSession().setAttribute("usersMap", usersMap);
        return "main";
    }
}
