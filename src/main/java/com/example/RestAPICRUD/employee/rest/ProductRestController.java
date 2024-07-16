package com.example.RestAPICRUD.employee.rest;


import com.example.RestAPICRUD.employee.entity.Product;
import com.example.RestAPICRUD.employee.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prod")
public class ProductRestController {

    // You need to create property for this impl
    ProductServiceImpl productServiceImpl;

    @Autowired
    public ProductRestController(ProductServiceImpl productServiceImpl) {
        this.productServiceImpl = productServiceImpl;
    }

    @GetMapping("/hello")
    public String info() {
        return "Hello world ";
    }

    @PutMapping("/updateproduct")
    public Product updateProduct(@RequestBody Product product) {
     return  productServiceImpl.save(product);
    }

    @GetMapping("/{prod_id}")
    public void deleteProduct(@PathVariable int prod_id) {
        productServiceImpl.deleteById(prod_id);
    }


    @GetMapping("/getAll")
    public List<Product> getAllFunction() {
        System.out.println("This is the output of all product list uaaemr ");
        System.out.println(productServiceImpl.findAll());

        return productServiceImpl.findAll();
    }
}
