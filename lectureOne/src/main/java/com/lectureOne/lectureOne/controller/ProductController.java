package com.lectureOne.lectureOne.controller;


import com.lectureOne.lectureOne.domain.Product;
import com.lectureOne.lectureOne.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")

public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> getProduct(){
        return productService.getAll();
    }

    @GetMapping("/toodloo")
    public String toodloo(){
        return "Abebe beso bela!";
    }

}
