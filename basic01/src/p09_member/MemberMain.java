package p09_member;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import p08_jdbc.DBConn;


public class MemberMain {

	public static void main(String[] args) {
		//1.테이블생성
		//2.dto생성
		
		Scanner sc=new Scanner(System.in);
		MemberDAO mdao=new MemberDAO();
		Member m;
		String userid;
		String pwd;
		String email;
		String name;
		String phone;
		//로그인 id
		String loginid="";
		while(true) {
			System.out.println("-----------------------");
			System.out.println("회원관리 프로그램");
			System.out.println("-----------------------");
			System.out.println("1.회원추가");
			System.out.println("2.회원수정");
			System.out.println("3.회원삭제");
			System.out.println("4.회원조회");
			System.out.println("5.회원전체조회");
			System.out.println("6.로그인");
			System.out.println("7.종료");
			System.out.println("-----------------------");
			System.out.print("번호:");
			int no=sc.nextInt();
			switch(no) {
			case 1:
				//로그인된 화원만 수정가능
				if(loginid.equals("")) {
					System.out.println("로그인 후 사용가능");
					continue;
				}
				System.out.print("아이디는?");
				userid=sc.next();
				//회원 존재여부 체크하고 insert해야 한다
				if(mdao.selectOne(userid)!=null) {
					System.out.println("등록된 아이디입니다");
					continue;
				}
				System.out.print("비밀번호는?");
				pwd=sc.next();
				System.out.print("이메일은?");
				email=sc.next();
				System.out.print("이름은?");
				name=sc.next();
				System.out.print("전화번호는?");
				phone=sc.next();
				m=new Member();
				m.setUserid(userid);
				m.setPwd(pwd);
				m.setEmail(email);
				m.setName(name);
				m.setPhone(phone);
				mdao.insert(m);
				break;
			case 2:
				//로그인된 화원만 수정가능
				if(loginid.equals("")) {
					System.out.println("로그인 후 사용가능");
					continue;
				}
				
				System.out.print("수정할 아이디는?");
				userid=sc.next();
				//회원 존재여부 체크하고 update해야 한다
				if(mdao.selectOne(userid)==null) {
					System.out.println("등록되지 않은 아이디입니다");
					continue;
				}
				System.out.print("수정할 비밀번호는?");
				pwd=sc.next();
				System.out.print("수정할 이메일은?");
				email=sc.next();
				System.out.print("수정할 이름은?");
				name=sc.next();
				System.out.print("수정할 전화번호는?");
				phone=sc.next();
				m=new Member();
				m.setUserid(userid);
				m.setPwd(pwd);
				m.setEmail(email);
				m.setName(name);
				m.setPhone(phone);
				mdao.update(m);
				break;				
			case 3:
				//로그인된 화원만 수정가능
				if(loginid.equals("")) {
					System.out.println("로그인 후 사용가능");
					continue;
				}
				System.out.print("삭제할 아이디는?");
				userid=sc.next();
				//회원 존재여부 체크하고 delete해야 한다
				if(mdao.selectOne(userid)==null) {
					System.out.println("등록되지 않은 아이디입니다");
					continue;
				}				
				mdao.delete(userid);
				break;
			case 4:
				//로그인된 화원만 수정가능
				if(loginid.equals("")) {
					System.out.println("로그인 후 사용가능");
					continue;
				}
				System.out.print("조회할 아이디는?");
				userid=sc.next();
				//회원 존재여부 체크하고 조회해야 한다
				m=mdao.selectOne(userid);
				if(m==null) {
					System.out.println("등록되지 않은 아이디입니다");
					continue;
				}
				System.out.println("아이디:"+m.getUserid());
				System.out.println("비밀번호:"+m.getPwd());
				System.out.println("이메일:"+m.getEmail());
				System.out.println("이름:"+m.getName());
				System.out.println("전화번호:"+m.getPhone());
				break;
			case 5:
				//로그인된 화원만 수정가능
				if(loginid.equals("")) {
					System.out.println("로그인 후 사용가능");
					continue;
				}
				List<Member> mList=mdao.selectAll();
				System.out.println("------전체회원명단------");
				for(Member member:mList) {
					System.out.println("아이디:"+member.getUserid());
					System.out.println("비밀번호:"+member.getPwd());
					System.out.println("이메일:"+member.getEmail());
					System.out.println("이름:"+member.getName());
					System.out.println("전화번호:"+member.getPhone());
					System.out.println("---------------------------");
				}
				break;
				
			case 6: //로그인
				//아이디,패스워드 입력 받아서 기존 등록회원인지 아닌지
				//일치하면 로그인 되었습니다
				//일치하지 않으면 등록된 회원이 아닙니다
				System.out.print("아이디는?");
				userid=sc.next();
				System.out.print("비밀번호는?");
				pwd=sc.next();
				int cnt=mdao.loginCheck(userid, pwd);
//				System.out.println(cnt);
				if(cnt==0) {
					System.out.println("등록된 회원이 아닙니다");
					continue;
				}
				System.out.println("로그인 되었습니다");
				System.out.println(userid+"님 환영합니다");
				loginid=userid; //로그인 id 저장
				break;
			case 7:
				DBConn.dbclose(); //db끊기
				System.exit(0);
			default:
				System.out.println("잘못된 결과");
			}
		}
		
				
		//회원객체 생성(아이디,비밀번호,이메일,이름,전화번호)
//		String userid="java2";
//		String pwd="2222";
//		String email="java@gmail.com";
//		String name="박자바";
//		String phone="010-1111-22222";
//		m.setUserid(userid);
//		m.setPwd(pwd);
//		m.setEmail(email);
//		m.setName(name);
//		m.setPhone(phone);
		
		//회원추가
		
		//회원수정
		
		//회원삭제
		
		//회원조회
//		Member m=mdao.selectOne("java");
//		if(m!=null) {
//			System.out.println(m.getUserid());
//			System.out.println(m.getPwd());
//			System.out.println(m.getEmail());
//			System.out.println(m.getName());
//			System.out.println(m.getPhone());
//			System.out.println(m.getRegdate());			
//
//			SimpleDateFormat sf
//				=new SimpleDateFormat("yyyy/MM/dd HH:dd:ss");
//		
//			System.out.println(sf.format(m.getRegdate()));
//		}else {
//			System.out.println("회원정보가 없습니다");
//		}
//		System.out.println(sf.fomat(m.getRegdate()));
		
		//전체조회
//		List<Member> mlist=mdao.selectAll();
//		for(Member m:mlist) {
//			System.out.println(m.getUserid());
//			System.out.println(m.getPwd());
//			System.out.println(m.getEmail());
//			System.out.println(m.getName());
//			System.out.println(m.getPhone());
//			System.out.println(m.getRegdate());
//		}
		
	}

}
