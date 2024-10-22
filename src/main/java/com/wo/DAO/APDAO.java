package com.wo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.wp.DB.DBconnection;
import com.wp.DTO.APDTO;
 

public class APDAO {
	public int insertAPD(APDTO t1) {
		int x=0;
		try {
			Connection con1=DBconnection.getConn();
			PreparedStatement ps=con1.prepareStatement("insert into appoint(pname,p_age,pcnt,doctor) values(?,?,?,?)");
			 
			ps.setString(1,t1.getName());
			ps.setInt(2,t1.getAge());
			ps.setInt(3,t1.getCnt());
			ps.setString(4,t1.getDr());
			 
			 
			x=ps.executeUpdate();
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		return x;
		
	}
}
