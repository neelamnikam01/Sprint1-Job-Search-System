package com.cg.entity;

public final class LoginBuilder {
private Integer id;
private String username;
private String password;
private String role;
public LoginBuilder() {
}

public static LoginBuilder anLoginBuilder() {
return new LoginBuilder();
}
public LoginBuilder withUsername(String username) {
this.username = username;
return this;
}
public LoginBuilder withPassword(String password) {
this.password=password;
return this;
}
public LoginBuilder withRole(String role) {
this.role=role;
return this;
}
public LoginBuilder withId(Integer id) {
this.id=id;
return this;
}
public Login build() {
Login login=new Login();
login.setUsername(username);
login.setPassword(password);
login.setRole(role);
return login;
}

}
