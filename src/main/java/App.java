import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App 
{

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu"); 
		
		EntityManager em = emf.createEntityManager();		
		
		Student stu = em.find(Student.class, 1);
		
		System.out.println(stu);
		
	}

}
