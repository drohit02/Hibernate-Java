package com.EmpAddressContainment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
	
		Employee emp = new Employee(101,"Virat",new Address("Delhi","ViratColony"));
		
		Configuration cfg = new Configuration();
		
		cfg.configure("dbConfig.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session mySession = factory.openSession();
		
		Transaction tr = mySession.beginTransaction();
		
		mySession.save(emp);
//		mySession.delete(emp);
		tr.commit();
		
		Session mySession1 = factory.openSession();
		Transaction tr1 = mySession1.beginTransaction();
		
		Employee obj = mySession1.load(Employee.class, 101);
		tr1.commit();
		System.out.println(obj);
		mySession.close();
		
	
	}

}
