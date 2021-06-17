package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long> {
	
public Optional<UserEntity> findByUserName(String userName);
}