package com.cg.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="jobseeker")
public class JobSeeker {
	//private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "id",nullable=false)
//	@OneToMany(mappedBy="jobseeker_id")
	private Integer jobSeeker_Id;
	@Column(name= "name",nullable=false)
	private String jobSeeker_Name;
	@Column(name= "address",nullable=false)
	private String address;
	@Column(name= "contact_no",nullable=false)
	private Long contact_No;
	@Column(name= "email",nullable=false)
	private String mail_ID;
	@Column(name= "skill_set",nullable=false)
	private String skillSet;
	@Column(name= "location_preference",nullable=false)
	private String location_preference;
	@Column(name= "username",nullable=false)
	private String username;
	@Column(name= "password",nullable=false)
	private String password;
//	@OneToMany(mappedBy="jobseeker_id")
//	private Set<AppliedJobs> appliedJobs=new HashSet<AppliedJobs>();
	public JobSeeker() {
		
	}
	public Integer getJobSeeker_Id() {
		return jobSeeker_Id;
	}
	public void setJobSeeker_Id(Integer jobSeeker_Id) {
		this.jobSeeker_Id = jobSeeker_Id;
	}
	public String getJobSeeker_Name() {
		return jobSeeker_Name;
	}
	public void setJobSeeker_Name(String jobSeeker_Name) {
		this.jobSeeker_Name = jobSeeker_Name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getContact_No() {
		return contact_No;
	}
	public void setContact_No(Long contact_No) {
		this.contact_No = contact_No;
	}
	public String getMail_ID() {
		return mail_ID;
	}
	public void setMail_ID(String mail_ID) {
		this.mail_ID = mail_ID;
	}
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	public String getLocation_preference() {
		return location_preference;
	}
	public void setLocation_preference(String location_preference) {
		this.location_preference = location_preference;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "JobSeeker [jobSeeker_Id=" + jobSeeker_Id + ", jobSeeker_Name=" + jobSeeker_Name + ", address=" + address
				+ ", contact_No=" + contact_No + ", mail_ID=" + mail_ID + ", skillSet=" + skillSet
				+ ", location_preference=" + location_preference + ", username=" + username + ", password=" + password
				+ "]";
	}
	
	
	
//	public Set<AppliedJobs> getAppliedJobs() {
//		return appliedJobs;
//	}
//	public void setAppliedJobs(Set<AppliedJobs> appliedJobs) {
//		this.appliedJobs = appliedJobs;
//	}
//	
//	public void addAppliedJobs(AppliedJobs appliedjobs) {
//		this.appliedJobs.add(appliedjobs);
//	}
	
}