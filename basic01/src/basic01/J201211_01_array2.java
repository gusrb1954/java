package basic01;

import java.util.Arrays;
import java.util.Scanner;

public class J201211_01_array2 {

	public static void main(String[] args) {
		//이차배열
//		int[][] arr=new int[2][3];
//		
//		
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j]=(i*3)+j+1;
//				System.out.println(arr[i][j]);
//			}
//		}
		
		//2차배열 선언(행의 열 갯수 다르게)
//		int[][] arr=new int[2][];
//		arr[0]=new int[3];
//		arr[1]=new int[4];
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j]=(i*3)+j+1;
//				System.out.println(i+","+j+"=>"+arr[i][j]);
//			}
//		}
		
		//2차배열의 선언과 동시에 초기화
//		int[][] arr=new int[][] {{1,2,3},{4,5,6,7,8}};
//		int[][] arr={{1,2,3},{4,5,6,7,8}};
		
		//foreach문으로 출력
//		for(int[] a:arr) {
//			System.out.println(Arrays.toString(a));
//			for(int b:a){
//				System.out.println(b);
//			}
//		}
		
		//실습)2명 학생의 국/영/수 점수를 입력받아 저장
//		int[][] arr=new int[2][3];
//		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<arr.length;i++) {
//				System.out.print("국/영/수 점수는?");
//				arr[i][0]=sc.nextInt();
//				arr[i][1]=sc.nextInt();
//				arr[i][2]=sc.nextInt();
//		}
//		for(int[] s:arr) {
//			int sum=s[0]+s[1]+s[2];
//			double avg=sum/3;
//			System.out.println("합계"+sum);
//			System.out.println("평균"+avg);
//		}
		
		//이중for문으로
//		Scanner sc=new Scanner(System.in);
//		String[] subj= {"국어","영어","수학"};
//		int[][] arr=new int[2][3];
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(subj[j]+"?");
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		int sum;
//		for(int i=0;i<arr.length;i++) {
//			sum=0;
//			for(int j=0;j<arr[i].length;j++) {
//				sum+=arr[i][j];
//			}
//			double avg=sum/arr[i].length;
//			System.out.println(i+1+"합계"+sum);
//			System.out.println(i+1+"평균"+avg);
//		}
		
		//실습)2명학생의 수강신청과목수를 입력받아
		//수강료를 입력하는 프로그램
		//만약 두과목을 수강하면 두번 수강료를 입력
		
//		Scanner sc=new Scanner(System.in);
//		int[][] fee=new int[2][];
//		int subjCnt;//수강과목수
//		for(int i=0;i<fee.length;i++) {
//			System.out.printf("%d번)수강 과목수는?",i+1);
//			subjCnt=sc.nextInt();
//			fee[i]=new int[subjCnt];//과목수만큼 열생성
//			for(int j=0;j<subjCnt;j++) {
//				System.out.printf("%d)수강료?",j+1);
//				fee[i][j]=sc.nextInt();
//			}
//		}
//		
//		for(int[] f:fee) {
//			System.out.println(Arrays.toString(f));
//		}
		
		//배열의 복사
		//얇은 복사
//		int[] src= {10,20,30};
//		int[]desc=src;
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(desc));
//		
//		src[0]=100;
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(desc));
		
		//깊은 복사
//		int[] src= {10,20,30};
//		int[] desc=new int [3];
//		
//		for(int i=0;i<src.length;i++) {
//			desc[i]=src[i];
//		}
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(desc));
//		
//		src[0]=100;
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(desc));
		
		//배열의 깊은복사 메소드
//		int[] src= {10,20,30};
//		int[] dest=new int [3];
//		System.arraycopy(src, 0, dest, 0, 3);
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
		
		//배열의 프레임워크=>클래스에서 학습
		
		//확인문제)183page
//		boolean run= true;
//		int selectNo; //선택번호
//		int stdNum = 0; //학생수
//		int[] scores = null; //참조변수
//		
//		
//		Scanner sc = new Scanner(System.in);
//		while (run) {
//			System.out.println("------------------------------------------------");
//			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
//			System.out.println("------------------------------------------------");
//			System.out.print("선택>");
//			selectNo = sc.nextInt();
//			if (selectNo==1) {
//				System.out.print("학생수는?");
//				stdNum = sc.nextInt();
//				scores = new int[stdNum];
//			}else if (selectNo==2) {
//				for(int i=0; i<stdNum; i++) {
//					System.out.print(i+1+"번 점수는?");
//					scores[i] = sc.nextInt();
//				}
//			}else if (selectNo==3) {
//				if (scores==null) continue;
//				for(int i=0; i<stdNum; i++) {
//					System.out.println(i+1 + "번 " + scores[i]+"점");
//				}
//			}else if (selectNo==4) {
//				//최고점수/합계
//				int max = 0, sum=0;
//				for(int score:scores) {
//					if (score>max)max = score;
//					sum += score;
//				}
//				System.out.println("최고점수:" + max);
//				System.out.printf("평균:%.2f\n",(double)sum/stdNum);
//			}else if (selectNo==5) {
//				break;
//			}else {
//				System.out.println("잘못된 번호");
//			}
//		}
//		
//		System.out.println("프로그램 종료");

		//실습)배열의 원하는 index에 값 삽입하기
		int[] arr = {1,2,3,4,5};
		int index = 3;
		int num = 6; //1,2,3,6,4,5
		
		//깊은 복사 이용
		int[] dest = new int[arr.length+1];
		for(int i=0;i<arr.length;i++) {
			if(i<index) dest[i]=arr[i];
			else dest[i+1]=arr[i];
		}
		dest[index]=num;
		System.out.println("arr:"+Arrays.toString(arr));
		System.out.println("dest:"+Arrays.toString(dest));
		
		//얇은 복사
		arr=dest;
		System.out.println("arr:"+Arrays.toString(arr));
		System.out.println("dest:"+Arrays.toString(dest));
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
