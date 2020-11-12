package com.development.springjpahibernateexample.resource;

import java.util.List;

import com.development.springjpahibernateexample.repository.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.development.springjpahibernateexample.models.Users;



@RestController
@RequestMapping("/rest/users")
public class UsersResource {
	
	@Autowired
	UsersRepository usersRepository;
	
	@GetMapping("/all")
	public List<Users> getAll(){
		return usersRepository.findAll();
	}

}
