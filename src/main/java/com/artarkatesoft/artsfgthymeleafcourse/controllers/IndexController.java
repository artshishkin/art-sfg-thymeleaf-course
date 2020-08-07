package com.artarkatesoft.artsfgthymeleafcourse.controllers;

import com.artarkatesoft.artsfgthymeleafcourse.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class IndexController {

    private final ProductService productService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("products", productService.listProducts());
        return "index";
    }
}
