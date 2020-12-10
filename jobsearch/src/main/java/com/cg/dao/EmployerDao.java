package com.cg.dao;

import javax.persistence.PersistenceException;

import com.cg.entity.Employer;
import com.cg.entity.EmployerBuilder;

public interface EmployerDao {
public void registerEmployer(EmployerBuilder ebuilder) throws PersistenceException;
}
