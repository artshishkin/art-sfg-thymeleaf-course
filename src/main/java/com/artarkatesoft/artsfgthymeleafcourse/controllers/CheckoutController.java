package com.artarkatesoft.artsfgthymeleafcourse.controllers;

import com.artarkatesoft.artsfgthymeleafcourse.commands.CheckoutCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("checkout")
public class CheckoutController {
    @PostMapping
    public String doCheckout(@Valid @ModelAttribute("command") CheckoutCommand command, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            bindingResult.getAllErrors().forEach(System.out::println);
            return "checkout_form";
        }
        return "checkout_complete";
    }

    @GetMapping
    public String formCheckout(Model model) {
        CheckoutCommand checkoutCommand = new CheckoutCommand();
        checkoutCommand.setFirstName("Art");
        model.addAttribute("command", checkoutCommand);
        return "checkout_form";
    }
}
