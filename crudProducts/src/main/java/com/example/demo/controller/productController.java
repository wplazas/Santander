package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.productModel;
import com.example.demo.repository.Repository;
import com.example.demo.services.productService;

@RestController
@RequestMapping("/products")
public class productController {
	
	@Autowired
	Repository repo ;
	
	@Autowired
	productService pservice;
	
	@GetMapping
	public List<productModel> findAll() {
		return repo.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Optional<productModel> findProductById(@PathVariable(value="id") Integer id) {
		return repo.findById(id);
		
	}
	
	@PostMapping()
	public void saveproduct(@RequestBody productModel producto){
	   repo.save(producto);
		
	}
	
    @PutMapping(value="/{id}")
    public productModel update(@RequestBody productModel producto,@PathVariable(value="id") Integer id) {
        return pservice.udpateproducto(producto,id);
    }

    @DeleteMapping(value="/{id}")
    public List<productModel>  delete( @PathVariable(value="id") Integer id) {
         repo.deleteById(id);
         
         return repo.findAll();
         
    }


}