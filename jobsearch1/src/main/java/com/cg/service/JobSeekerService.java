package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceException;

import com.cg.entity.Job;
import com.cg.entity.JobSeeker;
import com.cg.exception.JobSeekerException;

public interface JobSeekerService {
	public void registerJobSeeker(JobSeeker jobSeekerObject) throws JobSeekerException, Exception;
	public List<Job> searchJobByDesignation(String designation) throws PersistenceException, Exception;
	
	
}
