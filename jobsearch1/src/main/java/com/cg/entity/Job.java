 package com.cg.entity;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Job")
public class Job {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id",nullable=false)
//	@OneToMany(mappedBy="job_id")
	private int id;
	@Column(name="title", nullable = false)
	private String title;
	@Column(name="location", nullable = false)
	private String location;
	@Column(name="description", nullable = false)
	private String description;
	@Column(name="experience", nullable = false)
	private String experience;
	@Column(name="salary", nullable = false)
	private double salary;
	@Column(name="noticePeriod", nullable = false)
	private String noticePeriod;
	@Column(name="status", nullable = false)
	private String status;
	@Column(name="email", nullable = false)
	private String email;
	@Column(name="contactNo", nullable = false)
	private long contactNo;
	@Column(name="skillSet", nullable = false)
	private String skillSet;
	@ManyToOne
	//@JoinColumn(name="employer_id",nullable=false)
	//@JoinColumn(name="employer_id",referencedColumnName = "id")
	//private int employer_id;
	@JoinColumn(name="employer_id")
	private Employer employer;
	@Column(name="jobseeker_id", nullable = false)
	private int jobseeker_id;
//	@OneToMany(mappedBy="job_id")
//	private Set<AppliedJobs> appliedJobs=new HashSet<AppliedJobs>();
//	
	public Job() {
		
	}
	
//	public Job(int id, String title, String location, String description, String experience, double salary,
//			String noticePeriod, String status, String email, long contactNo, String skillSet, int employer_id,
//			int jobseeker_id) {
//		super();
//		this.id = id;
//		this.title = title;
//		this.location = location;
//		this.description = description;
//		this.experience = experience;
//		this.salary = salary;
//		this.noticePeriod = noticePeriod;
//		this.status = status;
//		this.email = email;
//		this.contactNo = contactNo;
//		this.skillSet = skillSet;
//		//this.employer_id = employer_id;
//		this.jobseeker_id = jobseeker_id;
//	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getNoticePeriod() {
		return noticePeriod;
	}
	public void setNoticePeriod(String noticePeriod) {
		this.noticePeriod = noticePeriod;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
//	public Employer getEmployer() {
//		return getEmployer();
//	}
//	public void setEmployer(Employer employer) {
//		this.employer = employer;
//	}
	
	public int getJobseeker_id() {
		return jobseeker_id;
	}
	public void setJobseeker_id(int jobseeker_id) {
		this.jobseeker_id = jobseeker_id;
	}
	

//	public Set<AppliedJobs> getAppliedJobs() {
//		return appliedJobs;
//	}
//
//	public void setAppliedJobs(Set<AppliedJobs> appliedJobs) {
//		this.appliedJobs = appliedJobs;
//	}
//	public void addAppliedJobs(AppliedJobs appliedjobs) {
//		this.appliedJobs.add(appliedjobs);
//	}
//
//	

	
	public Employer getEmployer() {
		return employer;
	}

	@Override
	public String toString() {
		return "Job [id=" + id + ", title=" + title + ", location=" + location + ", description=" + description
				+ ", experience=" + experience + ", salary=" + salary + ", noticePeriod=" + noticePeriod + ", status="
				+ status + ", email=" + email + ", contactNo=" + contactNo + ", skillSet=" + skillSet + ", employer="
				+ employer.getId() + ", jobseeker_id=" + jobseeker_id + "]";
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	
	
	

}