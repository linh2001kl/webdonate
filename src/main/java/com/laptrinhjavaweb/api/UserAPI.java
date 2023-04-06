package com.laptrinhjavaweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.service.INewService;
import com.laptrinhjavaweb.service.IUserService;


	@CrossOrigin
	@RestController
	public class UserAPI {
		
		@Autowired
		private IUserService UserService;
		
		@PostMapping(value = "/login")
		public UserDTO createUser(@RequestBody UserDTO model) {
			return userService.save(model);
		}

		@PutMapping(value = "/login")
		public UserDTO updateUser(@RequestBody UserDTO model) {
			return model;
		}

		@DeleteMapping(value = "/login")
		public void deleteUser(@RequestBody long[] ids) {

		}
}
