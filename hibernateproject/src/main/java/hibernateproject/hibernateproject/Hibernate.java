package hibernateproject.hibernateproject;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class Hibernate {

public static SessionFactory sessionfactory;
	
	public static SessionFactory getfactory()
	{
		Configuration cg=new Configuration();
		
		Properties ppt=new Properties();
		
		ppt.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
		ppt.put(Environment.URL,"jdbc:mysql://localhost:3306/hibernet_project1");
		ppt.put(Environment.USER,"root");
		ppt.put(Environment.PASS,"Shashank@23");
		ppt.put(Environment.SHOW_SQL,"true");
		ppt.put(Environment.HBM2DDL_AUTO,"update");
		ppt.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
		
           cg.setProperties(ppt);
		
		cg.addAnnotatedClass(Employee.class);
		cg.addAnnotatedClass(Address.class);
		
		
		ServiceRegistry ss=new StandardServiceRegistryBuilder().applySettings(cg.getProperties()).build();
		sessionfactory=cg.buildSessionFactory(ss);

		
		return sessionfactory;

}
}