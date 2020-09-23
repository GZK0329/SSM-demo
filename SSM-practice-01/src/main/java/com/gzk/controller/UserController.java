package com.gzk.controller;

import com.gzk.entity.User;
import com.gzk.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/getUser")
    public String getUser(Model model){
        int id = 1;
        User user = this.userService.getUserById(id);
        model.addAttribute("user",user);
        return "index";
    }
}
