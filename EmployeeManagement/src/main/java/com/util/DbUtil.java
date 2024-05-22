package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	public static Connection getDbConnection() throws Exception{
		Connection con = null;
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/servletproj",
                "root", "Sweta@29");
            
		}
		catch(Exception e) {
			System.out.println("The connection is unsuccessfull.");
		}
		return con;
	}
	public static void main(String[] args) {
		try {
			DbUtil.getDbConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
