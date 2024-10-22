package com.wo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.wp.DB.DBconnection;
import com.wp.DTO.RegDTO;

public class RegistrationDAO {
	public int insertReg(RegDTO t1) {
		int x=0;
		try {
			Connection con1=DBconnection.getConn();
			PreparedStatement ps=con1.prepareStatement("insert into logintable(username,upassword) values(?,?)");
			 
			ps.setString(1,t1.getUnm());
			ps.setString(2,t1.getUpw());
			 
			 
			x=ps.executeUpdate();
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		return x;
		
	}

}
