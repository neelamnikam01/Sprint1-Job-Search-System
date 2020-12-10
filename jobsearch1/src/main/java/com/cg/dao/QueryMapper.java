package com.cg.dao;

public interface QueryMapper {
public static final String ADD_NEW_EMPLOYER="insert into employer values"
		+ "(?,?,?,?,?,?)";
public static final String ADD_NEW_JOBSEEKER="insert into jobseeker values"
		+ "(?,?,?,?,?,?,?,?)";
public static final String DELETE_JOB="delete from job where id=?";
public static final String SEARCH_JOB_BY_DESIGNATION="select * from job";
public static final String GET_ALL_JOBS="select * from job";
public static final String GET_ALL_JOBSEEKERS="select * from jobseeker";
public static final String LOGIN_AS_EMPLOYER="insert into login values"
+ "(?,?,?)";
public static final String LOGIN_AS_JOBSEEKER="insert into login values"
+ "(?,?,?)";
public static final String POST_A_JOB="insert into job values"
+ "(?,?,?,?,?,?,?,?,?,?,?)";
}
