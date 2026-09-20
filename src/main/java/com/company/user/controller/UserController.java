package com.company.user.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.user.model.UserEntity;
import com.company.user.services.IUserService;

@RestController // Clase controladora de tipo Rest (Exponer servicios como una API Rest)
public class UserController {
	
	private final IUserService service;
	
	
	UserController(IUserService service) {
		this.service = service;
	}
	
	@GetMapping("users") // Al poner localhost:8080/users, se lee este método
	public List<UserEntity> search(){
		return this.service.search();
	}
	
	@GetMapping("users/{id}")
	public ResponseEntity<UserEntity> searchById(@PathVariable("id") Long id) {
	    return this.service.searchById(id)
	            .map(ResponseEntity::ok)
	            .orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@PostMapping("users")
	public ResponseEntity<UserEntity> create(@RequestBody UserEntity user) {
	    UserEntity newUser = this.service.save(user);
	    // Retornamos un estado HTTP 201 (CREATED) con el objeto guardado en el cuerpo
	    return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
	}

	
}