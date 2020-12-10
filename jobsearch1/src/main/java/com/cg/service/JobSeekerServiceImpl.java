package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceException;

import com.cg.dao.JobSeekerDao;
import com.cg.dao.JobSeekerDaoImpl;
import com.cg.entity.Job;
import com.cg.entity.JobSeeker;
import com.cg.exception.JobSeekerException;


public class JobSeekerServiceImpl implements JobSeekerService{
	JobSeekerDao jobSeekerDao=new JobSeekerDaoImpl();
	@Override
	public void registerJobSeeker(JobSeeker jobSeekerObject) throws Exception {
		try {

			jobSeekerDao.registerJobSeeker(jobSeekerObject);

		}catch(PersistenceException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Job> searchJobByDesignation(String designation) throws PersistenceException, Exception {
		try {			
			List<Job> job= jobSeekerDao.searchJobByDesignation(designation);
			return job;
		}catch(PersistenceException e) {
			throw new JobSeekerException(e.getMessage(),e);
		}
	}

	

	

}
