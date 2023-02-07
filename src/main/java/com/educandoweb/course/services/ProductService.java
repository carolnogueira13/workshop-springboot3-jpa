package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired // automaticamente o Spring irá resolver a dependência e instanciar uma instância de ProductRepository aqui dentro
	private ProductRepository repository; 
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findbyId(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
