package com.AccountProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		
		Account at = new Account(101,"Virat",1234);
		
		Configuration cfg = new Configuration();
		cfg.configure("dbConfig.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session mySession = factory.openSession();
		
		Transaction tr = mySession.beginTransaction();
		
		mySession.save(at);
		tr.commit();
		mySession.close();
	

	}

}
