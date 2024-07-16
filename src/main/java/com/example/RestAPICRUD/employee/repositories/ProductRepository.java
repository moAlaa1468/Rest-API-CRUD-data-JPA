package com.example.RestAPICRUD.employee.repositories;

import com.example.RestAPICRUD.employee.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    // here you would get all the CRUD operation for free
    // because of this package uaAlaa
}
