package com.company.user.services;

import java.util.List;
import java.util.Optional;

import com.company.user.model.UserEntity;

public interface IUserService {
	
	public List<UserEntity> search(); // Devuelve una lista de la clase UserEntity
	
	public Optional<UserEntity> searchById(Long id);
	
	public UserEntity save(UserEntity user);

}
