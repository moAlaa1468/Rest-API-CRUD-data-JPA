package com.example.RestAPICRUD.employee.service;

import com.example.RestAPICRUD.employee.entity.Product;
import com.example.RestAPICRUD.employee.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductServiceImpl implements ProductService {

    // You need to create property for the repository
    @Autowired
    ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();

    }

    @Override
    public void deleteById(Integer id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);

    }

    @Override
    public Optional<Product> findById(Integer Id) {
        Optional<Product> returnedProduct = productRepository.findById(Id);
        return returnedProduct;
    }
}
