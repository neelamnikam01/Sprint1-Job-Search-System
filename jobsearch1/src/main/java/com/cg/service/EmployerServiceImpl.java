package com.cg.service;

import java.util.List;

import javax.persistence.PersistenceException;

import com.cg.dao.EmployerDao;
import com.cg.dao.EmployerDaoImpl;
import com.cg.entity.Employer;
import com.cg.entity.EmployerBuilder;
import com.cg.entity.Job;
import com.cg.entity.JobSeeker;
//import com.cg.exception.EmployerException;
//import com.cg.training.exception.ProductException;
import com.cg.exception.EmployerException;




public class EmployerServiceImpl implements EmployerService {
	EmployerDao employerDao= new EmployerDaoImpl();
	
	public void registerEmployer(Employer employer) throws Exception{
		try {
	
		{
			//EmployerDao employerDao= new EmployerDaoImpl();
			
				
				employerDao.registerEmployer(employer);			
			
		}
	} catch (PersistenceException e) {
		
		e.printStackTrace();
	} catch (Exception e) {
		
		e.printStackTrace();
	}

	}

	@Override
	public void postAjob(Job job) throws EmployerException, Exception {
		// TODO Auto-generated method stub
		try {
		EmployerDao employerDao= new EmployerDaoImpl();
		employerDao.postJob(job);


		 } catch (PersistenceException e) {
		e.printStackTrace();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}

	@Override
	public Job getJobById(Integer jobId) throws EmployerException {
		
		return null;
	}

	@Override
	public int deleteJob(Integer job_id) throws PersistenceException, Exception {
		try {			
			//EmployerDao employerDao= new EmployerDaoImpl();
			Integer id= employerDao.deleteJob(job_id);
			return id;
		}catch(PersistenceException e) {
			throw new EmployerException(e.getMessage(),e);
		}
	}

	@Override
	public List<Job> getAllJobs() throws Exception {
		try {			
			List<Job> jobList= 
					employerDao.getAllJobs();
			return jobList;
		}catch(PersistenceException e) {
			throw new EmployerException(e.getMessage(),e);
		}
	}

	@Override
	public List<JobSeeker> getAllJobSeekers() throws Exception {
		try {			
			List<JobSeeker> jobSeekerList= 
					employerDao.getAllJobSeekers();
			return jobSeekerList;
		}catch(PersistenceException e) {
			throw new EmployerException(e.getMessage(),e);
		}
	}
	public Employer findById(Integer employer_id) throws EmployerException, Exception {
		// TODO Auto-generated method stub
		Employer employer = null;
		try {
		EmployerDao employerDao= new EmployerDaoImpl();
		employer =employerDao.findById(employer_id);
		//return job_id;
		}
		catch(PersistenceException e)
		{
		e.printStackTrace();
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		return employer;
		}
	}



