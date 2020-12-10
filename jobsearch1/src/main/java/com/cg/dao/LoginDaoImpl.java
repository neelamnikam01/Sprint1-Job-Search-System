package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.cg.entity.Login;

public class LoginDaoImpl implements LoginDao {
	private EntityManagerFactory emf=
			Persistence.createEntityManagerFactory("jobsearch1");

	@Override
	public void loginAsEmployer(Login loginObject) {
		EntityManager entityManager=emf.createEntityManager();
		try {
			EntityTransaction entr=entityManager.getTransaction();
			entr.begin();
			entityManager.persist(loginObject);
			//entityManager.flush();
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

	@Override
	public void loginAsJobSeeker(Login loginObject) {
		// TODO Auto-generated method stub
		EntityManager entityManager=emf.createEntityManager();
		try {
			EntityTransaction entr=entityManager.getTransaction();
			entr.begin();
			entityManager.persist(loginObject);
			//entityManager.flush();
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