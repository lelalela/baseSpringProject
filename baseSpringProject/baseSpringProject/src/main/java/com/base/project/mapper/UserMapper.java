package com.base.project.mapper;

import java.util.List;

import com.base.project.entity.User;

public interface UserMapper {
	
	public List<User> userList();
	
	public int userAdd(User user);
	
}
