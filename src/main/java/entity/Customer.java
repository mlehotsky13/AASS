package entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
@DiscriminatorValue(value = "Cust")
public class Customer extends Person {

	@Column(name = "PREFERENCES")
	private String preferences;

	public Customer() {
	}

	public Customer(String firstname, String lastname, String preferences) {
		super(firstname, lastname);
		this.preferences = preferences;
	}

	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}

	public String getPreferences() {
		return preferences;
	}
}
