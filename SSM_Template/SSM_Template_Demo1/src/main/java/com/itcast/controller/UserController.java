package com.itcast.controller;

import com.itcast.domain.User;
import com.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller("userController")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAllUser")
    public String findAll(Model model){
        List<User> allUser = userService.findAllUser();
        model.addAttribute("allUser",allUser);
        return "allUser";
    }

    @RequestMapping("/findUserById")
    public String findUserById(Integer id,Model model){
        User user = userService.findUserById(id);
        model.addAttribute("user",user);
        return "show";
    }

    @RequestMapping("/saveUser")
    public void seveUser(User user, HttpServletResponse response, HttpServletRequest request) throws IOException {
        userService.saveUser(user);
        request.getSession().setAttribute("id",user.getId());
        response.sendRedirect(request.getContextPath()+"/user/findUserById");
    }
}
