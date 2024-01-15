package hibernateproject.hibernateproject;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf=Hibernate.getfactory();
		
		System.out.println(sf);
		
		Address as=new Address(3, /*City=*/"Pune",/*Address=*/"Wakad");
		
		
		Employee ob=new Employee(103, /*Name=*/"Madhu", /*City=*/"Pune",/*Salary=*/"800000", as);
		
		
		Session ss=sf.openSession();
		
		Transaction tf=ss.beginTransaction();
		
		ss.save(as);
		ss.save(ob);
		
		tf.commit();
		
		ss.close();
		
		System.out.println("**Data inserted**");
	}

}