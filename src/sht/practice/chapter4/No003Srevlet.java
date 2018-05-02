package sht.practice.chapter4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class No003Srevlet
 */
@WebServlet("/No003")
public class No003Srevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String Pass=request.getParameter("Pass");
		String mail=request.getParameter("mail");
		
		if(name==null||name.length()==0||Pass==null||Pass.length()==0||mail==null||mail.length()==0) {
			showNotEnterdError(out);
			return;
		}
		out.println("<html><head><title>最終確認</title></head><body>");
		out.println("あなたの名前は「"+name+"」でいい？");
		out.println("あなたのパスワードは「"+Pass+"でいい？");
		out.println("あなたのメアドは「"+mail+"」いい？");
		}	
		private void showNotEnterdError(PrintWriter out) {
			out.println("<html><head><title>ERRORです</title></head><body>");
			out.print("<h1>やり直し</h1>");
	}
}
