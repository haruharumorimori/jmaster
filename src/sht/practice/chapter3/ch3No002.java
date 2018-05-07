package sht.practice.chapter3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ch3No002")
public class ch3No002 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out =response.getWriter();
		String a=request.getParameter("site");
		String selectSite;
		switch(a) {
		case "tw":
			selectSite="twitter";
			break;
		case"fb":
			selectSite="facebook";
			break;
		case"in":
			selectSite="instagram";
			break;
		default:
			selectSite="error";
			break;
			}
		out.println("<html><head><title>あなたの選んだサイトは</title></head><body>");
		out.println(selectSite+"です。");
		out.println("</body></html>");
	}

}
