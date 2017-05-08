package com.ln.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ln.web.model.User;
import com.ln.web.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Resource	
	private UserService userService;
	@RequestMapping(value="/login")
	public ModelAndView  login(User user){
		ModelAndView mav=new ModelAndView();  
		mav.setViewName("success");
		return 	mav;
	}
	@RequestMapping(value="/list")
	public Object getList(){
		
		List<User> list = userService.getList();
		return list;
	}
}
