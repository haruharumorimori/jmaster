package application.practice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NewhumanServlet")
public class NewhumanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");

		NHDAO nh=new NHDAO();
		if(name==null||pass==null) {
			RequestDispatcher rd=request.getRequestDispatcher("/application.practice/login.jsp");
			rd.forward(request, response);
		}


		int rows=nh.addHuman(name, pass);


		request.setAttribute("name1",name);
		request.setAttribute("pass1", pass);
		RequestDispatcher rd=request.getRequestDispatcher("/application.practice/nh.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
