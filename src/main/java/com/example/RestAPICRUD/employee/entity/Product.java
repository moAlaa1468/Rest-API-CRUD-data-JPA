package com.example.RestAPICRUD.employee.entity;


import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "size")
    private int size;

    // =============== This is construct for setting the values during taking an object ===========
    public Product(int id, String name, String description, int size) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.size = size;
    }

    public Product() {
    }


    //=========================== You need to generate setters and getters function ===========
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // ============================ You need to make override toString function=====

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", size=" + size +
                '}';
    }
}
