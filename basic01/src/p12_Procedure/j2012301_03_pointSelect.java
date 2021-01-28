package p12_Procedure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class j2012301_03_pointSelect {

	public static void main(String[] args) {
		// 회원정보+포인트 조회
		Connection conn=DBConn.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql;
		
		sql="SELECT m.USERID,m.YEAR,nvl(p.point,0) POINT,m.REGDATE\r\n" + 
				"FROM member m left join mpoint p\r\n" + 
				"on (m.USERID=p.USERID)";
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("userid"));
				System.out.println(rs.getInt("year"));
				System.out.println(rs.getInt("point"));
				System.out.println(rs.getString("regdate"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(rs!=null) rs.close();
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
	}

}
