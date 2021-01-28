package p07_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

//멤버클래스
//필드:아이디,패스워드,이메일,전화번호
//생성자:기본생성자, 모든필드생성자
//게터세터
//toString
class Member{
	private String userid;
	private String pwd;
	private String email;
	private String tel;
	public Member() {}
	public Member(String userid, String pwd, String email, String tel) {
		this.userid = userid;
		this.pwd = pwd;
		this.email = email;
		this.tel = tel;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Member [userid=" + userid + ", pwd=" + pwd + ", email=" + email + ", tel=" + tel + "]";
	}
	
}

public class J201222_02_Member {

	//전화번호 유효성 체크 메소드
	static boolean phoneCheck(String phone) {
		//010-0000-0000 또는 02-000-0000
		String regex="^[0-9]{2,3}[-][0-9]{3,4}[-][0-9]{4}";
		boolean b =Pattern.matches(regex, phone);
		return b;
	}
	
	//이메일 유효성 체크 메소드
	static boolean emailCheck(String email) {
		//hong@gmail.com
		String regex="^[a-zA-Z0-9_]+@[a-z]+.[a-z]+";
		//String regex="^\\w+@\\w+.\\w+";
		return Pattern.matches(regex, email);
	}
	
	
	public static void main(String[] args) {
		//ArrayList<Member>생성
		List<Member> m=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디?");
			String userid=sc.next();
			System.out.print("패스워드?");
			String pwd=sc.next();
			System.out.print("이메일?");
			String email=sc.next();
			//이메일 유효성 체크
			if(!J201222_02_Member.emailCheck(email)) {
				System.out.println("유효하지 않은 이메일");
				continue;
			}
			System.out.print("전화번호?");
			String phone=sc.next();
			//전화번호 유효성 체크
			J201222_02_Member check=new J201222_02_Member();
			boolean b=J201222_02_Member.phoneCheck(phone);
			if(!b) {
				System.out.println("유효하지 않은 전화번호");
				continue;
			}
			
			// 멤버객체 생성
			Member member=new Member();
			member.setUserid(userid);
			member.setPwd(pwd);
			member.setEmail(email);
			member.setTel(phone);
			
//			//리스트에 멤버추가
			m.add(member);
			//종료조건
			System.out.print("계속(y)?");
			String answer=sc.next();
			if(!answer.equals("y")) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		System.out.println(m);
		
		
		//정규식을 이용한 데이터 유효성 체크
		//전화번호 체크
//		String phone="01088887777";
//		String pattern="^[0-9]{10,11}";
//		boolean b =Pattern.matches(pattern, phone);
//		System.out.println(b);
		
//		String phone="010-8888-777";
//		String pattern="^[0-9]{2,3}[-][0-9]{3,4}[-][0-9]{4}";
//		boolean b =Pattern.matches(pattern, phone);
//		System.out.println(b);
		
		//주민번호
//		String input="991011-2816215";
//		String regex="^[0-9]{6}-[0-9]{7}";
//		boolean b=Pattern.matches(regex, input);
//		System.out.println(b);
		
		
		
		

	}

}
