
package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.model.User;

@Service("mainUserService")
public class UserService implements IUserService{

	private List<User> list;
	private int lastId;
	public UserService() {
		list = new ArrayList<User>();
		User user = new User(1, "Pippo","Rossi", "0123456789", "siiiii@example.sium");
		User user2 = new User(2, "Michele","Rossi", "0123456789", "siiiii@example.sium");
		User user3 = new User(3, "Antonio","Rossi", "0123456789", "siiiii@example.sium");
		list.add(user);
		list.add(user2);
		list.add(user3);
		lastId=3;
	}
	
	@Override
	public Iterable<User> getAllUser(){
		return list;
	}

	@Override
	public Optional<User> getById(int id) {
		Optional <User> item = list.stream().filter(a->a.getId()==id).findFirst();
		if(item.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
		return item;
	}
	
	@Override
	public User create(User user) {
		lastId++;
		user.setId(lastId);
		list.add(user);
		return user;
	}
	
	@Override
	public Optional<User> update(int id, User user) {
		Optional<User> foundUser = list.stream().filter(a->a.getId()==id).findFirst();
		if(foundUser.isEmpty()) {
			return Optional.empty();
		}
		foundUser.get().setLastname(user.getLastname());
		foundUser.get().setName(user.getName());
		foundUser.get().setCell(user.getCell());
		foundUser.get().setEmail(user.getEmail());
		return foundUser;
		
	}
	
	@Override
	public Boolean delete(int id) {
		Optional<User> foundUser = list.stream().filter(a->a.getId()==id).findFirst();
		if(foundUser.isEmpty()) {
				return false;
		}
		list.remove(foundUser.get());
		return true;
	}
	
}
