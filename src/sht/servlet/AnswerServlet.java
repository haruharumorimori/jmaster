package sht.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sht.beans.PlusBean;


@WebServlet("/AnswerServlet")
public class AnswerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;cahrset=UTF-8");
		PrintWriter out=response.getWriter();
//
//		Integer num1=(Integer)request.getAttribute("data1");
//		Integer num2=(Integer)request.getAttribute("data2");
//		Integer answer=(Integer)request.getAttribute("answer");
		
		sht.beans.PlusBean bean=(PlusBean)request.getAttribute("plus");

		out.println("<html><head><title>Plus</title></head><body>");
		out.println(bean.getValue1()+"+"+bean.getValue2()+"="+bean.getAnswer());
		out.println("</body></html>");
	}

}