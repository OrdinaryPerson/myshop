
package com.imufe.ws.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JdbcUtil {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/wsshop?useUnicode=true&characterEncoding=utf-8";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	public static Connection getConnection() throws Exception {
		try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public static void closeAll(Connection con, Statement stmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close(); 
				rs = null;   
			}
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
			if (con != null && !con.isClosed()) {
				con.close();
				con = null;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(getConnection());
	}

}
