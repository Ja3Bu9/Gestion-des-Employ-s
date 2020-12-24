package com.employees.controllers;

import java.sql.SQLException;

import com.employees.config.ConnectDB;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class Query {

	ConnectDB con;
	
	public Query() {
		con.Connect("jdbc:mysql://localhost/gestion des ustensiles","root", "phpmysami");
	}
	
	
}
