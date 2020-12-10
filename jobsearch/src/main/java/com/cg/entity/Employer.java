package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employer")
public class Employer 
{
    @Id
    @Column(name= "organization_Name")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String organizationName;
    @Column(name="address",nullable=false)
    private String address;
    @Column(name="contact_no",nullable=false)
    private long contactNo;
    @Column(name="email",nullable=false)
    private String email;
    @Column(name="username",nullable=false)
    private String username;
    @Column(name="password",nullable=false)
    private String password;
    @Column(name="id",nullable=false)
    private int id;
    
    public Employer()
    {
    	
    }
    public Employer(String organizationName,String address,long contactNo,String email,String username,String password,int id) {
    	super();
    	this.organizationName=organizationName;
    	this.address=address;
    	this.contactNo=contactNo;
    	this.email=email;
    	this.username=username;
    	this.password=password;
    	this.id=id;
    }
    
  
    
    
    

	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employer [organisationName=" + organizationName + ", address=" + address + ", contactNo=" + contactNo
				+ ", email=" + email + ", username=" + username + ", password=" + password + ", id="
				+ id + "]";
	}
	

 

}