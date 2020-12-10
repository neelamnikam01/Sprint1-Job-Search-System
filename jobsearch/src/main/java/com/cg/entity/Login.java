package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Login")
public class Login {
	public Login(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}
	@Id
	@Column(name="username")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String username;
	@Column(name="password",nullable =false)
	private String password;
	@Column(name="role",nullable =false)
	private String role;
public Login()
{
	
}
public String getUsername() {
	return username;
}
public String getPassword() {
	return password;
}
public String getRole() {
	return role;
}
@Override
public String toString() {
	return "Login [username=" + username + ", password=" + password + ", role=" + role + "]";
}

}
