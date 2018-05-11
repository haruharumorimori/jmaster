package application.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NHDAO {
	public int addHuman(String name,String pass) {
		Connection con=null;
		PreparedStatement st=null;

		int rows;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost/sample2?serverTimezone=UTC";
			String user="student";
			String pa="himitu";
			con=DriverManager.getConnection(url,user,pa);

			String sql="INSERT INTO user(name,pass) VALUES(?,?)";
			st=con.prepareStatement(sql);
			st.setString(1,name);
			st.setString(2, pass);

			rows=st.executeUpdate();
			return rows;

		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return 0;
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return 0;
		}finally {
			if(con!=null)
				try {
					st.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
}
