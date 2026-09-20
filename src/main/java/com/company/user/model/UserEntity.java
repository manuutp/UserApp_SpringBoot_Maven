package com.company.user.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //Esto nos crea una tabla en la bbdd
public class UserEntity {
	
	@Id 												 //Marcar el id de la base de datos (primary key)
	@GeneratedValue(strategy = GenerationType.IDENTITY)		 // Valor autogenerado
	@Column(name = "user_id")							 //Nombre de la columna en la bbdd
	private Long userId;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "user_address")
	private String userAddress;
	
	public long getUserId() {
		return userId;
	}
	
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserAddress() {
		return userAddress;
	}
	
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	
}
