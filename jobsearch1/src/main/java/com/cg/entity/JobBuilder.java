package com.cg.entity;

public final class JobBuilder {
	
	private int id;
	private String title;
	private String location;
	private String description;
	private String experience;
	private double salary;
	private String noticePeriod;
	private String status;
	private String email;
	private long contactNo;
	private String skillSet;
	private int employer_id;
	private int jobseeker_id;
	
	public JobBuilder() {
		
	}
	public static JobBuilder jobBuilder() {
		return new JobBuilder();
	}
	public JobBuilder withId(int id) {
		this.id = id;
		return this;
	}
	public JobBuilder withTitle(String title) {
		this.title = title;
		return this;
	}
	public JobBuilder withLocation(String location) {
		this.location = location;
		return this;
	}
	public JobBuilder withDescription(String description) {
		this.description = description;
		return this;
	}
	public JobBuilder withExperience(String experience) {
		this.experience = experience;
		return this;
	}
	public JobBuilder withSalary(double salary) {
		this.salary = salary;
		return this;
	}
	public JobBuilder withNoticePeriod(String noticePeriod) {
		this.noticePeriod = noticePeriod;
		return this;
	}
	public JobBuilder withStatus(String status) {
		this.status = status;
		return this;
	}
	public JobBuilder withEmail(String email) {
		this.email = email;
		return this;
	}
	public JobBuilder withContactNo(long contactNo) {
		this.contactNo = contactNo;
		return this;
	}
	public JobBuilder withSkillSet(String skillSet) {
		this.skillSet = skillSet;
		return this;
	}
	public JobBuilder withEmployer_id(int employer_id) {
		this.employer_id = employer_id;
		return this;
	}
	public JobBuilder withJobseeker_id(int jobseeker_id) {
		this.jobseeker_id = jobseeker_id;
		return this;
	}
	
	public Job build() {
		Job job = new Job();
		job.setId(id);
		job.setTitle(title);
		job.setLocation(location);
		job.setDescription(description);
		job.setExperience(experience);
		job.setSalary(salary);
		job.setNoticePeriod(noticePeriod);
		job.setStatus(status);
		job.setEmail(email);
		job.setContactNo(contactNo);
		job.setSkillSet(skillSet);
		//job.setEmployer_id(employer_id);
		job.setJobseeker_id(jobseeker_id);
		return job;
		
	}
}