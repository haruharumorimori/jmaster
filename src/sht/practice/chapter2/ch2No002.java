package sht.practice.chapter2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ch2No001
 */
@WebServlet("/ch2No002")
public class ch2No002 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		String price=request.getParameter("price");
		int much=Integer.parseInt(price);
		double much1=much*0.1;
		out.println("<html><head><title>消費税</title></head><body>");
		out.println("消費税は："+Math.round(much1));
		out.println("</body></html>");
	}
}
