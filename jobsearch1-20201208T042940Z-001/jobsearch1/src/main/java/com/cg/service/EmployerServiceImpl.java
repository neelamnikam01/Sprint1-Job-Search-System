package com.cg.service;

import javax.persistence.PersistenceException;

import com.cg.dao.EmployerDao;
import com.cg.dao.EmployerDaoImpl;
import com.cg.entity.Employer;
import com.cg.entity.EmployerBuilder;
//import com.cg.exception.EmployerException;
//import com.cg.training.exception.ProductException;
import com.cg.exception.EmployerException;


public class EmployerServiceImpl implements EmployerService {
	
	public void registerEmployer(Employer employer) throws Exception{
		try {
	
		{
			EmployerDao employerDao= new EmployerDaoImpl();
			
				
				employerDao.registerEmployer(employer);			
			
		}
	} catch (PersistenceException e) {
		
		e.printStackTrace();
	} catch (Exception e) {
		
		e.printStackTrace();
	}

	}
}
