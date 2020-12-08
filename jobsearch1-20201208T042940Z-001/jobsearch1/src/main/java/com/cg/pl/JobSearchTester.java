package com.cg.pl;


import java.util.Scanner;

import com.cg.entity.Employer;
import com.cg.entity.EmployerBuilder;
import com.cg.exception.EmployerException;
import com.cg.service.EmployerService;
import com.cg.service.EmployerServiceImpl;
//import com.cg.training.entity.Product;



public class JobSearchTester {

	private static Scanner scanner=new Scanner(System.in);
	private static EmployerService service= new EmployerServiceImpl();
	
	public static void main(String[] args) throws Exception {
		 EmployerBuilder builder=new EmployerBuilder();
			registerEmployer(builder);
			System.out.println("New Employer Added succesfully.. ");

	}

	private static void registerEmployer(EmployerBuilder builder) throws Exception {
		System.out.println("Enter organization name:");
		Employer employerObject=builder.withOrganizationName(scanner.nextLine())
		.withAddress(scanner.nextLine())
		.withContactNo(Long.parseLong(scanner.nextLine()))
		.withEmail(scanner.nextLine())
		.withUsername(scanner.nextLine())
		.withPassword(scanner.nextLine())
		.build();
		//.withId(Integer.parseInt(scanner.nextLine()))
		
		

		try {
			service.registerEmployer(employerObject);
		} catch (EmployerException e) {
			
			e.printStackTrace();
		}		
		
	}

}
