package com.cg.entity;

public class EmployerBuilder {

	private String organizationName;
	private String address;
	private long contactNo;
    private String email;
    private String username;
    private String password;
    private int id;
    public EmployerBuilder()
    {
    	
    }
	public EmployerBuilder setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
		return this;
	}
	public EmployerBuilder setAddress(String address) {
		this.address = address;
		return this;
	}
	public EmployerBuilder setContactNo(long contactNo) {
		this.contactNo = contactNo;
		return this;
	}
	public EmployerBuilder setEmail(String email) {
		this.email = email;
		return this;
	}
	public EmployerBuilder setUsername(String username) {
		this.username = username;
		return this;
	}
	public EmployerBuilder setPassword(String password) {
		this.password = password;
		return this;
	}
	public EmployerBuilder setId(int id) {
		this.id = id;
		return this;
	}
	public Employer getEmployer()
	{
		return new Employer(organizationName,address,contactNo,email,username,password,id);
	}
    
}
