package com.example.demo.classes;




public class Login {

	
	private String Username;
	private String password;

	public Login() {
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Login(String username, String password) {
		super();
		Username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [Username=" + Username + ", password=" + password + "]";
	}
	

}
