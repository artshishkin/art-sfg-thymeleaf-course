package com.artarkatesoft.artsfgthymeleafcourse.controllers;

import com.artarkatesoft.artsfgthymeleafcourse.commands.LoginCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("login")
public class LoginController {
    @GetMapping
    public String getLoginForm(Model model) {
        model.addAttribute("loginCommand", new LoginCommand());
        return "login_form";
    }

    @PostMapping
    public String doLogin(@Valid LoginCommand loginCommand, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "login_form";
        return "login_success";
    }
}
