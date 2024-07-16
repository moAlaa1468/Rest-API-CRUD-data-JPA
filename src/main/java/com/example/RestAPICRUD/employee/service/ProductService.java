package com.example.RestAPICRUD.employee.service;

import com.example.RestAPICRUD.employee.entity.Product;
import com.example.RestAPICRUD.employee.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public List<Product> findAll();

    public void deleteById(Integer id);

    public Product save( Product Product);

    public Optional<Product> findById(Integer Id);
}
