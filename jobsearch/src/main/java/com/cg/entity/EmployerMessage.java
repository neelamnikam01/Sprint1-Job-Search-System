package com.cg.entity;

import java.time.LocalDate;

public class EmployerMessage {
	private Integer msgid;
	private String description;
	private JobSeeker jobseeker_id;
	private Employer empid;
	private LocalDate date;
	
	
	public EmployerMessage(Integer msgid, String description, JobSeeker jobseeker_id, Employer empid, LocalDate date) {
		super();
		this.msgid = msgid;
		this.description = description;
		this.jobseeker_id = jobseeker_id;
		this.empid = empid;
		this.date = date;
	}


	public Integer getMsgid() {
		return msgid;
	}


	public void setMsgid(Integer msgid) {
		this.msgid = msgid;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	

	public Employer getEmpid() {
		return empid;
	}


	public JobSeeker getJobseeker_id() {
		return jobseeker_id;
	}


	public void setJobseeker_id(JobSeeker jobseeker_id) {
		this.jobseeker_id = jobseeker_id;
	}


	public void setEmpid(Employer empid) {
		this.empid = empid;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
}