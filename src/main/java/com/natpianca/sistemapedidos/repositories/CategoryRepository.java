package com.natpianca.sistemapedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natpianca.sistemapedidos.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
