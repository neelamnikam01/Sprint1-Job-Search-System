package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Job")

public class Job {
	
	@Id
    @Column(name= "id",nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer jobId;
	@Column(name= "job_title", nullable=false)
	private String jobTitle;
	@Column(name= "location", nullable=false)
	private String location;
	@Column(name= "description", nullable=false)
	private String description;
	@Column(name= "experience", nullable=false)
	private Integer experience;
	@Column(name= "salary", nullable=false)
	private Double salary;
	@Column(name= "notice_period", nullable=false)
	private Integer noticePeriod;
	@Column(name= "contact_email", nullable=false)
	private String contactEmail;
	@Column(name= "status", nullable=false)
	private String status;
	@Column(name= "skill_set", nullable=false)
	private String skillSet;
	
	
	public Job() {
		
	}


	public Job(Integer jobId, String jobTitle, String location, String description, Integer experience, Double salary,
			Integer noticePeriod, String contactEmail, String status, String skillSet) {
		super();
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.location = location;
		this.description = description;
		this.experience = experience;
		this.salary = salary;
		this.noticePeriod = noticePeriod;
		this.contactEmail = contactEmail;
		this.status = status;
		this.skillSet=skillSet;
	}


	public String getSkillSet() {
		return skillSet;
	}


	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}


	public Integer getJobId() {
		return jobId;
	}


	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Integer getExperience() {
		return experience;
	}


	public void setExperience(Integer experience) {
		this.experience = experience;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public Integer getNoticePeriod() {
		return noticePeriod;
	}


	public void setNoticePeriod(Integer noticePeriod) {
		this.noticePeriod = noticePeriod;
	}


	public String getContactEmail() {
		return contactEmail;
	}


	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", jobTitle=" + jobTitle + ", location=" + location + ", description="
				+ description + ", experience=" + experience + ", salary=" + salary + ", noticePeriod=" + noticePeriod
				+ ", contactEmail=" + contactEmail + ", status=" + status + ", skillSet=" + skillSet + "]";
	}


	
	
	
	

}