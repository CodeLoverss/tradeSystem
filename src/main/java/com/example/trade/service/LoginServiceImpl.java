package com.example.trade.service;


import com.example.trade.mapper.LoginMapper;
import com.example.trade.provider.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    LoginMapper loginMapper;
    @Override
    public User login(User user) {
        if(loginMapper.login(user)!=null){
            return user;
        }
        else return null;
    }
}
