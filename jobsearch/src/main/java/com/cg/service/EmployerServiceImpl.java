package com.cg.service;

import javax.persistence.PersistenceException;

import com.cg.dao.EmployerDao;
import com.cg.dao.EmployerDaoImpl;
import com.cg.entity.Employer;
import com.cg.entity.EmployerBuilder;
import com.cg.exception.EmployerException;

public class EmployerServiceImpl implements EmployerService{
private EmployerDao employerDao=new EmployerDaoImpl();
	public void registerEmployer(EmployerBuilder ebuilder) throws EmployerException {
		// TODO Auto-generated method stub
		try {
			employerDao.registerEmployer(ebuilder);
			
		}
		catch(PersistenceException e)
		{
			throw new EmployerException (e.getMessage(),e);
		}
	}

}
