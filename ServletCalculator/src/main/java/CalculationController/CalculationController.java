package CalculationController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import linkcode.model.Calculationview;

/**
 * Servlet implementation class CalculationController
 */
@WebServlet("/CalculationController")
public class CalculationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str1=request.getParameter("num1");
		String str2=request.getParameter("num2");
		
		int num1=Integer.parseInt(str1);
		int num2=Integer.parseInt(str2);
		
		Calculationview calci=new Calculationview();
		calci.setNum1(num1);
		calci.setNum2(num2);
		calci.setSum(calci.getNum1()+calci.getNum2());
		calci.setSub(calci.getNum1()-calci.getNum2());
		calci.setMul(calci.getNum1()*calci.getNum2());
		calci.setDiv(calci.getNum1()/calci.getNum2());
		
		PrintWriter pw=response.getWriter();
		pw.print("<h1>Number1 is: "+calci.getNum1()+"</h1>");
		pw.print("<h1>Number2 is: "+calci.getNum2()+"</h1>");
		pw.print("<h1>Addition is: "+calci.getSum()+"</h1>");
		pw.print("<h1>Subtraction is:"+calci.getSub()+"</h1>");
		pw.print("<h1>Multiplication is:"+calci.getMul()+"</h1>");
		pw.print("<h1>Division is:"+calci.getDiv()+"</h1>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
