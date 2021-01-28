package p10_zodiac;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ZodiacService {
	//메뉴의 구현내용 서비스
	Scanner sc=new Scanner(System.in);
	MemberDAO mdao=new MemberDAO();
	ZodiacDAO zdao=new ZodiacDAO();
	String loginId;
	
	//회원가입
	void memberinsert() {
		//아이디/출생년도
		System.out.print("아이디는?");
		String userid=sc.next();
		System.out.print("출생년도는?");
		int year=sc.nextInt();
		Member member=new Member(userid,year);
		mdao.insert(member);
		
		
	}
	
	//로그인
	void loginCheck() {
		System.out.print("아이디는?");
		String userid=sc.next();
		Member member=mdao.selectOne(userid);
		if(member==null) {
			System.out.println("로그인 실패");
		}else {
			System.out.println("로그인 성공");
			System.out.println(userid+"님 환영합니다");
			loginId=userid; //로그인id 저장
		}
	}
	
	//개인운세
	void personalLuck() {
		if(loginId==null) {
			System.out.println("로그인 후 사용가능");
		}else {
			Member member=mdao.selectOne(loginId);
			ZodiacSign zs=zdao.selectOne(member.getYear());
			System.out.println("------------------------");
			System.out.println("당신의 띠"+zs.getZodiac());
			System.out.println("------------------------");
			System.out.println("2021년 운세");
			System.out.println("------------------------");
			System.out.println(zs.getContent());
		}
	}
	
	//전체운세
	void LuckAll() {
		List<Map<String,Object>> list=zdao.selectAll();
		for(int i=0;i<list.size();i++) {
			Map<String,Object> map=list.get(i);
			System.out.println("["+(i+1)+"]");
			System.out.println(map.get("userid"));
			System.out.println(map.get("year"));
			System.out.println(map.get("zodiac"));
			System.out.println(map.get("content"));
		}
	}
	
	
	
	
	
	
}
