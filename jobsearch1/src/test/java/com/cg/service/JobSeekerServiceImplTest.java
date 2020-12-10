package com.cg.service;

 

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

 

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
//import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.junit.MockitoJUnitRunner;

 

import com.cg.dao.JobSeekerDaoImpl;
import com.cg.entity.JobSeeker; 

 

@RunWith(MockitoJUnitRunner.class)
class JobSeekerServiceImplTest {

 

    @InjectMocks
    private JobSeekerServiceImpl serviceObject;

 

    @Mock
    private JobSeekerDaoImpl daoObject;

 

    @Test
    void testRegisterJobSeeker() throws Exception{
        JobSeeker register=new JobSeeker();
        register.setJobSeeker_Name("Shweta");
        register.setAddress("Pune");
        register.setContact_No(Long.parseLong("9856312356"));
        register.setMail_ID("shweta@gmail.com");
        register.setSkillSet("Java");
        register.setLocation_preference("Pune");
        register.setUsername("ShwetaAhuja");
        register.setPassword("123");
        if(serviceObject != null) {
            serviceObject.registerJobSeeker(register);
            verify(daoObject, times(1)).registerJobSeeker(register);

 

        }    
    }

 

}