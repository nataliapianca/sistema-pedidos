package com.natpianca.sistemapedidos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.natpianca.sistemapedidos.entities.Category;
import com.natpianca.sistemapedidos.repositories.CategoryRepository;

public class CategoryService {

   @Autowired
   private CategoryRepository repository;

   //chamando do acesso ao banco 
   public List<Category> findAll(){
        return repository.findAll();
   }

   public Category findById(long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
   }
}
