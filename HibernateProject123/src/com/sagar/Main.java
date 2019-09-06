package com.sagar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sagar.model.Employee;

public class Main {
	
	public static void main(String[] args) {
		
		
		Employee emp = new Employee();
		emp.setEmpName("Sidharth");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
	}

}
