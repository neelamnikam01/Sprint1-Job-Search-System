package com.cg.entity;

import javax.persistence.Column;

public class JobSeekerBuilder {
	private Integer jobSeeker_Id;
	private String jobSeeker_Name;
	private String address;
	private Long contact_No;
	private String mail_ID;
	private String skillSet;
	private String location_preference;
	private String username;
	private String password;
	public JobSeekerBuilder() {
		
	}
	public static JobSeekerBuilder anJobSeekerBuilder() {
		return new JobSeekerBuilder();
	} 
	public JobSeekerBuilder withJobSeeker_Id(Integer jobSeeker_Id) {
		this.jobSeeker_Id=jobSeeker_Id;
		return this;
	}
	public JobSeekerBuilder withJobSeeker_Name(String jobSeeker_Name) {
		this.jobSeeker_Name=jobSeeker_Name;
		return this;
	}
	public JobSeekerBuilder withAddress(String address) {
		this.address=address;
		return this;
	}
	public JobSeekerBuilder withContact_No(Long contact_No) {
		this.contact_No=contact_No;
		return this;
	}
	public JobSeekerBuilder withMail_ID(String mail_ID) {
		this.mail_ID=mail_ID;
		return this;
	}
	public JobSeekerBuilder withSkillSet(String skillSet) {
		this.skillSet=skillSet;
		return this;
	}
	public JobSeekerBuilder withLocation_preference(String location_preference) {
		this.location_preference=location_preference;
		return this;
	}
	public JobSeekerBuilder withUsername(String username) {
		this.username=username;
		return this;
	}
	public JobSeekerBuilder withPassword(String password) {
		this.password=password;
		return this;
	}
	public JobSeeker build() {
		JobSeeker jobSeeker=new JobSeeker();
		jobSeeker.setJobSeeker_Id(jobSeeker_Id);
		jobSeeker.setJobSeeker_Name(jobSeeker_Name);
		jobSeeker.setAddress(address);
		jobSeeker.setContact_No(contact_No);
		jobSeeker.setMail_ID(mail_ID);
		jobSeeker.setSkillSet(skillSet);
		jobSeeker.setLocation_preference(location_preference);
		jobSeeker.setUsername(username);
		jobSeeker.setPassword(password);
		return jobSeeker;
	}
}
