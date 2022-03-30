package com.lectureOne.lectureOne.service;

import java.util.List;

import com.lectureOne.lectureOne.domain.Product;
import com.lectureOne.lectureOne.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService{

//    @Autowired
//    ProductRepo productRepo;

    @Override
    public List<Product> getAll(){
//        return productRepo.getAll();
        return null;
    }
}