package com.company.user.dao;

import org.springframework.data.repository.CrudRepository;

import com.company.user.model.UserEntity;

public interface IUserDao extends CrudRepository<UserEntity, Long>{ // Es Long porque el primary key de la clase es long, al extender de Crud tenemos los métodos para trabajar con la bbdd
	
}
