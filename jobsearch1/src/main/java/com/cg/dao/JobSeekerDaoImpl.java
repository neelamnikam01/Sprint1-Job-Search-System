package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import com.cg.entity.Job;
import com.cg.entity.JobSeeker;


public class JobSeekerDaoImpl implements JobSeekerDao {
	private EntityManagerFactory emf= 
			Persistence.createEntityManagerFactory("jobsearch1");
	public void registerJobSeeker(JobSeeker jobSeeker) throws PersistenceException, Exception {
		EntityManager entityManager=emf.createEntityManager();

		try {		
			EntityTransaction entr=entityManager.getTransaction();
			entr.begin();

			entityManager.persist(jobSeeker);
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
	@Override
	public  List<Job> searchJobByDesignation(String designation) throws PersistenceException, Exception {
		// TODO Auto-generated method stub
		EntityManager entityManager=emf.createEntityManager();
		String jql= "From Job where title='%designation'";
		try {			
			entityManager.getTransaction().begin();
//			Query q= entityManager.createQuery(jql);
			TypedQuery<Job> query=
					entityManager.createQuery(jql, Job.class);
			List<Job> jobList=query.getResultList();
			entityManager.getTransaction().commit();			
			return jobList;
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
	public List<Job> searchJobByLocation(String location) throws PersistenceException, Exception {
		EntityManager entityManager=emf.createEntityManager();
		try {	
			EmployerDaoImpl employerDao=new EmployerDaoImpl();
			
//			
			List<Job> jobList= employerDao.getAllJobs();
						
			return jobList;
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
	public List<Job> getSpecificJobDetails(Integer job_id) throws PersistenceException, Exception {
		EntityManager entityManager=emf.createEntityManager();
		try {	
			EmployerDaoImpl employerDao=new EmployerDaoImpl();
			
//			
			List<Job> jobList= employerDao.getAllJobs();
						
			return jobList;
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

