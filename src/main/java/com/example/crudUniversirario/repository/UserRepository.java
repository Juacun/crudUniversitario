package com.example.crudUniversirario.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.crudUniversirario.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>  {
    
	public Optional<User> findByEmail(String email);
	
}