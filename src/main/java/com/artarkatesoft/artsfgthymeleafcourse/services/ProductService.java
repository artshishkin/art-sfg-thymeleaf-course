package com.artarkatesoft.artsfgthymeleafcourse.services;


import com.artarkatesoft.artsfgthymeleafcourse.domain.Product;

import java.util.List;


public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}
