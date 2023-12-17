package com.InheritanceMappingSubClass;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {

		Employee emp1 = new Developer(101,"Virat",32000,"Java");
		Employee emp2 = new ProjectManager(201,"Dhoni",28000,11);
		
		Session mySession = new Configuration().configure("dbConfig.xml").buildSessionFactory().openSession();
		
		Transaction tr  = mySession.beginTransaction();
		mySession.save(emp1);
		mySession.save(emp2);
		
		tr.commit();
		mySession.close();
	}

}
