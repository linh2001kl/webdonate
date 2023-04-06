package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.entity.UserEntity;

@Component
public class UserConverter {

	public UserEntity toEntity(UserDTO dto) {
		UserEntity entity = new UserEntity();
		entity.setAddress(dto.getAddress());
		entity.setDateOfBirth(dto.getDateOfBirth());
		entity.setEmail(dto.getEmail());
		entity.setFistName(dto.getFistName());
		entity.setLastName(dto.getLastName());
		entity.setPassword(dto.getPassword());
		return entity;
		
	}
	public UserDTO toDTO(UserEntity entity) {
		UserDTO dto = new UserDTO();
		dto.setAddress(entity.getAddress());
		dto.setDateOfBirth(entity.getDateOfBirth());
		dto.setEmail(entity.getEmail());
		dto.setFistName(entity.getFistName());
		dto.setLastName(entity.getLastName());
		dto.setPassword(entity.getPassword());
		return dto;
		
	}
}