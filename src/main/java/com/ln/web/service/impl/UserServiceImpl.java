package com.ln.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ln.web.dao.UserMapper;
import com.ln.web.model.User;
import com.ln.web.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper mapper;
	
	@Override
	public List<User> getList() {
		return mapper.getList();
	}

}
