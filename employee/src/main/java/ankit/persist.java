package ankit;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class persist {
	public static void main(String[] args) {
		Session s= new Configuration(). configure("hibernate.cfg.xml")
				.buildSessionFactory().openSession();
		Transaction t= s.beginTransaction();
		empl e=new empl();
		e.setName("Ram");
		s.save(e);
		empl e1=new empl();
		e1.setName("Ankit");
		s.save(e1);
		reg r=  new reg();
		r.setName("shivam");
		r.setSalary(100000);
		r.setBonous(50000);
		s.save(r);
		cont c= new cont();
		c.setName("dev");
		c.setSalar(500);
		c.setBono(100);
		s.save(c);
		//t.commit();
		//s.close();
		System.out.println("persisted!!");
		
	}
}
