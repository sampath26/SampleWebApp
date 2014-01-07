package com.vin.web.impls;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class RegisterServiceDAOImpl extends HibernateDaoSupport implements RegisterServiceDAO{

//	private SessionFactory sessionFactory;
//	
//	public void setSessionFactory(SessionFactory sessionFactory) {
//		this.sessionFactory = sessionFactory;
//	}

	@Override
	public void createUser(UserEntity entity) {
		
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		session.save(entity);
//		session.getTransaction().commit();
//		sessionFactory.close();
		
		getHibernateTemplate().save(entity);
		
	}
	
	

}
