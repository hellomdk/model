//package com.hpe.controller;
//
//import com.alibaba.fastjson.JSONObject;
//import com.hpe.pojo.User;
//import com.hpe.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("user")
//public class UserController {
//    @Autowired
//    private UserService userService;
//
//    @ResponseBody
//    @RequestMapping("/selectAll")
//    public String selectAll(User user){
//        JSONObject json = new JSONObject();
//        List<User> list =userService.selectAll(user);
//        json.put("name",list);
//
//        return json.toString();
//    }
//
//
//}
//
