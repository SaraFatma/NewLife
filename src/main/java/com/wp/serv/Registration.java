package com.wp.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import  com.wp.DTO.*;
import com.wo.DAO.*;

/**
 * Servlet implementation class Registration
 */
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
			 String unm1=request.getParameter("nm2");
			 String upw1=request.getParameter("pw2");
			 
			 RegDTO t1=new RegDTO(unm1,upw1,1,0);
			 RegistrationDAO reg=new RegistrationDAO( );
			 
			 int tmp=reg.insertReg(t1);
		 response.sendRedirect("index.jsp");
			/* PrintWriter pw=response.getWriter();
			 pw.println(tmp+"DATA INSERTED");*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
