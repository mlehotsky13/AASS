package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	private static SessionFactory buildSessionFactory() {
		try {
			Configuration cfg = new Configuration();
			sessionFactory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		} catch (Exception e) {

		}

		return sessionFactory;
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory != null ? sessionFactory : buildSessionFactory();
	}
}
