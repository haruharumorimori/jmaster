package sht.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sht.beans.PlusBean;

/**
 * Servlet implementation class PlusServlet
 */
@WebServlet("/PlusServlet")
public class PlusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String num1=request.getParameter("value1");
		String num2=request.getParameter("value2");

			int i1=Integer.parseInt(num1);
			int i2=Integer.parseInt(num2);
			int answer=i1+i2;

//			request.setAttribute("data1",new Integer(i1));
//			request.setAttribute("data2",new Integer(i2));
//			request.setAttribute("answer",new Integer(answer));

			PlusBean bean=new PlusBean(i1,i2,answer);
			request.setAttribute("plus", bean);

			RequestDispatcher rd=request.getRequestDispatcher("/AnswerServlet");
			rd.forward(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);
	}
}
