package hibernateproject.hibernateproject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	 private int emp_id;
	 private String name;
	 private String  city;
	 private String salary;
	 @OneToOne
	 private Address Address_id;
	public int getEmp_id() {
		return emp_id;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public String getSalary() {
		return salary;
	}
	public Address getAddress_id() {
		return Address_id;
	}
	public Employee(int emp_id, String name, String city, String salary, Address address_id) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.city = city;
		this.salary = salary;
		Address_id = address_id;
	}
	@Override
	public String toString() 
	{
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", city=" + city + ", salary=" + salary + ", Address_id=" + Address_id + "]";
	}
}