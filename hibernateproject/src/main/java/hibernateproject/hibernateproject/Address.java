package hibernateproject.hibernateproject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	private int Address_id;
	private String city;
	private String address;
	
	
	public int getAddress_id() {
		return Address_id;
	}
	public String getCity() {
		return city;
	}
	public String getAddress() {
		return address;
	}
	
	Address()
	{
		
	}
	public Address(int address_id, String city, String address) {
		super();
		Address_id = address_id;
		this.city = city;
		this.address = address;
	}
	@Override
	public String toString() 
	{
		return "Address [Address_id=" + Address_id + ", city=" + city + ", address=" + address + "]";
	}
	
	
	
}