package com.ln.web.controller;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ln.web.model.User;
import com.ln.web.service.UserService;

public class UserTest extends TestBase {
	@Resource
	private UserService userService;
	@Autowired
	private SqlSessionFactory factory;

	/**
	 * 测试数据库连接
	 */
	@Test
	public void testConn() {
		Connection con = factory.openSession().getConnection();
		assertNotNull("数据库连接失败!!!", con);
	}

	/**
	 * 测试
	 */
	@Test
	public void listTest() {
		List<User> list = userService.getList();
		System.out.println(list.size());
	}

}
