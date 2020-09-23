package com.gzk.service;

import com.gzk.dao.UserDao;
import com.gzk.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("UserService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;
    public User getUserById(int id){
        return userDao.getUserById(id);
    }
}
