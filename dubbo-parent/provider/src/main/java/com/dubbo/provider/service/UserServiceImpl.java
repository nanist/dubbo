package com.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.entity.User;
import com.dubbo.service.UserService;

import java.util.Date;

/**
 * @author : lgn
 * @date : 2022/3/23
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName(User user) {
        user.setDate(new Date());
        return "provide1--"+user;
    }
}
