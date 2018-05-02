package sht.practice.chapter5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AuthServlet2
 */
@WebServlet("/AuthServlet2")
public class AuthServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String USER="taro";
	private static final String PASS="abc";



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		String action=request.getParameter("action");
		if(action.equals("Login")) {
			String name=request.getParameter("name");
			String pass=request.getParameter("pass");

			if(name.equals(USER)&&pass.equals(PASS)) {
					HttpSession hs=request.getSession();
					hs.setAttribute("Login","true");
					out.println("<html><head><title>LoginCompleted</title></head><body>");
					out.println("ログイン成功です。あなたの名前は"+name+"ですね");
				}else {
					out.println("<html><head><title>LoginFailed</title></head><body>");
					out.println("ログイン失敗");
				}


		}else if(action.equals("Logout")) {
			HttpSession hs=request.getSession(false);
		if(hs !=null) {
			hs.invalidate();
			out.println("<html><head><tite>ログアウト</title></head><body><br>");
			out.println("ログアウトしました");
		}

		out.println("<br><a href='/jmaster/practice/chapter5/index3.html'>戻る</a>");
		out.println("</body></html>");
		}
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}
}
