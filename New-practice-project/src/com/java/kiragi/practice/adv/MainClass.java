package com.java.kiragi.practice.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.java.kiragi.practice.std.EmployeeComparableComparator;

public class MainClass {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/mysql?useSSL=false&characterEncoding=utf8";
		String username = "root";
		String password = "6472";
		 
		try { Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, username, password) ;
			System.out.println("Connection successful!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
