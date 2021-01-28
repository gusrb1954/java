package p11_soccer;

import java.util.Date;

public class Player {
	private String player_id;
	private String player_name;
	private String team_id;
	private String e_player_name;
	private String nickname;
	private String join_yyyy;
	private String position;
	private int back_no;
	private String nation;
	private String birth_date;
	private String solar;
	private int height;
	private int weight;
	public Player() {}
	public Player(String player_id, String player_name, String team_id, String e_player_id, String nickname,
			String join_yyyy, String position, int back_no, String nation, String birth_date, String solar, int height,
			int weight) {
		this.player_id = player_id;
		this.player_name = player_name;
		this.team_id = team_id;
		this.e_player_name = e_player_id;
		this.nickname = nickname;
		this.join_yyyy = join_yyyy;
		this.position = position;
		this.back_no = back_no;
		this.nation = nation;
		this.birth_date = birth_date;
		this.solar = solar;
		this.height = height;
		this.weight = weight;
	}
	public String getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(String player_id) {
		this.player_id = player_id;
	}
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public String getTeam_id() {
		return team_id;
	}
	public void setTeam_id(String team_id) {
		this.team_id = team_id;
	}
	public String getE_player_id() {
		return e_player_name;
	}
	public void setE_player_id(String e_player_id) {
		this.e_player_name = e_player_id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getJoin_yyyy() {
		return join_yyyy;
	}
	public void setJoin_yyyy(String join_yyyy) {
		this.join_yyyy = join_yyyy;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getBack_no() {
		return back_no;
	}
	public void setBack_no(int back_no) {
		this.back_no = back_no;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}
	public String getSolar() {
		return solar;
	}
	public void setSolar(String solar) {
		this.solar = solar;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Player [player_id=" + player_id + ", player_name=" + player_name + ", team_id=" + team_id
				+ ", e_player_id=" + e_player_name + ", nickname=" + nickname + ", join_yyyy=" + join_yyyy + ", position="
				+ position + ", back_no=" + back_no + ", nation=" + nation + ", birth_date=" + birth_date + ", solar="
				+ solar + ", height=" + height + ", weight=" + weight + "]";
	}
	public void setBirth_date(Date birth_date2) {
		// TODO Auto-generated method stub
		
	}
	
	
}
