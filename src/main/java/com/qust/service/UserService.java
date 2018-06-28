package com.qust.service;

import com.qust.mapper.UserMapper;
import com.qust.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/6/22 0022.
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User findByUserName(String name){
        User user = null;
        try{
            user = userMapper.findByUserName(name);
        }catch (Exception e){}
        return user;
    }
}
