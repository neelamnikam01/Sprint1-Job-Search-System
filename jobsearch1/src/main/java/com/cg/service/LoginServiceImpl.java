package com.cg.service;

import javax.persistence.PersistenceException;

import com.cg.dao.EmployerDao;
import com.cg.dao.EmployerDaoImpl;
import com.cg.dao.LoginDao;
import com.cg.dao.LoginDaoImpl;
import com.cg.entity.Login;

public class LoginServiceImpl implements LoginService {

	@Override
	public void loginAsEmployer(Login loginObject) {
		try {
			{
				LoginDao loginDao= new LoginDaoImpl();

				loginDao.loginAsEmployer(loginObject);
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void loginAsJobSeeker(Login loginObject) {
		// TODO Auto-generated method stub
		try {
			{
				LoginDao loginDao= new LoginDaoImpl();

				loginDao.loginAsJobSeeker(loginObject);
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}