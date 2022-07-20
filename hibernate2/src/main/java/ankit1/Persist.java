package ankit1;
import org.hibernate.*;
import org.hibernate.cfg.*;
public class Persist {
public static void main(String[] args) {
	Session s= new Configuration(). configure("hibernate.cfg.xml")
			.buildSessionFactory().openSession();
	Transaction t= s.beginTransaction();
	Book b=new Book();
	b.setName("chemistry");
	b.setPrice(2000);
	b.setAuthor("HC Verma");
	s.save(b);
	Book b1=new Book();
	b1.setName("math");
	b1.setPrice(3000);
	b1.setAuthor("NCERT");
	s.save(b1);
	Book b2=new Book();
	b2.setName("English");
	b2.setPrice(5000);
	b2.setAuthor("MV Singh");
	s.save(b2);
	Book b3=new Book();
	b3.setName("Hindi");
	b3.setPrice(15000);
	b3.setAuthor("MP Singh");
	s.save(b3);
	
	
    Book b4=new Book();
	  b4.setName("Physics"); 
	  b4.setPrice(1000); 
	  b4.setAuthor("HC Verma");
	  s.save(b4);
	  
	  Book b5=new Book();
	  b5.setName("Physical");
	  b5.setPrice(7000); 
	  b5.setAuthor("SD Verma"); 
	  s.save(b5);
	 
	t.commit();
	s.close();
	System.out.println("persisted!");
}
}
