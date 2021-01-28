package p11_soccer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeamDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	
	//축구팀의 리스트
	List<Team> selectAll(String stadium_id){
		List<Team> tlist=new ArrayList<>();
		conn=DBConn.getConnection();
		sql="select t.*,s.stadium_name\r\n" + 
				"from Team t inner join STADIUM s\r\n" + 
				"on(t.stadium_id=s.stadium_id)\r\n" + 
				"order by t.team_id";
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				String team_id=rs.getString("team_id");
				String region_name=rs.getString("region_name");
				String team_name=rs.getString("team_name");
				String e_team_name=rs.getString("e_team_name");
				String orig_yyyy=rs.getString("orig_yyyy");
				String zip_code1=rs.getString("zip_code1");
				String zip_code2=rs.getString("zip_code2");
				String adress=rs.getString("adress");
				String ddd=rs.getString("ddd");
				String tel=rs.getString("tel");
				String fax=rs.getString("fax");
				String homepage=rs.getString("homepage");
				String owner=rs.getString("owner");
				
				Team team=new Team();
				team.setTeam_id(team_id);
				team.setRegion_name(region_name);
				team.setTeam_name(team_name);
				team.setE_team_name(e_team_name);
				team.setOrig_yyyy(orig_yyyy);
				team.setZip_code1(zip_code1);
				team.setZip_code2(zip_code2);
				team.setAddress(adress);
				team.setDdd(ddd);
				team.setTel(tel);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
