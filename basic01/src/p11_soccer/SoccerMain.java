package p11_soccer;

import java.util.Scanner;

public class SoccerMain {

	public static void main(String[] args) {
		// 메이저 축구팀 프로그램
		Scanner sc = new Scanner(System.in);
		SoccerService ss = new SoccerService();
		while (true) {
			System.out.println("------------------------");
			System.out.println("****메이저 축구팀****");
			System.out.println("------------------------");
			System.out.println("1.마스터");
			System.out.println("2.조회");
			System.out.println("3.관리자인증");
			System.out.println("4.종료");
			System.out.println("------------------------");
			System.out.print("번호:");
			int no = sc.nextInt();
			switch (no) {
			case 1:
				break;
			case 2:
				ss.userSubMenu();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				DBConn.dbclose(); // db접속 종료
				System.out.println("프로그램 종료");
				System.exit(0);
			default:
				System.out.println("잘못된 번호");
			}
		}
	}

}
