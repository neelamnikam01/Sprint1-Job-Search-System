package com.cg.service;

import com.cg.entity.Login;

public interface LoginService {

 void loginAsEmployer(Login loginObject);
void loginAsJobSeeker(Login loginObject);
}