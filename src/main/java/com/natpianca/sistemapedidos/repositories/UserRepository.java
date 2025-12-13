package com.natpianca.sistemapedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natpianca.sistemapedidos.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
