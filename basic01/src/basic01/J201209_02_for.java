package basic01;

import java.util.Scanner;

public class J201209_02_for {

	public static void main(String[] args) {
		//반복문(for)
//		for(int i=1;i<=10;i++) {
//			System.out.println(i);
//		}
		//10,9,8...1
//		for(int i=10;i>1;i--) {
//			System.out.println(i);
//		}
		
		//실습)구구단 입력받아서 출력
//		Scanner sc=new Scanner(System.in);
//		System.out.print("몇단?");
//		int a=sc.nextInt();
//		for(int i=1;i<10;i++) {
//			System.out.printf("%d*%d=%d\n",a,i,a*i);
//		}
		
		//실습)1~n까지의 합: n은 입력 받기
//		Scanner sc=new Scanner(System.in);
//		System.out.print("숫자입력:");
//		int n=sc.nextInt();
//		int sum=0;
//		for(int i=1;i<n+1;i++) {
//			sum+=i;
//		}
//		System.out.println("합:"+sum);
		
		//실습)나머지 연산자를 활용한 3의 배수만 출력
//		Scanner sc=new Scanner(System.in);
//		System.out.print("숫자입력:");
//		int a=sc.nextInt();
//		for(int i=1;i<a;i++) {
//			if(i%3==0)
//				System.out.println("3의배수:"+i);
//		}
		
//		//실습)1~100까지의 수중 모든 소수 출력
		//소수:1과 자기자신으로만 나누어 떨어지는 수
		
//		int i,j;
//		boolean b; //소수여부
//		
//		for(i=1;i<100;i++) {
//			b=true;
//			for(j=2;j<i;j++) {
//				if(i%j==0) {
//					b=false;
//					//System.out.println(i+"소수아님");
//					break;
//				}
//			}
//			//if(j==i) System.out.println("소수입니다");
//			if(b) System.out.println(i+" ");
//		}
		
		//실습)최대공약수:공통약수중 가장 큰수
		//1)두수중 작은수 찾기
		//2)작은수부터 1씩 작아지게 반복문 돌리면서 두수를 나누어 떨어지는 수 찾기
//		int a=6, b=9, min;
//		if(a<b) min=a;
//		else min=b;
//		
//		int cnt=0;
//		for(int i=min;i>0;i--) {
//			System.out.println(++cnt); //반복횟수
//			if(a%i==0 && b%i==0) {
//				System.out.println("최대공약수:"+i);
//				break;
//			}
//		}

		//실습)최대공약수(유클리제의 호제법)
//		int a=8, b=12,r, temp;
//		//큰수%작은수==0 이면 작은수가 최대공약수
//		//큰수%작은수==0 이 아니면 큰수=작은수, 작은수=나머지
//		if(b>a) {//큰수를 a에 넣기위해 두수를 바꾼다
//			temp=a;
//			a=b;
//			b=temp;
//		}
//		System.out.println(a);
//		System.out.println(b);
//		int cnt=0;
//		for(;;) {
//			System.out.println(++cnt); //반복횟수
//			r=a%b; //나머지
//			if(r==0) {
//				System.out.println("최대공약수:"+b);
//				break;
//			}
//			a=b;
//			b=r;
//		}
		
		//실습)최소공배수
		//두수의 공통배수중 가장 작은수
		//두수를 곱하고 최대공약수로 나눈값
//		int a=6, b=8,r,temp;
//		int aa=a, bb=a;//바뀌기전
//		//최대공약수구하기
//		if(b>a) {//큰수를 a에 넣기위해 두수를 바꾼다
//			temp=a;
//			a=b;
//			b=temp;
//		}
//		for(;;) {
//			r=a%b; //나머지
//			if(r==0) {
//				System.out.println("최대공약수:"+b);
//				break;
//			}
//			a=b;
//			b=r;
//		}
//		//최소공배수
//		System.out.println("최소공배수:"+aa*bb/b);
//		
		//실습)구구단 n단씩 출력하기
		//사용자에게 한줄에 출력단수 입력받아 출력
//		Scanner sc=new Scanner(System.in);
//		System.out.print("단수?");
//		int a=sc.nextInt();
//		for(int i=2;i<9;i+=a) {
//			//헤더출력
//			for(int j=i;j<i+a;j++) {
//				if(j>9) break;
//				System.out.printf("[%d단]    ",j);
//			}
//			System.out.println();
//			//구구단
//			for(int k=1;k<10;k++) {
//				for(int j=i;j<i+a;j++) {
//					if(j>9) break;
//					System.out.printf("%d*%d=%2d   ",j,k,j*k);
//				}
//				System.out.println();//개행
//			}
//			System.out.println();
//			
//		}
		
		
		//실습)백준 2839번
		//5키로와 3키로의 봉지 몇개가 필요한지
		//가장 작은수의 봉지구하기
		//15키로:5키로*3
		//18키로:5키로*3+3키로*1
		//11키로:5키로*1+3키로*2
		//7키로:-1
		//1키로:-1
//		
//		int cnt5=0,cnt3=0; //5k,3k 봉지수
//		int restKg; //5kg담고 남은 kg
//		int nKg=1;
//		cnt5=nKg/5;
//		
//		for(;;) {
//			restKg=nKg-(5*cnt5);
//			if(restKg%3==0) {
//				cnt3=restKg/3;
//				System.out.println("5kg봉지:"+cnt5);
//				System.out.println("3kg봉지:"+cnt3);
//				break;
//			}else {
//				if(cnt5==0){
//					System.out.println("-1");
//					break;
//				}
//				cnt5--; //5kg봉지 감소
//			}
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
