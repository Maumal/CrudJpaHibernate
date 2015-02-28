package com.algaworks.curso.main;

import com.algaworks.curso.modelo.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemovendoPrimeiroObjeto {
    public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		
                Cliente cliente=em.find(Cliente.class,2L);
		
		em.getTransaction().begin();
		em.remove(cliente);
		em.getTransaction().commit();
		
		System.out.println("Cliente excuido com sucesso!");
		//em.close();
	}    
}
