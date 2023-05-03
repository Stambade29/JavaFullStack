package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.RegisterDao;
import com.model.Register;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int regNo=Integer.parseInt(request.getParameter("regNo"));
		String custName=request.getParameter("custName");
		int accBal=Integer.parseInt(request.getParameter("accNo"));
		
		Register r=new Register(regNo, custName, accBal);
		RegisterDao dao=new RegisterDao();
		int i=dao.createAccount(r);
		
		PrintWriter pw=response.getWriter();
		if(i>0) {
			response.sendRedirect("Login.html");
		}
			//pw.print("<h1> Account created....</h1>");
		}
		//pw.print(r.getRegNo());
		//pw.print(r.getCustName());
		//pw.print(r.getAccNo());	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
