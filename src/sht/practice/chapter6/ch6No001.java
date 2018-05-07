package sht.practice.chapter6;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ch6No001")
public class ch6No001 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;cahrset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String name =request.getParameter("name");
		String num=request.getParameter("number");
		int number=Integer.parseInt(num);
		Employee em=new Employee(name,number);
		request.setAttribute("em", em);
		RequestDispatcher rd=request.getRequestDispatcher("/ch6No002");
		rd.forward(request, response);
	}

}
