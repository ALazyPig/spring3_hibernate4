package com.zhaojun.spring.model;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhaojun.spring.dao.UserDao;

public class SpringHibernateTest{

	@Test
	public void testSessionFactory(){
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserDao userDao = (UserDao) ctx.getBean("userDao");
		UserModel userModel = new UserModel();
		userModel.setAge(12);
		userModel.setName("22222222");
		userDao.save(userModel);
		f();
	}
	public void f(){
		System.out.println("111111111111111");
	}
	
}