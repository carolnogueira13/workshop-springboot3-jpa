package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired // automaticamente o Spring irá resolver a dependência e instanciar uma instância de CategoryRepository aqui dentro
	private CategoryRepository repository; 
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findbyId(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
