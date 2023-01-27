package com.example.demo.model;

public class Todo {
	private int id;
	private String title;
	private String subtitle;
	public Todo() {
		
	}
	public Todo(int id, String title, String subtitle) {
		this.id = id;
		this.setTitle(title);
		this.setSubtitle(subtitle);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
}
