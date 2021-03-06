package com.base.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.base.project.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
	
}
