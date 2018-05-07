package sht.practice.chapter3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ch3No001")
public class ch3No001 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html;charset=UTF-8");
	PrintWriter out=response.getWriter();

	String[] a=request.getParameterValues("check");
	String selectObject="-";
	for(String check:a) {
		switch (check) {
			case "apple":
				selectObject+="りんご";
				break;
			case"gorrila":
				selectObject+="ゴリラ";
				break;
			case"rappa":
				selectObject+="らっぱ";
				break;
			default:
				selectObject+="error";
				break;
			}
		}
		out.println("<html><head><title>aaa</title></head><body>");
		out.println("あなたが選んだものは"+selectObject+"です。");
		out.println("</body></html>");
	}
}
