package p08_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class J201223_05_update_item {

	public static void main(String[] args) {
		Connection conn=DBConn.getConnection();
		String sql="update item " + 
				"set itemname = ?, " + 
				"    price = ?" + 
				"where itemcode = ?";
		//상품객체
		Item item=new Item("A001","감자깡",800);
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, item.getItemname());
			pstmt.setInt(2, item.getPrice());
			pstmt.setString(3, item.getItemcode());
			int cnt=pstmt.executeUpdate();
			System.out.println(cnt+"건 수정");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
			
		
	}

}
