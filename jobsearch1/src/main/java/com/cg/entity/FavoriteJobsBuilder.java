package com.cg.entity;

public final class FavoriteJobsBuilder {
	private Integer id;
	private Integer job_id;
	private Integer jobseeker_id;
	private String name;
	
	public FavoriteJobsBuilder() {
		
	}
	
	public static FavoriteJobsBuilder anFavJobsBuilder() {
    	return new FavoriteJobsBuilder();
    }
	public FavoriteJobsBuilder withId(Integer id) {
		this.id = id;
		return this;
	}
	public FavoriteJobsBuilder withJobId(Integer job_id) {
		this.job_id=job_id;
		return this;
	}
	public FavoriteJobsBuilder withJobseekerId(Integer jobseeker_id) {
		this.jobseeker_id=jobseeker_id;
		return this;
	}
	public FavoriteJobsBuilder withname(String name) {
		this.name=name;
		return this;
	}
	
	public FavoriteJobs build() {
		FavoriteJobs favJobs=new FavoriteJobs();
		favJobs.setId(id);
		favJobs.setJob_id(job_id);
		favJobs.setJobseeker_id(jobseeker_id);
		favJobs.setName(name);
		
		return favJobs;
	}

}