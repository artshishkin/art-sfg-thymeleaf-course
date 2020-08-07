package com.artarkatesoft.artsfgthymeleafcourse.controllers;

import com.artarkatesoft.artsfgthymeleafcourse.domain.Product;
import com.artarkatesoft.artsfgthymeleafcourse.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("product")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public String getProduct() {
        return "redirect:/index";
    }

    @GetMapping("{id}")
    public String getProductById(@PathVariable Integer id, Model model) {
        Product product = productService.getProduct(id);
        model.addAttribute("product", product);
        return "product";
    }
}
