package com.cg.service;

 

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

 

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
//import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.junit.MockitoJUnitRunner;
import com.cg.dao.EmployerDaoImpl;
import com.cg.entity.Employer;
import com.cg.exception.EmployerException;

 

@RunWith(MockitoJUnitRunner.class)
class EmployerServiceImplTest {

 

    @InjectMocks
    private EmployerServiceImpl serviceObject;

 

    @Mock
    private EmployerDaoImpl daoObject;

 

    @Test
    public void registerEmployerTest() throws Exception{
        Employer register=new Employer();
        register.setOrganizationName("capg");
        register.setAddress("Pune");
        register.setContactNo(Integer.parseInt("1235654231"));
        register.setEmail("shweta@gmail.com");
        register.setUsername("ShwetaAhuja");
        register.setPassword("123");
        if(serviceObject != null) {
            serviceObject.registerEmployer(register);
            verify(daoObject, times(1)).registerEmployer(register);

 

        }        
    }
}