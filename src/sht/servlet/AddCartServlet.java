package sht.servlet;

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
 * Servlet implementation class AddCartServlet
 */
@WebServlet("/AddCartServlet")
public class AddCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();

		//ログイン済みかどうかチェック
		//すでに作成済みのセッション領域の取得
		HttpSession session =request.getSession(false);
		if(session==null) {//セッションがない場合
			out.println("<html><head><title>ShowCart</title></head><body>");
			out.println("<h1>ログインしてください</h1>");
			return;
		}else {//セッションは開始されているがログイン済みではない場合
			String isLogin=(String)session.getAttribute("isLogin");
			if(isLogin==null|| !isLogin.equals("true")){
				out.println("<html><head><title>ShowCart</title></head><body>");
				out.println("<h1>ログインしてください</h1>");
				return;
			}
		}

		String productNo=request.getParameter("product_no");
		int no=Integer.parseInt(productNo);
		String productName=null;

		switch(no) {
		case 100:
			productName="PC";
			break;
		case 101:
			productName="プリンタ";
			break;
		case 102:
			productName="デジカメ";
			break;
		default:
			productName="???";
		}
		@SuppressWarnings("unchecked")
		ArrayList<String> cart=(ArrayList<String>)session.getAttribute("products");
		if(cart==null) {
			cart=new ArrayList<String>();
			session.setAttribute("products", cart);
		}
		cart.add(productName);

		out.println("<html><head><title>ShowCart</title></head><body>");
		out.println("現在のカートの中身は下記の通りです<br><br>");
		for(int i=0;i<cart.size();i++) {
			out.println(i+1);//商品点数
			out.println(":"+cart.get(i)+"<br>");//商品名
		}
		out.println("<hr><a href='/jmaster/selectProduct.html'>商品リスト</a>");//戻るようリンク
		out.println("</body></html>");
	}
}

