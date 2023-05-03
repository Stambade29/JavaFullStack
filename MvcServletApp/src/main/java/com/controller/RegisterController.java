package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.RegisterDao;
import com.model.Register;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String rno=request.getParameter("rno");
		String fname=request.getParameter("fname");
		String mob=request.getParameter("mob");
		int regNo=Integer.parseInt(rno);
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		float amt=Float.parseFloat(request.getParameter("amt"));
		
		Register reg=new Register();
		reg.setRegno(regNo);
		reg.setFname(fname);
		reg.setMob(mob);
		reg.setUname(uname);
		reg.setPass(pass);
		reg.setAmt(amt);
		
		RegisterDao rd=new RegisterDao();
		int i=rd.saveData(reg);
		if(i>0)
		{
			response.sendRedirect("Login.html");
		}	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
