package com.InheritanceTablePerHierarchy;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
	
		Employee emp1 = new Develpoer(101,"Virat",32000,"JAVA");
		Employee emp2 = new ProjectManager(201,"Dnoni",31000,11);
		
		Session mySession = new Configuration().configure("dbConfig.xml").buildSessionFactory().openSession();
		
		Transaction tr  = mySession.beginTransaction();
		
		mySession.save(emp1);
		mySession.save(emp2);
		
		tr.commit();
		mySession.close();
	}

}
