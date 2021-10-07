package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		/*em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		
		
		System.out.println(p1); 
		System.out.println(p2); 
		System.out.println(p3);*/
		
		 //Procurar por id, ele pede qual a clase e o id pra procurar
		 Pessoa p = em.find(Pessoa.class, 2);
		
		/*
		Pessoa p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		*/
		System.out.println("Finish!!");
		
		em.close();
		emf.close();
		
	}

}
