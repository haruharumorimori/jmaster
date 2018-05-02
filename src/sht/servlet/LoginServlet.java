package sht.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//データベースの代わりにこのユーザー名とパスワードをただしいとする
	private static final String USER="jack";
	private static final String PASS="abc";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		//actionリクエストパラメータの読み込み
		String action =request.getParameter("action");
		if(action.equals("login")) {//ログイン時
			//ログイン時はユーザー名、パスワード取得
			//パラメーターのエラーチェックは省略
			String name=request.getParameter("name");
			String passWord=request.getParameter("pw");
			//ユーザー名とパスワードが一致したら
			if(name.equals(USER)&&passWord.equals(PASS)) {
				//セッション管理を行う
				HttpSession session=request.getSession();
				//ログイン済みの属性を設定する
				session.setAttribute("isLogin", "true");
				out.println("<html><head><title>ShowCart</title></head><body>");
				out.println("<h1>ログイン成功</h1>");

			}else {
				out.println("<html><head><title>ShowCart</title></head><body>");
				out.println("<h1>ユーザー名またはパスワードが違うゾ^^;</h1>");

			}

		}else if(action.equals("logout")) {//ログアウト時
			//すでに作成されているセッション領域を取得する。新しくは作らない
			HttpSession session=request.getSession(false);
			if(session !=null) {
				//セッション領域を無効にする
				session.invalidate();
				out.println("<html><head><title>ShowCart</title></head><body>");
				out.println("<h1>ログアウトしました</h1>");

			}
		}
		out.println("<a href='/jmaster/selectProduct.html'>もどりゅ</a>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
