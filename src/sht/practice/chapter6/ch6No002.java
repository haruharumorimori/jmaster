package sht.practice.chapter6;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ch6No002")
public class ch6No002 extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");

		sht.practice.chapter6.Employee bean=(Employee)request.getAttribute("em");
		ArrayList<Employee> al=

		out.println("<html><head><title>社員登録</title></head><body>");
		out.println("登録完了しました<br>");
		out.print("あなたの名前は"+bean.getName()+"です。");
		out.println("あなたのIDは"+bean.getID()+"です。");
		out.println("<br><br>");
		out.println("<a href=/jmaster/practice/chapter6/ch6No001.html>戻る</a>");

		out.println("</body></html>");
	}
}
