package com.cg.service;



import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;



import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
//import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.junit.MockitoJUnitRunner;




import com.cg.dao.LoginDaoImpl;
import com.cg.entity.JobSeeker;
import com.cg.entity.Login; 









@RunWith(MockitoJUnitRunner.class)
class LoginServiceImplTest {
	@InjectMocks
	private LoginServiceImpl serviceObject;



	@Mock
	private LoginDaoImpl daoObject;
	@Test
	void testLoginAsEmployer() {
		Login login=new Login();
		login.setUsername("Neha1234");
		login.setPassword("Neha@123");
		if(serviceObject != null) {
            serviceObject.loginAsEmployer(login);
            verify(daoObject, times(1)).loginAsEmployer(login);
		}
	}

	@Test
	void testLoginAsJobSeeker() {
		Login login=new Login();
		login.setUsername("Neha1234");
		login.setPassword("Neha@123");
		if(serviceObject != null) {
            serviceObject.loginAsJobSeeker(login);
            verify(daoObject, times(1)).loginAsJobSeeker(login);
		}
	}

}
