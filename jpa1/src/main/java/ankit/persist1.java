package ankit;
import java.util.*;

import javax.persistence.*;
import javax.persistence.Query;


public class persist1 {
	public static void main(String[] args) {
		
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("prodapt");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et= em.getTransaction();
	et.begin();
	Book b=new Book();
	b.setName("Ankit");
	b.setPrice(5000);
	em.persist(b);
	Book b1=new Book();
	b1.setName("Ram");
	b1.setPrice(50000);
	em.persist(b1);
	Book b2=new Book();
	b2.setName("Shiv");
	b2.setPrice(15000);
	em.persist(b2);
	Book b3=new Book();
	b3.setName("Devansh");
	b3.setPrice(45000);
	em.persist(b3);
	Book b4=new Book();
	b4.setName("krishan");
	b4.setPrice(5000);
	em.persist(b4);
	Book b5=em.find(Book.class, new Integer(3));
	b5.setName("Ramesh");
	b5.setPrice(10000);
	em.persist(b5);
	et.commit();
	
	System.out.println("persisted!!");
	Query q=em.createQuery("from Book");
	List<Book> l=q.getResultList();
	
	System.out.println("List "+l.get(4));
	em.close();
	

	}
}