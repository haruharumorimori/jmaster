package application.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sht.dao.DAOException;


@WebServlet("/AppServlet")
public class AppServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		String action=request.getParameter("action");

		if(action.equals("login")) {
			AppDAO ad=new AppDAO();
			String name=request.getParameter("naming");
			String pass=request.getParameter("password");

				try {
					ArrayList<AppBean> al=ad.findAll(name,pass) ;
					String NAME = null;
					String PASS=null;

					for(AppBean h:al) {
					NAME=h.getName();
					PASS=h.getPass();
					}
					if(name.equals(NAME)&&pass.equals(PASS)) {
						HttpSession hs=request.getSession();
						hs.setAttribute("login", "true");
						hs.setAttribute("name1", name);


						RequestDispatcher rd=request.getRequestDispatcher("/application.practice/mypage.jsp");
						rd.forward(request, response);
					}else {
						out.println("<html><head><title></title></head><body>");
						out.println("( ﾟДﾟ)ﾊｧ?");
						out.println("<a href='/jmaster/application.practice/login.jsp'>戻る</a>");
						out.println("</body></html>");
					}
				} catch (DAOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
			}
		}
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
