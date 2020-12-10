package com.cg.dao;

import com.cg.entity.Login;

public interface LoginDao {

 void loginAsEmployer(Login loginObject);

 void loginAsJobSeeker(Login loginObject);

}