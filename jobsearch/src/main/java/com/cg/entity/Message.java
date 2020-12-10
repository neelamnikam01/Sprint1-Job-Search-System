package com.cg.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Message")
public class Message {
	@Id
	@Column (name="message_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer msgid;
	@Column(name="description",nullable=false)
	private String description;
	@Column(name="jobseeker_id",nullable=false)
	private Integer jobseeker_id;
	@Column(name="employer_id",nullable=false)
	private Integer empid;
	@Column(name="date",nullable=false)
	private LocalDate date;
	
	public Message()
	{
		
	}
	public Message(Integer msgid, String description, Integer jobseeker_id, Integer empid, LocalDate date) {
		super();
		this.msgid = msgid;
		this.description = description;
		this.jobseeker_id = jobseeker_id;
		this.empid = empid;
		this.date = date;
	}

	public Integer getMsgid() {
		return msgid;
	}

	public String getDescription() {
		return description;
	}


	public Integer getEmpid() {
		return empid;
	}


	public Integer getJobseeker_id() {
		return jobseeker_id;
	}

	public LocalDate getDate() {
		return date;
	}


	


	@Override
	public String toString() {
		return "Message [msgid=" + msgid + ", description=" + description + ", jobseeker_id=" + jobseeker_id
				+ ", empid=" + empid + ", date=" + date + "]";
	}
	
	
	
	
}