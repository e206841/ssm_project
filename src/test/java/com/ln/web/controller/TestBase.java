package com.ln.web.controller;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath*:applicationContext.xml",
									"classpath*:spring-mvc.xml",
									"classpath*:spring-mq.xml"})
public abstract class TestBase extends AbstractJUnit4SpringContextTests{
	

}
