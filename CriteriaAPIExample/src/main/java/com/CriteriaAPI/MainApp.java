package com.CriteriaAPI;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class MainApp {

	public static void main(String[] args) {
		
		Session mySession = new Configuration().configure("dbConfig.xml").buildSessionFactory().openSession();
		
		/* --------------------  JPA Section 1  ----------------------*/
		CriteriaBuilder build = mySession.getCriteriaBuilder();
		
		//this line to hold query until the excution gets completely.
		CriteriaQuery<Employee> myQuery = build.createQuery(Employee.class);
		
		//here actual query is created and pointing to the actual data of employee data
		Root<Employee> newRoot = myQuery.from(Employee.class);
		
		//this line similar to : SELECT * FROM Employee;
		//myQuery.select(newRoot);
		
		//this line similar to : SELECT * FROM Employee where salary<30000
		myQuery.select(newRoot).where(build.lt((Expression)newRoot.get("salary"), 30000));

		
		/* --------------------  Hibernate Section 2  ----------------------*/
		
		Query<Employee> q1 = mySession.createQuery(myQuery);
		
		List<Employee> result = q1.getResultList();
		
		for(Employee emp : result)
		{
			System.out.println(emp.getEmpName());
		}
	}

}
