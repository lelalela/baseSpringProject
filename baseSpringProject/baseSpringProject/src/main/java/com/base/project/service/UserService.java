package com.base.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.base.project.entity.User;
import com.base.project.mapper.UserMapper;
import com.base.project.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	
	@Autowired
	private UserMapper mapper;


	public User save(User user) {
		return repository.saveAndFlush(user);
	}
	
	public List<User> findAllUsers(){
		return repository.findAll();
	}
	
}