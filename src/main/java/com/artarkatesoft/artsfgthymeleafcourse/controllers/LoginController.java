package com.artarkatesoft.artsfgthymeleafcourse.controllers;

import com.artarkatesoft.artsfgthymeleafcourse.commands.LoginCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class LoginController {
    @RequestMapping("login")
    public String getLoginForm(Model model) {
        model.addAttribute("loginCommand", new LoginCommand());
        return "login_form";
    }

    @RequestMapping("logout-success")
    public String yourLoggedOut() {
        return "logout-success";
    }

    @GetMapping("secured")
    public String secured() {
        return "secured";
    }

    //    @PostMapping
    public String doLogin(@Valid LoginCommand loginCommand, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "login_form";
        return "login_success";
    }
}
