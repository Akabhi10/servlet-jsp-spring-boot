package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;

@SpringBootApplication
public class SpringBootprojectjdbcCrudApplication implements CommandLineRunner
{
	@Autowired
	private UserDao userDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootprojectjdbcCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
	//	User user1 = new User("Akash","akash@gmail.com","Male","Berhampur");
		User user2 = new User("Amit","amit@gmail.com","Male","Bhubneswar");
		
		boolean status = userDao.insertUser(user2);
		
		if(status)
		{
			System.out.println("successfully inserted");
		}
		else {
			System.out.println("successfully not inserted");
		}
	}

}
