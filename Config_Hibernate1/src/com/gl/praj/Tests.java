package com.gl.praj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Tests{
	public static void main(String[] args) {
		System.out.println("Connecting to database");
		SessionFactory factory = null;
		Session session = null;
		
		factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(com.gl.praj.Teacher.class)
									.buildSessionFactory();
		System.out.println("Created");
		
		Teacher t1 = new Teacher("Raj", "Patil", "rajpatil@gmail.com");
		Teacher t2 = new Teacher("Mahi", "Shaha", "mahi123@gmail.com");
		Teacher t3 = new Teacher("Soham", "Patel", "soham99@gmail.com");
		Teacher t4 = new Teacher("Viraj", "Rao", "virajrao@gmail.com");
		
		Transaction  tx = null;
		try {
			session = factory.getCurrentSession();
			tx = session.beginTransaction();
			session.save(t1);
			session.save(t2);
			session.save(t3);
			session.save(t4);
			tx.commit();
		} 
		catch (Exception e) {
			System.out.println("ERROR");
			e.printStackTrace();
			tx.rollback();
		}
		finally {
			session.close();
		}
	}
}

