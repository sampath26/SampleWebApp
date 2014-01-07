package com.vin.web.impls;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class DBUtil {
	
	public static SessionFactory buildSessionFactory(){
		SessionFactory sessionFactory = null;
		try{
			AnnotationConfiguration config = new AnnotationConfiguration();
			sessionFactory = config.configure().buildSessionFactory();
			System.out.println("Session Factory generated : "+ sessionFactory.toString());
		}catch(Throwable e){
			System.out.println("StackTrace******************************************");
			e.printStackTrace();
		}
		return sessionFactory;
	}

}
