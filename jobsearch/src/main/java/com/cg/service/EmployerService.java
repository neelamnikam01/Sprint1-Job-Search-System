package com.cg.service;

import javax.persistence.PersistenceException;

import com.cg.entity.Employer;
import com.cg.entity.EmployerBuilder;
import com.cg.exception.EmployerException;

public interface EmployerService {
	public void registerEmployer(EmployerBuilder ebuilder) throws EmployerException;

	
	
}

