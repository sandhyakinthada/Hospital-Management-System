package com.hospital;

public class Feedback {
	private String email;
    private String name;
    private String message;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Feedback(String email, String name, String message) {
		super();
		this.email = email;
		this.name = name;
		this.message = message;
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Feedback [email=" + email + ", name=" + name + ", message=" + message + "]";
	}


}
