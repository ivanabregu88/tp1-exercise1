package com.tp1;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginMB {

	private String user;
	private String password;

	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void save() {
		System.out.println("Usuario: " + user);
		System.out.println("Contraseña: " + password);
	}
}
