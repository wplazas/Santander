package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.productModel;

public interface Repository extends JpaRepository<productModel,Integer> {

}

