package com.itcast.dao;

import com.itcast.domain.Book;
import com.itcast.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from user")
    List<User> findAllUser();

    /**
     * 根据id查询用户
     * @param uid
     * @return
     */
    @Select("select * from user where id = #{uid}")
    User findUserById(Integer uid);

    /**
     * 保存对象
     * @param user
     */
    @Update("insert into user (username,password,phonenumber,email,nickname,money) values(#{username},#{password},#{phonenumber},#{email},#{nickname},0)")
    void saveUser(User user);

}
