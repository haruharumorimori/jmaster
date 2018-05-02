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


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html;charset=UTF-8");
	PrintWriter out=response.getWriter();

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

	Book book=new Book();
	String title=request.getParameter("title");
	switch (title) {
		case "バカの壁":
			book.setMoney(123);
			book.setTitle(title);
			break;
		case "アホの壁":
			book.setMoney(12345);
			book.setTitle(title);
			break;
		case "ドジの壁":
			book.setMoney(12);
			book.setTitle(title);
			break;
		default :
			System.out.println("Error");
			break;
	}


	@SuppressWarnings("unchecked")
	ArrayList<Book> cart=(ArrayList<Book>)hs.getAttribute("cart");

	if(cart==null) {
		cart=new ArrayList<Book>();
		hs.setAttribute("cart", cart);
	}

	cart.add(book);

	out.println("<html><head><itle>選択した商品と価格</title></head><body>");
	out.println("選択商品は下記の通りです。<br>");
	for(Book b:cart) {
		out.println("タイトル:"+b.getTitle()+"価格:"+b.getMoney()+"<br>");
			}
		}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}
}

