package com.cg.entity;

import java.util.Date;

public final class MessageBuilder {

	
	    private Integer id;
	    
            private String description;
	    
            private Integer jobseekerId;
	   
            private Integer employerId ;
	    
            private Date date;
	   
    public MessageBuilder()
    {
    	
    }
    
    public static MessageBuilder anMessageBuilder() {
    	return new MessageBuilder();
    }
       public MessageBuilder withId(Integer id) {
		this.id = id;
		return this;
	}
	public MessageBuilder withDescription(String description) {
		this.description = description;
		return this;
	}
	public MessageBuilder withjobseekerId(Integer jobseekerId) {
		this.jobseekerId = jobseekerId;
		return this;
	}
	public MessageBuilder withEmployerId(Integer employerId) {
		this.employerId = employerId;
		return this;
	}
	public MessageBuilder withDate(Date date) {
		this.date = date;
		return this;
	}
	
	
	public Message build()
	{
		Message message=new Message();
                message.setId(id);
		message.setDescription(description);
		message.setJobSeekerId(jobseekerId);
		message.setEmployerId(employerId);
		message.setDate((java.sql.Date) date);
		
		
		
		return message;
		
	}
    
}