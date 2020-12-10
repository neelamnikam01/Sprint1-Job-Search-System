
package com.cg.entity;

import java.sql.Date;

 

public class JobSeekerMessage {
    private Integer messageId;
    private String description;
    private Integer jobSeekerId;
    private Integer employerId;
    private Date date;
    
    public JobSeekerMessage() {
        
    }
    public JobSeekerMessage(Integer messageId, String description, Integer jobSeekerId, Integer employerId, Date date) {
        super();
        this.messageId = messageId;
        this.description = description;
        this.jobSeekerId = jobSeekerId;
        this.employerId = employerId;
        this.date = date;
    }
    public Integer getMessageId() {
        return messageId;
    }
    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getJobSeekerId() {
        return jobSeekerId;
    }
    public void setJobSeekerId(Integer jobSeekerId) {
        this.jobSeekerId = jobSeekerId;
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
        return "JobSeekerMessage [messageId=" + messageId + ", description=" + description + ", jobSeekerId="
                + jobSeekerId + ", employerId=" + employerId + ", date=" + date + "]";
    }
    
    
}
 