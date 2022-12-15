package com.luv2code.springboot.cruddemo.dao;

import java.sql.*;
import java.util.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Dog;

@Repository
public class DogDAOJdbcImpl implements DogDAO {

	@Autowired
	DataSource dataSource;

	Connection myConn = null;
	Statement myStmt = null;
	ResultSet myRs = null;

	@Override
	public List<Dog> findAll() {
		System.out.println("Implementación DAO con JDBC: "+ dataSource);
		
		List<Dog> listDogs = new ArrayList<>();
		
		try {
			myConn = dataSource.getConnection();
			// create sql statement
			String sql = "select * from dog";
			
			myStmt = myConn.createStatement();
			
			// execute query
			myRs = myStmt.executeQuery(sql);
			
			// process result set
			while (myRs.next()) {
										
				// retrieve data from result set row
				int id = myRs.getInt("id");
				String name = myRs.getString("name");
				String breed = myRs.getString("breed");
				int age = myRs.getInt("age");
							
				// create new dog object
				Dog tempDog = new Dog(id, name, breed, age);
							
				// add it to the list of students
				listDogs.add(tempDog);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listDogs;
	}

	@Override
	public Dog findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Dog theDog) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub

	}

}
