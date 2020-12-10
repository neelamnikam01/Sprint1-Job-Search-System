package com.cg.service;

import com.cg.entity.Employer;
import com.cg.entity.JobSeeker;

public class Validation {
	
		
		public Boolean isValidOrganizationName(Employer employer) {
			String pattern= "[A-Za-z]";
			if(employer.getOrganizationName().matches(pattern)) {
				return true;
			}
			return false;
		}
		
		
		public Boolean isValidAddress(Employer employer) {
			String pattern= "[A-Za-z]";
			if(employer.getAddress().matches(pattern)) {
				return true;
			}
			return false;
		}
		
		
		public Boolean isValidMobile(Employer employer) {
			String mobile=employer.getContactNo().toString(); 
			
			if(mobile.length() == 10 ) {
				
						return true;
					
				
			}		
			return false;
		}
		
		
		public Boolean isValidEmail(Employer employer) {
			String pattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			if(employer.getEmail().matches(pattern)) {
				return true;
			}
			return false;
		}
		
		
		public Boolean isValidUserName(Employer employer) {
			String pattern= "[A-Za-z0-9]";
			if(employer.getUsername().matches(pattern)) {
				return true;
			}
			return false;
		}
		
	
		public Boolean isValidPassword(Employer employer) {
			//TODO
			String pattern="[A-Za-z0-9]";
			if(employer.getPassword().matches(pattern)) {
				return true;
			}
			return false;
		}
		
		public Boolean validate(Employer employer) {
			if( this.isValidOrganizationName(employer) &&
					this. isValidAddress(employer) &&
					 this.isValidMobile(employer) &&
					  this.isValidEmail(employer) &&
					   this. isValidUserName(employer) &&
					   this.isValidPassword(employer)) {
				return true;
			}
			return false;
		}
	

	//*************************************	
		
		public Boolean isValidJobSeekerName(JobSeeker jobseeker) {
			String pattern= "[A-Za-z]";
			if(jobseeker.getJobSeeker_Name().matches(pattern)) {
				return true;
			}
			return false;
		}

		
		public Boolean isValidJobSeekerAddress(JobSeeker jobseeker) {
			String pattern= "[A-Za-z]";
			if(jobseeker.getAddress().matches(pattern)) {
				return true;
			}
			return false;
		}
		
		public Boolean isValidJobSeekerMobile(JobSeeker jobseeker) {
			String mobile=jobseeker.getContact_No().toString(); 
			
			if(mobile.length() == 10 ) {
				
						return true;
					
			}		
			return false;
		}
		
		public Boolean isValidJobSeekerEmail(JobSeeker jobseeker) {
			String pattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			if(jobseeker.getMail_ID().matches(pattern)) {
				return true;
			}
			return false;
		}
		
		
		public Boolean isValidJobSeekerUserName(JobSeeker jobseeker) {
			String pattern= "[A-Za-z0-9]";
			if(jobseeker.getUsername().matches(pattern)) {
				return true;
			}
			return false;
		}
		
		
		
	
		public Boolean isValidJobSeekerPassword(JobSeeker jobseeker) {
			
			String pattern="[A-Za-z0-9]";
			if(jobseeker.getPassword().matches(pattern)) {
				return true;
			}
			return false;
		}
		
		
		public Boolean validateJobSeeker(JobSeeker jobseeker) {
			if( this.isValidJobSeekerName(jobseeker) &&
					this. isValidJobSeekerAddress(jobseeker) &&
					 this.isValidJobSeekerMobile(jobseeker) &&
					  this.isValidJobSeekerEmail(jobseeker) &&
					   this. isValidJobSeekerUserName(jobseeker) &&
					   this.isValidJobSeekerPassword(jobseeker)) {
				return true;
			}
			return false;
		}
}