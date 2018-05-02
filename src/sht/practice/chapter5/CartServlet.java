package sht.practice.chapter5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html;charset=UTF-8");
	PrintWriter out=response.getWriter();
	HttpSession hs=request.getSession(false);
	if(hs==null) {
		out.println("<html><head><title>ログインして</title></head><body>");
		out.println("ログインしてください");
		return;
	}else {
		String isLogin=(String)hs.getAttribute("isLogin");
		if(hs==null||!isLogin.equals("true")) {
			out.println("<html><head><title>ログインして</title></head><body");
			out.println("ログインして下さい");
			return;
		}
	}
	Book book=new Book();
	book.setName(request.getParameter("name"));
	book.setMuch(Integer.parseInt(request.getParameter("much")));


	@SuppressWarnings("unchecked")
	ArrayList<Book> cart=(ArrayList<Book>)hs.getAttribute("cart");

	if(cart==null) {
		cart=new ArrayList<Book>();
		hs.setAttribute("cart", cart);
	}
	cart.add(book);
	out.println("<html><head><itle>選択した商品と価格</title></head><body>");
	out.println("選択商品は下記の通りです。");
	for(int i=0;i<cart.size();i++) {
		out.println(i+1);
		out.println(":"+cart.get(i)+"<br>");
			}
		}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
