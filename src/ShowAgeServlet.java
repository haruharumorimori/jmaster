

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sht.beans.PersonBean;


@WebServlet("/ShowAgeServlet")
public class ShowAgeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("name");
		String strYear=request.getParameter("year");
		String strMonth=request.getParameter("month");
		String strDay=request.getParameter("day");
		if(strYear==null||strYear.length()==0||strMonth==null||strMonth.length()==0||strDay==null||strDay.length()==0) {
			request.setAttribute("message", "生年月日を入力してください");
			RequestDispatcher rd=request.getRequestDispatcher("/errInput.jsp");
			rd.forward(request, response);
			return;
		}
		int year,month,day;
		try {
			year=Integer.parseInt(strYear);
			month=Integer.parseInt(strMonth);
			day=Integer.parseInt(strDay);
		}catch(NumberFormatException e){
			request.setAttribute("message", "生年月日は数値を入力してください");
			RequestDispatcher rd=request.getRequestDispatcher("/errInput.jsp");
			rd.forward(request, response);
			return;
		}
		CalcAge ca=new CalcAge();
		int age=ca.howOld(year,month,day);
		PersonBean p=new PersonBean(name,age);

		request.setAttribute("person", p);
		RequestDispatcher rd=request.getRequestDispatcher("/showAge.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
}
