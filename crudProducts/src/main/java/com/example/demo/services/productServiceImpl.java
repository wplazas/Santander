package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.model.productModel;
import com.example.demo.repository.Repository;
@Component
public class productServiceImpl implements productService {

	@Autowired
	Repository repo; 
	@Override
	public productModel udpateproducto(productModel product, int id) {
		java.util.Optional<productModel>productM = this.repo.findById(id);
		productModel producupdate = productM.get();
		producupdate.setNombre(product.getNombre());
		producupdate.setPrecio(product.getPrecio());
		repo.save(producupdate);
		return producupdate;
	}

}
