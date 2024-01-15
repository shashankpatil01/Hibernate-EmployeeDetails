package hibernateproject.hibernateproject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class emp {
	
	@Id
	private int id;
	private String name;
	private String city;
	private String phno;
//	private String country;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public emp(int id, String name, String city, String phno) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + ", city=" + city + ", phno=" + phno + "]";
	}
	
	
}