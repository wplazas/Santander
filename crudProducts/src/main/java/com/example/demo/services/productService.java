package com.example.demo.services;

import org.springframework.stereotype.Component;

import com.example.demo.model.productModel;

@Component
public interface productService {
	productModel udpateproducto(productModel product, int id);
}
