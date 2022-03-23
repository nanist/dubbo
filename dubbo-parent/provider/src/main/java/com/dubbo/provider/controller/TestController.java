package com.dubbo.provider.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.common.util.StringUtil;
import com.dubbo.entity.User;
import com.dubbo.provider.service.UserServiceImpl;
import com.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : lgn
 * @date : 2022/3/23
 */
@RestController
public class TestController {

//    @Resource
//    UserService userService;
//
//    @RequestMapping("/hello")
//    public String test(){
////        String s = "stss";
////        System.out.println("-----66-"+ StringUtil.isEmpty(s));
//
//        User user = new User();
//        user.setName("provide--");
//        return "hello"+userService.getName(user);
//    }


}
