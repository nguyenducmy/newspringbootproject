package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class UserService {
	@Autowired 
	private UserRespository repo;
	public List <User> listAll()
			{
				return repo.findAll();
				
					
			}
	
}
