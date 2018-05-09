package sht.practice.chapter9;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ch9No001
 */
@WebServlet("/ch9No001")
public class ch9No001 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String kg= request.getParameter("kg");
		String tall=request.getParameter("tall");
		double heavy= Double.parseDouble(kg);
		double height=Double.parseDouble(tall);
		BMICalc bmi=new BMICalc();
		double BMI=bmi.BMICalc(heavy, height);
		BMIBeans bean=new BMIBeans(height,heavy,BMI);
		request.setAttribute("debu", bean);
		RequestDispatcher rd=request.getRequestDispatcher("/practice/chapter9/No001.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
