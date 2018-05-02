package sht.practice.chapter5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out= response.getWriter();

		HttpSession hs=request.getSession(false);
		if(hs==null) {
			out.println("<html><head><title>ログインして</title></head><body>");
			out.println("ログインしてください");
			out.println("</body></html>");
			return;
		}else {
			String Login=(String)hs.getAttribute("Login");
			if(Login==null||!Login.equals("true")) {
				out.println("<html><head><title>ログインして</title></head><body");
				out.println("ログインして下さい");
				out.println("</body></html>");
				return;
			}
		}
		out.println("<html><head><title>本の追加</title></head><body>");
		out.println("<a href='/jmaster/CartServlet?title=バカの壁'>本１</a>");
		out.println("<br><a href='/jmaster/CartServlet?title=アホの壁'>本2</a>");
		out.println("<br><a href='/jmaster/CartServlet?title=ドジの壁'>本3</a>");
		out.println("</body></html>");

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
