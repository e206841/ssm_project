package com.ln.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.ln.web.model.User;
import com.ln.web.service.UserService;

public class UserTest extends TestBase{
	@Resource
	private UserService userService;
	@Test
	public void listTest(){
		List<User> list = userService.getList();
		System.out.println(list.size());
	}

}
