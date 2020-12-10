package com.cg.pl;


import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import javax.persistence.PersistenceException;

import org.apache.log4j.Logger;

import com.cg.entity.AppliedJobs;
import com.cg.entity.AppliedJobsBuilder;
import com.cg.entity.Employer;
import com.cg.entity.EmployerBuilder;
import com.cg.entity.Job;
import com.cg.entity.JobBuilder;
import com.cg.entity.JobSeeker;
import com.cg.entity.JobSeekerBuilder;
import com.cg.entity.Login;
import com.cg.entity.LoginBuilder;
import com.cg.exception.EmployerException;
import com.cg.exception.JobSeekerException;
import com.cg.exception.LoginException;
import com.cg.service.EmployerService;
import com.cg.service.EmployerServiceImpl;
import com.cg.service.JobSeekerService;
//import com.cg.training.entity.Product;
import com.cg.service.JobSeekerServiceImpl;
import com.cg.service.LoginService;
import com.cg.service.LoginServiceImpl;
import com.cg.service.Validation;




public class JobSearchTester {

	private static Scanner scanner=new Scanner(System.in);
	private static EmployerService service= new EmployerServiceImpl();
	private static JobSeekerService jservice = new JobSeekerServiceImpl();
	private static LoginService lservice = new LoginServiceImpl();
	private static Logger plLogger= Logger.getLogger(JobSearchTester.class);
	public static void main(String[] args) throws Exception {
		EmployerBuilder builder=new EmployerBuilder();
		//			registerEmployer(builder);
		JobBuilder jjbuilder=new JobBuilder();
		//postAjob(jjbuilder);
		//			System.out.println("New Employer Added succesfully.. ");
		JobSeekerBuilder jbuilder=new JobSeekerBuilder();
		LoginBuilder lbuilder=new LoginBuilder();
		//			registerJobSeeker(jbuilder);
		//searchJobByDesignation("manager");
		//deleteJob(2);
		//getAllJobs();
		//searchJobByLocation("mumbai");
		//searchJob("manager","fgvhb");
		//addAppliedJobs(4,3);
		//getAllJobSeekers();
		//getJobSeekersBySkillSet("vhbjnk");
		//getSpecificJobDetails(5);
		while(true) {
			System.out.println("Enter 1. Register \n2.Login ");
			System.out.println("Enter the choice: ");
			Integer n=Integer.parseInt(scanner.nextLine());
			try {
				if(n==1) {
					System.out.println("Enter 1. Register as Employer \n2.Register as a Jobseeker ");
					System.out.println("Enter the choice: ");
					Integer ch=Integer.parseInt(scanner.nextLine());
					if(ch==1) {
						registerEmployer(builder);
//						try {
//							Validation validation= new Validation();
//						    if(validation.validate(employerObject)) {
//						    	System.out.println("Valid");
//						    	System.out.println("New Employer Added succesfully.. ");
//						    }else {
//						    	System.out.println("Invalid input to employer object");
//						    }
//							service.registerEmployer(employerObject);
//						} catch (EmployerException e) {
//
//							e.printStackTrace();
//						}
						//System.out.println("New Employer Added succesfully.. ");
						plLogger.trace("New Employer Added succesfully.. ");
						
					}else if(ch==2) {
						registerJobSeeker(jbuilder);
//						try {
//							Validation validation= new Validation();
//						    if(validation.validateJobSeeker(jobseekerObject)) {
//						    	System.out.println("Valid");
//						    	System.out.println("New Jobseeker Added succesfully.. ");
//						    }else {
//						    	System.out.println("Invalid input to jobseeker object");
//						    }
//							jservice.registerJobSeeker(jobseekerObject);
//						} catch (JobSeekerException e) {
//
//							e.printStackTrace();
//						}
						//System.out.println("New Jobseeker Added succesfully.. ");
						plLogger.trace("New Jobseeker Added succesfully.. ");
					}
					else {
						//System.out.println("Invalid choice");
						plLogger.error("Invalid choice");
					}
				}
				else if(n==2) {
					System.out.println("Enter 1. Login as Employer \n2.Login as a Jobseeker ");
					System.out.println("Enter the choice: ");
					Integer ch=Integer.parseInt(scanner.nextLine());
					if(ch==1) {
						loginAsEmployer(lbuilder);
						System.out.println("Enter 1.Post a Job "
								+ "\n2.Delete a Job "
								+ "\n3.View all jobs by Employer"
								+ "\n4.View Jobseekers by Skillset");
						System.out.println("Enter the choice: ");
						Integer choice=Integer.parseInt(scanner.nextLine());
						switch(choice) {
						case 1: 
							postAjob(jjbuilder);
							System.out.println("Job is posted.");
							break;

						case 2:
							System.out.println("Enter the job id to be deleted: ");
							int id=scanner.nextInt();
							deleteJob(id);
							System.out.println("Job is deleted.");
							break;

						case 3:
							getAllJobs();
							break;

						case 4:
							System.out.println("Enter the skillset: ");
							String skill=scanner.nextLine();
							getJobSeekersBySkillSet(skill);
							break;

						default:
							plLogger.error("Invalid choice");
							//System.out.println("Invalid choice");
							break;
						}
					}
					else if(ch==2) {
						loginAsJobSeeker(lbuilder);
						System.out.println("Enter 1.Search job by Designation and skillset "
								+ "\n2.Search job by location "
								+ "\n3.View specific job details");
						System.out.println("Enter the choice: ");
						Integer choice=Integer.parseInt(scanner.nextLine());
						switch(choice) {
						case 1:
							System.out.println("Enter Designation: ");
							String designation=scanner.nextLine();
							System.out.println("Enter Skillset: ");
							String skill=scanner.nextLine();
							searchJob(designation,skill);
							break;

						case 2:
							System.out.println("Enter Location: ");
							String location=scanner.nextLine();
							searchJobByLocation(location);
							break;

						case 3:
							System.out.println("Enter job id: ");
							int id=scanner.nextInt();
							getSpecificJobDetails(id);
							break;

						default :
							plLogger.error("Invalid choice");
							//System.out.println("Invalid choice");
							break;
						}
					}
					else {
						plLogger.error("Invalid choice");
						//System.out.println("Invalid choice");
					}
				}
				else {
					plLogger.error("Invalid choice");
					//System.out.println("Invalid choice");
				}
			}catch(Exception e) {
				plLogger.error(e.getMessage(),e);
//				e.printStackTrace();
			}
		}

	} 
	private static void getSpecificJobDetails(int i) throws Exception {
		List<Job> jobList= service.getAllJobs();
		jobList.stream().filter(j-> j.getId()==i).forEach(System.out::println);
	}
	private static void getAllJobSeekers() throws  Exception {
		List<JobSeeker> jobSeekerList= service.getAllJobSeekers();
		jobSeekerList.stream().forEach(System.out::println);
	}
	private static void getJobSeekersBySkillSet(String string) throws Exception {
		List<JobSeeker> jobSeekerList= service.getAllJobSeekers();
		jobSeekerList.stream().filter(j-> j.getSkillSet().equalsIgnoreCase(string)).forEach(System.out::println);
	}
	private static void addAppliedJobs(int i, int j) {
		AppliedJobs appliedjob=new AppliedJobs();
		AppliedJobsBuilder abuilder=new AppliedJobsBuilder();
		//appliedjob=abuilder.withJob(job)
	}
	private static void searchJob(String string, String string2) throws Exception {
		List<Job> jobList= service.getAllJobs();
		List<Job> jobList1=jobList.stream().filter(j-> j.getTitle().equalsIgnoreCase(string)).collect(Collectors.toList());
		jobList1.stream().filter(j-> j.getSkillSet().equalsIgnoreCase(string2)).forEach(System.out::println);
	}

	private static void searchJobByLocation(String string) throws Exception {
		List<Job> jobList= service.getAllJobs();
		jobList.stream().filter(j-> j.getLocation().equalsIgnoreCase(string)).forEach(System.out::println);
	}
	private static void getAllJobs() throws Exception {
		System.out.println("Enter Employer id: ");
		Integer id=Integer.parseInt(scanner.nextLine());
		List <Job> jobList=service.getAllJobs();
		jobList.stream().filter(j->j.getEmployer().getId()==id)
		.forEach(System.out:: println);
	}
	private static void deleteJob(int i) throws  Exception {
		// TODO Auto-generated method stub
		int id= service.deleteJob(i);
		System.out.println("Product: "+id+" deleted");

	}


	private static void registerJobSeeker(JobSeekerBuilder builder) throws Exception{


		// TODO Auto-generated method stub
		System.out.println("Enter Jobseeker name, "
				+ "\naddress, "
				+ "\ncontact number, "
				+ "\nemail id,"
				+ "\nskills,"
				+ "\npreferred location,"
				+ "\nusername, "
				+ "\npassword ");
		JobSeeker jobSeekerObject=builder.withJobSeeker_Name(scanner.nextLine())
				.withAddress(scanner.nextLine())
				.withContact_No(Long.parseLong(scanner.nextLine()))
				.withMail_ID(scanner.nextLine())
				.withSkillSet(scanner.nextLine())
				.withLocation_preference(scanner.nextLine())
				.withUsername(scanner.nextLine())
				.withPassword(scanner.nextLine())
				.build();
		try {
			jservice.registerJobSeeker(jobSeekerObject);
		} catch (JobSeekerException e) {
			plLogger.error(e.getMessage(),e);
			//e.printStackTrace();
		}
//			return jobSeekerObject;
	}
	private static void registerEmployer(EmployerBuilder builder) throws Exception {
		System.out.println("Enter organization name, "
				+ "\naddress, "
				+ "\ncontact number, "
				+ "\nemail id,"
				+ "\nusername, "
				+ "\npassword ");
		Employer employerObject=builder.withOrganizationName(scanner.nextLine())
				.withAddress(scanner.nextLine())
				.withContactNo(Long.parseLong(scanner.nextLine()))
				.withEmail(scanner.nextLine())
				.withUsername(scanner.nextLine())
				.withPassword(scanner.nextLine())
				.build();
		//.withId(Integer.parseInt(scanner.nextLine()))



		try {
//			Validation validation= new Validation();
//		    if(validation.validate(employerObject)) {
//		    	System.out.println("Valid");
//		    }else {
//		    	System.out.println("Invalid input to employer object");
//		    }
			service.registerEmployer(employerObject);
		} catch (EmployerException e) {
			plLogger.error(e.getMessage(),e);

//			e.printStackTrace();
		}
//		return employerObject;		

	}
	private static void postAjob(JobBuilder jBuilder) throws Exception{
		System.out.println("Enter the job details");
		Job jobObject = jBuilder.withTitle(scanner.nextLine())
				.withLocation(scanner.nextLine()).withDescription(scanner.nextLine())
				.withExperience(scanner.nextLine()).withSalary(Double.parseDouble(scanner.nextLine()))
				.withNoticePeriod(scanner.nextLine()).withStatus(scanner.nextLine())
				.withEmail(scanner.nextLine())
				.withContactNo(Long.parseLong(scanner.nextLine())).withSkillSet(scanner.nextLine()).build();
		Employer employer=service.findById(Integer.parseInt(scanner.nextLine()));
		jobObject.setEmployer(employer);
		try {
			service.postAjob(jobObject);
		}catch(EmployerException e) {
			plLogger.error(e.getMessage(),e);
//			e.printStackTrace();
		}
	}
	private static void loginAsEmployer(LoginBuilder lbuilder) throws LoginException {
		// TODO Auto-generated method stub
		System.out.println("Enter username");
		Login loginObject=lbuilder.
				withUsername(scanner.nextLine())
				.withPassword(scanner.nextLine())
				.withRole("Employer")
				.build();
		lservice.loginAsEmployer(loginObject);
	}

	private static void loginAsJobSeeker(LoginBuilder jobbuilder) {
		// TODO Auto-generated method stub
		System.out.println("Enter username");
		Login loginObject=jobbuilder.
				withUsername(scanner.nextLine())
				.withPassword(scanner.nextLine())
				.withRole("JobSeeker")
				.build();
		lservice.loginAsEmployer(loginObject);

	}
}
