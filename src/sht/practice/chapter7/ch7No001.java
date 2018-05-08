package sht.practice.chapter7;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ch7No001")
public class ch7No001 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String NAME="tanaka";
	private static final String PASS="abc";


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		String action=request.getParameter("action1");
		if(action.equals("login")) {
			String name=request.getParameter("name");
			String pass=request.getParameter("pass");
			if(name.equals(NAME)&&pass.equals(PASS)) {
				HttpSession hs=request.getSession();
				hs.setAttribute("login", "true");
				request.setAttribute("name1", name);
				RequestDispatcher rd=request.getRequestDispatcher("/practice/chapter7/user.jsp");
				rd.forward(request, response);
			}else {
				System.out.println("ERROR");
			}
		}
	}
}

