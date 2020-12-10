package com.cg.pl;

import java.util.Scanner;

import com.cg.entity.EmployerBuilder;
import com.cg.exception.EmployerException;
import com.cg.service.EmployerService;
import com.cg.service.EmployerServiceImpl;


public class JobSearchTester {
	private static Scanner sc= new Scanner(System.in);
	private static EmployerService service= new EmployerServiceImpl();
public static void main(String args[]) throws EmployerException
{
EmployerBuilder ebuilder=new EmployerBuilder();
//.setAddress("Pune").setId(1).setOrganizationName("Capg").setContactNo(12345).setEmail("ab@gmailcom").setUsername("abc").setPassword("12@tyy");
//Employer e=ebuilder.getEmployer();
//System.out.println(e);
registerEmployer(ebuilder);
System.out.println("New Employer Added");
}
/*JobSeekerBuilder jbuilder=new JobSeekerBuilder().setJobSeeker_Name("Daksh");
JobSeeker j=jbuilder.getJobSeeker();
System.out.println(j);
MessageBuilder mbuilder=new MessageBuilder().setDescription("Software developer");
Message m=mbuilder.getMessage();
System.out.println(m);
LoginBuilder lbuilder=new LoginBuilder().setPassword("123$ab");
Login l=lbuilder.getLogin();
System.out.println(l);
JobBuilder jobuilder=new JobBuilder().setContactEmail("can@gmail.com");
Job jo=jobuilder.getJob();
System.out.println(jo);*/

//}
private static void registerEmployer(EmployerBuilder ebuilder) throws EmployerException {
	// TODO Auto-generated method stub
	System.out.println("Enter organization name:");
	ebuilder.setOrganizationName(sc.nextLine());
	System.out.println("Enter address:");
	ebuilder.setAddress(sc.nextLine());
	System.out.println("Enter contactNo.:");
	ebuilder.setContactNo(sc.nextLong());
	System.out.println("Enter email:");
	ebuilder.setEmail(sc.nextLine());
	sc.nextLine();
	System.out.println("Enter username:");
	ebuilder.setUsername(sc.nextLine());
	System.out.println("Enter password:");
	ebuilder.setPassword(sc.nextLine());
	System.out.println("Enter id:");
	ebuilder.setId(sc.nextInt());
	service.registerEmployer(ebuilder);
}
}
