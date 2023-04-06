package com.laptrinhjavaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.entity.RoleEntity;
import com.laptrinhjavaweb.repository.RoleRepository;
import com.laptrinhjavaweb.repository.UserRepositiry;
import com.laptrinhjavaweb.service.IUserService;
@Service
public class UserService implements IUserService {

	@Autowired
	private UserRepositiry userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public UserDTO save(UserDTO userDTO) {
		
		RoleEntity roleEntity = roleRepository.findOneByCode(userDTO.getRoleCode());
		return null;
	}

}
