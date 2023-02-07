package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService service; 
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){ //ResponseEntity<T> - É um tipo para responder requisições web
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findbyId(@PathVariable Long id){ //ResponseEntity<T> - É um tipo para responder requisições web
		Product u = service.findbyId(id);
		return ResponseEntity.ok().body(u);
	}
	
	
	
	

}
