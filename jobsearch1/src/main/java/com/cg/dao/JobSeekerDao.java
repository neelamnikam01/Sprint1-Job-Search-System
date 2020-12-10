package com.cg.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceException;

import com.cg.entity.Job;
import com.cg.entity.JobSeeker;

public interface JobSeekerDao {
	public void registerJobSeeker(JobSeeker jobSeekerObject) throws PersistenceException, Exception;
	
	public List<Job> searchJobByDesignation(String designation) throws PersistenceException, Exception;
	public List<Job> searchJobByLocation(String location) throws PersistenceException, Exception;
	
	public List<Job> getSpecificJobDetails(Integer job_id) throws PersistenceException, Exception;
}
