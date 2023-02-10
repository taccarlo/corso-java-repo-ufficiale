package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.User;

public interface IUserService {

	public Iterable<User> getAllUser();

	public Optional<User> getById(int id);
	
	public User create(User user);
	
	public Optional<User> update(int id, User user);
	
	public Boolean delete(int id);

}



