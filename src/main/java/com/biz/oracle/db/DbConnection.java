package com.biz.oracle.db;

import java.sql.*;

public class DbConnection {
	
	static private Connection dbConn;
	
	static {
		String oracleDriver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "mybts";
		String password = "1234";
		
		try {
			Class.forName(oracleDriver);
			dbConn = DriverManager.getConnection(url, 
					user, password);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
