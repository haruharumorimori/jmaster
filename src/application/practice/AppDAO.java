package application.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sht.dao.DAOException;

public class AppDAO {

	public ArrayList<AppBean> findAll(String name,String pass) throws DAOException{

	PreparedStatement st=null;
	ResultSet rs=null;

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url="jdbc:mysql://localhost/sample2?serverTimezone=UTC";
		String user="student";
		String pa="himitu";

		Connection con=DriverManager.getConnection(url,user,pa);

		String sql="SELECT * FROM user WHERE name=? AND pass=?";

		st=con.prepareStatement(sql);
		st.setString(1, name);
		st.setString(2, pass);
		rs=st.executeQuery();

		ArrayList<AppBean> al= new ArrayList<AppBean> ();
		while(rs.next()) {
		String NAME=rs.getString("name");
		String PASS=rs.getString("pass");

		AppBean ab=new AppBean(NAME,PASS);
		al.add(ab);
		}
		return al;
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
		return null;
	} catch (SQLException e) {
		e.printStackTrace();
		return null;
	}finally {
		if(rs !=null)
		if(st !=null)
			try {
				rs.close();
				st.close();
			} catch (SQLException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}
}

