package com.company.user.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.company.user.dao.IUserDao;
import com.company.user.model.UserEntity;

@Service // Al poner esto Spring sabe que es un servicio
public class UserServiceImpl implements IUserService {
	
	private final IUserDao userDao;


	UserServiceImpl(IUserDao userDao) {
		this.userDao = userDao;
	}


	@Override
	public List<UserEntity> search() {
		return (List<UserEntity>) userDao.findAll();
	}


	@Override
	public Optional<UserEntity> searchById(Long id) {
		return userDao.findById(id);
	}


	@Override
	public UserEntity save(UserEntity user) {
		return userDao.save(user);
	}

}
