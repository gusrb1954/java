package p10_zodiac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZodiacDAO {
	Connection conn=DBConn.getConnection();
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	
	//운세 db
	//한건 조회
	ZodiacSign selectOne(int year) {
		ZodiacSign zs=null;
		sql="select * from zodiacSign\r\n" + 
				"where seq = mod(?+8, 12)+1";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, year);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				zs=new ZodiacSign();
				zs.setSeq(rs.getInt("seq"));
				zs.setZodiac(rs.getString("zodiac"));
				zs.setContent(rs.getString("content"));
//				System.out.println(zs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return zs;
	}
	
	//전체회원에 대한 운세
	List<Map<String, Object>> selectAll() {
		//map의 리스트
		List<Map<String, Object>> list=new ArrayList<>();
		
		sql="select m.USERID,m.YEAR,zs.ZODIAC,zs.CONTENT\r\n" + 
				"from zodiacSign zs inner join member m\r\n" + 
				"on(zs.seq=mod(m.year+8,12)+1)\r\n" + 
				"order by year";
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			Map<String,Object> map;
			while(rs.next()) {
				String userid=rs.getString("userid");
				int year=rs.getInt("year");
				String zodiac=rs.getString("zodiac");
				String content=rs.getString("content");
				//dto대신 한건의 데이터 저장
				map=new HashMap<>();
				map.put("userid", userid);
				map.put("year", year);
				map.put("zodiac", zodiac);
				map.put("content", content);
				list.add(map);
			}
			System.out.println(list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	
	
	
	
	
}
