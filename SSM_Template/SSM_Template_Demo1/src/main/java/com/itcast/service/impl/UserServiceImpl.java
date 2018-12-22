package com.itcast.service.impl;

import com.itcast.dao.UserDao;
import com.itcast.domain.User;
import com.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;
    public List<User> findAllUser() {
        return dao.findAllUser();
    }

    public User findUserById(Integer uid) {
        return dao.findUserById(uid);
    }

    public void saveUser(User user) {
        dao.saveUser(user);
    }
}
