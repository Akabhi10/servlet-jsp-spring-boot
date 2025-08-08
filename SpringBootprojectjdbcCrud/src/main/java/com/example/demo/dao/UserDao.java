package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public class UserDao 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean insertUser(User user)
	{
		boolean status = false;
		
		try 
		{
			String INSERT_SQL_QUERY="INSERT INTO Users(name,email,gender,city) value(?,?,?,?)";
			int count= jdbcTemplate.update(INSERT_SQL_QUERY, user.getName(),user.getCity(),user.getEmail(),user.getGender());
			if(count>0)
			{
				status =true;
			}
			else {
				status = false;
			}
		}
		catch(Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;
	}
}
