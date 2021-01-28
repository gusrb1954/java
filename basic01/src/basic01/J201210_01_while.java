package basic01;

import java.util.Scanner;

public class J201210_01_while {

	public static void main(String[] args) {
		//반복문(while)
		//실습)음악재생 1
//		Scanner sc=new Scanner(System.in);		
//		String anser;
//		int a=0;
//		while(true) {
//			System.out.print("음악을 재생할까요?");
//			anser=sc.next();
//			if(anser.equals("y")) {
//				System.out.printf("음악을 %d번 재생합니다\n",++a);
//			}else
//				break;
//		}
		
		//실습)음악재생 2
//		Scanner sc=new Scanner(System.in);
//		int cnt=0;
//		String anser="y";
//		while(anser.equals("y")) {
//			System.out.println("음악을 재생?");
//			anser=sc.next();
//			if(anser.equals("y")) {
//				System.out.println(++cnt);
//			}
//		}
		
//		Scanner sc=new Scanner(System.in);
//		int cnt=0;
//		String answer;
//		do {
//			System.out.println("음악을 재생?");
//			answer=sc.next();
//			if(answer.equals("y")) System.out.println(++cnt);
//		}while(answer.equals("y"));
		
		//실습)updown게임
		//1)랜덤으로 1~100사이의 수 하나를 저장
		//2)사용자에게 정수를 입력받는다
		//3)만약 랜덤수가 사용자수보다 작으면 down
		// 크면 up, 같으면 사용자 승
		//4)5번안에 못맞히면 컴퓨터 승
		Scanner sc=new Scanner(System.in);
		int rightCnt=0;//맞은 횟수
		while(true) {
			boolean right=false; //정답여부
			int a=(int)(Math.random()*100+1);
			for(int i=0;i<5;i++) {
				System.out.print("정수입력:");
				int no=sc.nextInt();
				if(a<no) System.out.println("down");
				else if(a>no) System.out.println("up");
				else {
					right=true;
					System.out.println("사용자 승");
					rightCnt++;
					break;
				}
			}
			if(!right) System.out.println("컴퓨터 승");
			
			System.out.println("계속(y)?");
			String cont=sc.next();
			if(!cont.equals("y")) break;
		}
		
		System.out.println("정답횟수:"+rightCnt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
