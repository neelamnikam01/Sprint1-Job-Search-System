package com.cg.service;

import com.cg.entity.Employer;
import com.cg.entity.EmployerBuilder;
import com.cg.exception.EmployerException;

public interface EmployerService {
	public void registerEmployer(Employer employerObject) throws EmployerException, Exception;
}
