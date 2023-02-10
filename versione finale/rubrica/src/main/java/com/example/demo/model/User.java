package com.example.demo.model;

public class User {

	private int id;
	private String name;
	private String lastname;
	private String cell;
	private String email;
	
	public User(int id, String name, String lastname, String cell, String email) {
		this.id = id;
		this.setName(name);
		this.setLastname(lastname);
		this.setCell(cell);
		this.setEmail(email);
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCell() {
		return cell;
	}
	public void setCell(String cell) {
		this.cell = cell;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
