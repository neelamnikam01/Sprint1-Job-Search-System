package com.cg.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="Message")

public class Message {

	    @Id   
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    @Column(name="id",nullable=false)
	    private Integer id;
	    @Column(name= "description")
            private String description;
	    @Column(name="jobseekerId",nullable=false)
            private Integer jobseekerId;
	    @Column(name="employerId",nullable=false)
            private Integer employerId ;
	    @Column(name="date",nullable=false)
            private Date date;
	   
    public Message() {
        
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getJobSeekerId() {
        return jobseekerId;
    }
    public void setJobSeekerId(Integer jobSeekerId) {
        this.jobseekerId = jobSeekerId;
    }
    public Integer getEmployerId() {
        return employerId;
    }
    public void setEmployerId(Integer employerId) {
        this.employerId = employerId;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "Message [id=" + id + ", description=" + description + ", jobSeekerId="
                + jobseekerId + ", employerId=" + employerId + ", date=" + date + "]";
    }

	
    
}
 