package sht.practice.chapter6;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ch6No002")
public class ch6No002 extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");

		sht.practice.chapter6.Employee bean=(Employee)request.getAttribute("em");
		HttpSession hs=request.getSession();
		@SuppressWarnings("unchecked")
		ArrayList<Employee> hm=(ArrayList<Employee>)hs.getAttribute("em1");
		if(hm==null) {
			hm=new ArrayList<Employee>();
			hs.setAttribute("em1", hm);
		}
		hm.add(bean);

		out.println("<html><head><title>社員登録</title></head><body>");
		out.println("登録完了しました<br>");
		for(Employee a:hm) {
		out.println("あなたの名前は"+a.getName()+"です。");
		out.println("あなたのIDは"+a.getID()+"です。<br>");
		}
		out.println("<br><br>");
		out.println("<a href=/jmaster/practice/chapter6/ch6No001.html>戻る</a>");

		out.println("</body></html>");
	}
}
