package entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import constants.Position;

@Entity
@Table(name = "EMPLOYEE")
@DiscriminatorValue("Emp")
public class Employee extends Person {

	@Column(name = "SALARY")
	private double salary;

	@Enumerated(EnumType.STRING)
	@Column(name = "POSITION")
	private Position position;

	public Employee() {
	}

	public Employee(String firstname, String lastname, double salary, Position position) {
		super(firstname, lastname);
		this.salary = salary;
		this.position = position;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Position getPosition() {
		return position;
	}
}
