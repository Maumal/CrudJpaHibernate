/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.curso.main;

import com.algaworks.curso.modelo.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Maurício
 */
public class AtualizarPrimeiroObjeto 
{public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		
                Cliente cliente=em.find(Cliente.class,1L);
                
		
		em.getTransaction().begin();
                cliente.setNome("José da Silva Pereira");
                cliente.setIdade(28 );
		em.getTransaction().commit();
		
		System.out.println("Cliente alterado com sucesso!");
		//em.close();
	}    
    
}
