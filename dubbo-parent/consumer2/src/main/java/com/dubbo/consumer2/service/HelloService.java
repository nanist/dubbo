package com.dubbo.consumer2.service;

/**
 * @author : lgn
 * @date : 2022/3/23
 */
import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.entity.User;
import com.dubbo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service                                //spring的Service注解
public class HelloService {
    @Reference                          //这里是dubbo的注解
    UserService userService;

    public String login(User u){
        return userService.getName(u);
    }
}

