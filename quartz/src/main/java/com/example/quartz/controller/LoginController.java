package com.example.quartz.controller;


import com.example.quartz.dao.SportsRepository;
import com.example.quartz.entity.SportsUser;
import com.example.quartz.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping()
public class LoginController {
    @Resource
    private LoginService loginService;

    @Resource
    private SportsRepository sportsRepository;

    @RequestMapping(value = "/Sports")
    public String show(HttpServletRequest request, ModelMap modelMap) {
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        SportsUser sportsUser = loginService.check(account,password);
        modelMap.addAttribute("sportsUser",sportsUser);
        modelMap.addAttribute("userStep",sportsRepository.findUser(account));
        modelMap.addAttribute("sports",sportsRepository.find());
        return "home";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

}
