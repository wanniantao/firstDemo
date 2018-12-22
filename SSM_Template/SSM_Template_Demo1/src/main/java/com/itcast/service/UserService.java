package com.itcast.service;

import com.itcast.domain.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAllUser();

    /**
     * 根据id查询用户
     * @param uid
     * @return
     */
    User findUserById(Integer uid);

    /**
     * 保存对象
     * @param user
     */
    void saveUser(User user);

}
