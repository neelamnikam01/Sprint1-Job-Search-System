package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.cg.entity.Employer;
import com.cg.entity.EmployerBuilder;

public class EmployerDaoImpl implements EmployerDao{

	private EntityManagerFactory emf=
			Persistence.createEntityManagerFactory("jobsearch");
	public void registerEmployer(EmployerBuilder ebuilder) throws Exception {
	EntityManager entityManager=emf.createEntityManager();
	try {
		entityManager.getTransaction().begin();
		entityManager.persist(ebuilder);
		entityManager.flush();
		entityManager.getTransaction().commit();
	    }
		catch(PersistenceException e)
	{
			entityManager.getTransaction().rollback();
			throw e;
	}
	catch(Exception e)
	{
		throw e;
	}
	finally
	{
		entityManager.close();
	}
	}
	

}
