package sht.practice.chapter2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ch2No003
 */
@WebServlet("/ch2No003")
public class ch2No003 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String Name="user";
	private static final String Pass="pass";


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		String action=request.getParameter("action");
		if(action.equals("Login")) {
			String name=request.getParameter("name");
			String pass=request.getParameter("pass");
			if(name.equals(Name)&&pass.equals(Pass)) {
				HttpSession hs=request.getSession();
				hs.setAttribute("isLogin", "true");
				out.println("<html><head><title>login</title></head><body>");
				out.println("ログイン成功");
			}else {
				out.println("<html><head><title>失敗</title></head><body>");
				out.println("ログイン失敗");
			}
		}
	}
}
