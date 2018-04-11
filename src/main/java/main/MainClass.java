package main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import constants.Position;
import entity.Customer;
import entity.Employee;
import entity.Person;
import lombok.extern.slf4j.Slf4j;
import util.HibernateUtil;

@Slf4j
public class MainClass {
	public static void main(String[] args) {

		log.info("Opening session");
		Session session = HibernateUtil.getSessionFactory().openSession();
		log.info("Beginning transaction");
		Transaction t = session.beginTransaction();

		Person p1 = new Employee("Miroslav", "Lehotsky", 321.23, Position.COOK);
		Person p2 = new Customer("Miroslav", "Lehotsky", "NeviemCo");

		session.persist(p1);
		session.persist(p2);

		log.info("Commiting transaction");
		t.commit();
		session.close();

		System.out.println("FINISHED");
	}
}
