package com.aquiesce.sqlserver;

import com.aquiesce.sqlserver.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SqlserverApplication {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args)
	{
		SpringApplication.run(SqlserverApplication.class, args);


	}

	@PostConstruct
	public void after(){

		var singleUser = userRepository.findByFirstName("Matt");
		System.out.println(singleUser.getDescription());

		var anotherUser = userRepository.findByLastName("Sales");
		System.out.println(anotherUser.getFirstName());
	}

}
