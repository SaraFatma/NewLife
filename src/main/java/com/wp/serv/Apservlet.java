package com.wp.serv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wo.DAO.APDAO;
import com.wo.DAO.RegistrationDAO;
import com.wp.DTO.APDTO;
import com.wp.DTO.RegDTO;

/**
 * Servlet implementation class Apservlet
 */
public class Apservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Apservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 String nm1=request.getParameter("pnm");
		 String dr1=request.getParameter("dr");
		 int age1=Integer.parseInt(request.getParameter("age"));
		 int cnt1=Integer.parseInt(request.getParameter("cnt"));
		 
		 APDTO t1=new APDTO(cnt1,age1,nm1,dr1,1);
		 
		 APDAO ap=new APDAO();
		 
		 int tmp=ap.insertAPD(t1);
	 response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
