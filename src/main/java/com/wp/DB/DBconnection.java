package com.wp.DB;

import java.sql.Connection;
import java.sql.DriverManager;
public class DBconnection implements DBconfig {

public static Connection getConn() {
	Connection con1=null;
	try {
		Class.forName(Driver);
		 con1=DriverManager.getConnection(Conn,unm,pw);
	}catch(Exception e) {
		System.out.println("connection");
		
	}
	return con1;
}
 
}

