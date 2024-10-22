package com.wo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.wp.DB.DBconnection;
import com.wp.DTO.LoginDTO;

public class LoginDAO {

	public int checklogin(LoginDTO t1) {
		 int x=0;
		 try {
			 Connection con1=DBconnection.getConn();
			 
			 PreparedStatement ps=con1.prepareStatement("select * from logintable where username=? and upassword=?");
			 ps.setString(1,t1.getUnm());
			 ps.setString(2,t1.getUpw());
			 
			 ResultSet rs=ps.executeQuery();
			 if(rs.next()) {
				 x=1;
				 
			 } 
			 else {
				 System.out.println("couldnt execute query");
			 }}
			 catch(Exception ee) {
				 System.out.println(" exception in DAO");
			 }
			 return x;
			 
		 }
	 
	}


