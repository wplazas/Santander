package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.productController;
import com.example.demo.repository.Repository;
import com.example.demo.model.productModel;

@SpringBootTest
class CrudProductsApplicationTests {
	
	    private Repository productRepository;

	    @BeforeEach
	    public void setUp() {
	        productRepository = mock(Repository.class);
	    }


	@Test
	public void testfindProductById() {
		
		    Integer productId = 1;
	        productModel product = new productModel();
	        product.setId(productId);
	        product.setNombre("my producto");
	        product.setPrecio(100);

	        when(productRepository.findById(productId)).thenReturn(Optional.of(product));

	        // Act
	        Optional<productModel> result = productRepository.findById(productId);

	        // Assert
	        assertTrue(result.isPresent());
	        assertEquals(productId, result.get().getId());
	        assertEquals("my producto", result.get().getNombre());
	}
	
	

}
