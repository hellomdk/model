package com.hpe.service;

import com.hpe.pojo.User;

import java.util.List;


public interface UserService {
    /**
     * 查看所有
     * @param user
     * @return
     */
    List<User> selectAll(User user);



}

