package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HibernateUtil {

	private static SessionFactory sessionFactory;

	private static SessionFactory buildSessionFactory() {

		log.info("Starting to build SessionFactory...");
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.setProperty("hibernate.connection.username", System.getProperty("db.username"));
			cfg.setProperty("hibernate.connection.password", System.getProperty("db.password"));

			sessionFactory = cfg.buildSessionFactory();
		} catch (Exception e) {
			log.error("Some error occured");
		}

		log.info("Successfully builded SessionFactory");
		return sessionFactory;
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory != null ? sessionFactory : buildSessionFactory();
	}
}
