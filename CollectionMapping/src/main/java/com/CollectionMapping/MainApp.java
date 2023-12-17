package com.CollectionMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
	
		List<Player> myPlayer = new ArrayList<Player>();
		
		Team t1 = new Team (1,"RCB",myPlayer);
		
		Player p1 = new Player(101,"Viart",t1);
		Player p2 = new Player(102,"Dhoni",t1);
		Player p3 = new Player(103,"Starck",t1);
		Player p4 = new Player(104,"Raina",t1);

		myPlayer.add(p1);
		myPlayer.add(p2);
		myPlayer.add(p3);
		myPlayer.add(p4);
		
		Session mySession = new Configuration().configure("dbConfig.xml").buildSessionFactory().openSession();
		
		Transaction tr = mySession.beginTransaction();
		
		mySession.save(t1);
		tr.commit();
		mySession.close();
	
	}

}
