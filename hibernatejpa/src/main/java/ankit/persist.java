package ankit;
import javax.persistence.*;

public class persist {
	public static void main(String[] args) {
		
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("prodapt");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et= em.getTransaction();
	et.begin();
	}
}
	