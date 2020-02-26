package com.org.xworkz.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.org.xworkz.entity.SignInEntity;

@Repository
public class SignInDAOImpl implements SignInDAO {

	@Autowired
	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public SignInDAOImpl() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}

	public void save(SignInEntity signinentity) {
		System.out.println("invoking save");

		Session session = null;
		try {
			
		
			System.out.println("start");
			

			session = factory.openSession();
			System.out.println("transaction started");
			session.beginTransaction();
			
			System.out.println("data saving");
			session.save(signinentity);
			session.getTransaction().commit();
			System.out.println("commited");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		//return 0;
	}

}
