package sht.practice.chapter8;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ch8No003")
public class ch8No003 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("name");
		HttpSession hs=request.getSession();
		hs.setAttribute("name1",name);
		RequestDispatcher rd=request.getRequestDispatcher("/practice/chapter8/name.jsp");
		rd.forward(request, response);
	}

}
