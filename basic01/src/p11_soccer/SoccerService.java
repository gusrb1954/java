package p11_soccer;

import java.util.List;
import java.util.Scanner;

public class SoccerService {
	Scanner sc = new Scanner(System.in);

	// 마스터 서브 메뉴
	void masterSubMenu() {
		while (true) {
			System.out.println("------------------------");
			System.out.println("****마스터(관리자모드)****");
			System.out.println("------------------------");
			System.out.println("1.경기장");
			System.out.println("2.축구팀");
			System.out.println("3.축구선수");
			System.out.println("4.메인");
			System.out.println("------------------------");
			System.out.print("번호:");
			int no = sc.nextInt();
			switch (no) {
			case 1:
			case 2:
			case 3:
			case 4:
			default:
				System.out.println("잘못된 번호");
			}
		}
	}

	// 경기장 서브 메뉴
	void stadiumSubMenu() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("------------------------");
			System.out.println("****경기장(관리자모드)****");
			System.out.println("------------------------");
			System.out.println("1.경기장등록");
			System.out.println("2.일정 및 스코어");
			System.out.println("3.이전");
			System.out.println("------------------------");
			System.out.print("번호:");
			int no = sc.nextInt();
			switch (no) {
			case 1:
			case 2:
			case 3:
			default:
				System.out.println("잘못된 번호");
			}
		}
	}

	// 조회 서브 메뉴
	void userSubMenu() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("------------------------");
			System.out.println("****조회(사용자모드)****");
			System.out.println("------------------------");
			System.out.println("1.축구팀조회");
			System.out.println("2.축구선수조회");
			System.out.println("3.경기장조회");
			System.out.println("4.일정 및 스코어 조회");
			System.out.println("5.메인");
			System.out.println("------------------------");
			System.out.print("번호:");
			int no = sc.nextInt();
			switch (no) {
			case 1:
			case 2:
				selectPlayer();
				break;
			case 3:
			case 4:
			case 5:
			default:
				System.out.println("잘못된 번호");
			}
		}
	}

	// 축구선수조회
	void selectPlayer() {
		// 축구팀 입력받기
		System.out.println("축구팀아이디?");
		String team_id = sc.next();
		// PlayerDAO의 객체생성
		PlayerDAO pdao = new PlayerDAO();
		List<Player> plist=pdao.selectAll(team_id);
		for(int i=0;i<plist.size();i++) {
			System.out.println(plist.get(i).getPlayer_id());
		}
	}
	//축구팀의 리스트
	//축구팀 정보+홈경기장 정보
	void selectTeam() {
		
	}
}
