package com.cg.service;

import java.util.List;

import javax.persistence.PersistenceException;

import com.cg.entity.Employer;
import com.cg.entity.EmployerBuilder;
import com.cg.entity.Job;
import com.cg.entity.JobSeeker;
import com.cg.exception.EmployerException;

public interface EmployerService {
	public void registerEmployer(Employer employerObject) throws EmployerException, Exception;

	public void postAjob(Job jobObject) throws EmployerException,Exception;
	
	public Job getJobById(Integer jobId) throws EmployerException;
	public int deleteJob(Integer job_id)throws PersistenceException, Exception;
	public List<Job> getAllJobs()throws PersistenceException, Exception;
	public List<JobSeeker> getAllJobSeekers()throws PersistenceException, Exception;
	public Employer findById(Integer employer_id) throws EmployerException, Exception;
}
