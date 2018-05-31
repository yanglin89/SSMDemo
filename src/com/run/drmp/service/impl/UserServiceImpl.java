package com.run.drmp.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.run.drmp.dao.UserDao;
import com.run.drmp.domain.User;
import com.run.drmp.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserDao userDao;

	@Override
	public User getUserById(int userId) {
		return userDao.getUserById(userId);
	}

}
