package main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import constants.Position;
import entity.Employee;
import entity.Person;
import util.HibernateUtil;

public class MainClass {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();

		// Person p1 = new Person("Miroslav", "Lehotsky");
		Person p1 = new Employee("Miroslav", "Lehotsky", 321.23, Position.COOK);
		// Person p1 = new Customer("Miroslav", "Lehotsky", "NeviemCo");

		session.persist(p1);

		t.commit();
		session.close();

		System.out.println("FINISHED");
	}
}
