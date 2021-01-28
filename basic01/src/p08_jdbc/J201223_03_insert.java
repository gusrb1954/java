package p08_jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class J201223_03_insert {

	public static void main(String[] args) {
		// 컨넥션 객체
		Connection conn=DBConn.getConnection();
		String userid="hong";
		String password="1111";
		String sql="insert into member values ('"+userid+"','"+password+"')";
		System.out.println(sql);
		Statement stmt=null;
		//default로 autocommit
		try {
//			createStatement:문장만들기도 까다롭고 보안상 사용하면 안된다
			stmt=conn.createStatement();
			int cnt=stmt.executeUpdate(sql);
			System.out.println(cnt+"건이 추가");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
