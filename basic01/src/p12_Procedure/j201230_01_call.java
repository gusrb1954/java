package p12_Procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes;


public class j201230_01_call {

	public static void main(String[] args) {
		// 프로시저 테스트
		//자바의 코드 간결, 속도향상
		Connection conn=DBConn.getConnection();
		String sql;
		
		//추가/수정 프로시저
//		sql="{call memberInsertUpdate(?,?)}";
//		try {
//			CallableStatement cstmt=conn.prepareCall(sql);
//			cstmt.setString(1, "lee");
//			cstmt.setInt(2, 1990);
//			cstmt.executeUpdate();
//			System.out.println("데이터 변경");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//조회 프로시저
		sql="{call memberSelectAll(?)}";
		try {
			CallableStatement cstmt=conn.prepareCall(sql);
			cstmt.registerOutParameter(1, OracleTypes.CURSOR); //오라클 커서 가져옴
			cstmt.executeUpdate();
			//다운캐스팅
			ResultSet rs=(ResultSet) cstmt.getObject(1);
			while(rs.next()) {
				System.out.println(rs.getString("userid"));
				System.out.println(rs.getString("year"));
				System.out.println(rs.getString("regdate"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
