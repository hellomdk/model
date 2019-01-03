package com.hpe.service.impl;

import com.hpe.Mapper.UserMapper;
import com.hpe.pojo.User;
import com.hpe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll(User user) {
        List list=null;
        try{
            list=userMapper.select(null);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
