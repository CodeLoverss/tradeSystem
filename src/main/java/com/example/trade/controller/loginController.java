package com.example.trade.controller;


import com.example.trade.provider.User;
import com.example.trade.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {

    @Autowired
    loginService loginService;

    @RequestMapping("loginAct")
    public String login(User user,Model model){
        if(loginService.login(user)!=null){
            return "index";
        }
        else {
            model.addAttribute("loginError",true);
            return "login";
        }

    }
}
