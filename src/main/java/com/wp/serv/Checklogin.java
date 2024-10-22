package com.wp.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wo.DAO.LoginDAO;
import com.wp.DTO.LoginDTO;

/**
 * Servlet implementation class Checklogin
 */
public class Checklogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Checklogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{// TODO Auto-generated method stub
		 String unm1=request.getParameter("nm");
		 String upw1=request.getParameter("pw");
		 
		 LoginDTO d1=new LoginDTO(unm1,upw1,0);
		 LoginDAO t1= new LoginDAO();
		 
		 
		    
		 int x=t1.checklogin(d1);
		 if(x!=0) {
			 
			 HttpSession session=request.getSession(true);
			 session.setAttribute("k",unm1);
			 
	            response.sendRedirect("index.jsp");
		 }
		 else {
			 response.sendRedirect( "Welcome.jsp");
		 }}catch(Exception e){
			 System.out.println(" hello"+e);
		 }
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		
	 
  
      /*  // Get the print writer object to write into the response
        PrintWriter out = response.getWriter();
  
        // Get the session object
        HttpSession session = request.getSession();
  */
         
		doGet(request, response);
	}

}
