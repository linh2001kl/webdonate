package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.laptrinhjavaweb.entity.UserEntity;

@SuppressWarnings("rawtypes")
public interface UserRepositiry extends JpaRepository<UserEntity, Long> {

}
