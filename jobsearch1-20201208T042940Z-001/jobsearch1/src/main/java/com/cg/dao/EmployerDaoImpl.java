package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.cg.entity.Employer;
import com.cg.entity.EmployerBuilder;

public class EmployerDaoImpl implements EmployerDao {

	private EntityManagerFactory emf= 
			Persistence.createEntityManagerFactory("jobsearch1");
	
	

	@Override
	public void registerEmployer(Employer employer) throws PersistenceException, Exception {
     EntityManager entityManager=emf.createEntityManager();
		
		try {		
			EntityTransaction entr=entityManager.getTransaction();
		     entr.begin();
		 
			entityManager.persist(employer);
		    entityManager.flush();
			//entityManager.getTransaction();
			entr.commit();			
		}catch(PersistenceException e) {
			entityManager.getTransaction().rollback();
			throw e;
		}catch(Exception e) {
			throw e;
		}finally {
			entityManager.close();
		}	
	}

	
}
