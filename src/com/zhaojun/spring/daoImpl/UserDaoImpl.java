package com.zhaojun.spring.daoImpl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.zhaojun.spring.dao.UserDao;
import com.zhaojun.spring.model.UserModel;

public class UserDaoImpl implements UserDao {
	private SessionFactory sessionFactory;
	@Override
	public void save(UserModel userModel) {
		System.out.println(sessionFactory);
		System.out.println("hello,spring");
		Session s = sessionFactory.getCurrentSession();
		s.save(userModel);
		f();
	}
	public void f(){
		System.out.println("111111111111111");
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		System.out.println("hello,sessionFactory");
	}
	
}
