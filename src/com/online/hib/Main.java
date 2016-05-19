package com.online.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
  
    public static void main(String[] args) {

        /*Configuration cfg = new Configuration();
        cfg.configure("hibernate.xml");
        SessionFactory sf = cfg.buildSessionFactory();*/
        
        SessionFactory sf = new Configuration().configure("hibernate.xml").buildSessionFactory();
        
        Session session = sf.openSession();
        
        session.beginTransaction();
        
        Account ac = new Account();
        ac.setAccName("Accenture");
        ac.setAccId(1001);
        ac.setUserId(12);

        Object s = session.save(ac);
        
		Account a = (Account)s;
		System.out.println(a.getAccId()+" "+a.getUserId());
		session.getTransaction().commit();
        
		session.beginTransaction();
        
        ac = new Account();
        ac.setAccName("Wipro");
        ac.setAccId(1001);
        ac.setUserId(13);
        s = session.save(ac);
        
		a = (Account)s;
		System.out.println(a.getAccId()+" "+a.getUserId());
		session.getTransaction().commit();

		session.beginTransaction();
        
        ac = new Account();
        ac.setAccName("Polo");
        ac.setAccId(1002);
        ac.setUserId(13);
        s=session.save(ac);
        
		a = (Account)s;
		System.out.println(a.getAccId()+" "+a.getUserId());
		session.getTransaction().commit();
		
		/*session.beginTransaction();
        
        ac = new Account();
        ac.setAccName("ABC");
        ac.setAccId(1002);
        ac.setUserId(13);
        s=session.save(ac);
        
		a = (Account)s;
		System.out.println(a.getAccId()+" "+a.getUserId());
		session.getTransaction().commit();*/

		session.close();

    }

}
