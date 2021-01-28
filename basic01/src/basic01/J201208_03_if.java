package basic01;

import java.util.Scanner;

public class J201208_03_if {
	//throws:예외 던지기
	public static void main(String[] args) throws InterruptedException {
		//조건문(if)
		
//		int a=-10;
//		if(a>0) {
//			System.out.println("양수");
//		}else {
//			System.out.println("음수");
//		}
		
		//실습)학점 매기기(절대평가)
//		Scanner sc=new Scanner(System.in);
//		System.out.print("점수는?");
//		int s=sc.nextInt();
//		if(s>=90)
//			System.out.println("A등급입니다");
//		else if(s>=80)
//			System.out.println("B등급입니다");
//		else if(s>=70)
//			System.out.println("C등급입니다");
//		else if(s>=60)
//			System.out.println("D등급입니다");
//		else
//			System.out.println("F등급입니다");
		
		//실습)학점매기기(상대평가)
		//전체학생수와 나의 등수를 입력받아
		//15%:A등급, 16~30%:B등급, 31%~:C등급
//		Scanner sc=new Scanner(System.in);
//		System.out.print("전체학생수는?");
//		int as=sc.nextInt();
//		System.out.print("나의 등수는?");
//		int g=sc.nextInt();
//		if(g<=as*0.15)
//			System.out.println("A등급");
//		else if(g<=as*0.3)
//			System.out.println("B등급");
//		else
//			System.out.println("C등급");
		
		//과제)화씨(F)=>섭씨(C)로
		//섭씨는 화씨로 바꾸기
		//공식 (화씨온도 − 32) × 5/9 = 섭씨온도
		
		//온도: 10 C 또는 100 F
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("온도는?");
//		int t=sc.nextInt();
//		String s=sc.next().toUpperCase(); //체인:명령어끼리는 연결이 된다
//		double c=(t-32)*(double)5/9;
//		double f=(t*(double)9/5)+32;
////		s=s.toUpperCase(); //대문자로 변경
//		if(s.equals("F"))
//			System.out.printf("섭씨온도:%.2fC\n",c);
//		else if(s.equals("C"))
//			System.out.printf("화씨온도:%.2fF\n",f);
//		else
//			System.out.println("다시 입력하세요");
		
		//실습)계산기
//		Scanner sc=new Scanner(System.in);
//		System.out.print("숫자 두개와 기호 입력:");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		String t=sc.next();
//		if(t.equals("+"))
//			System.out.printf("%d+%d=%d\n"+a,b,a+b);
//		else if(t.equals("-"))
//			System.out.printf("%d-%d=%d\n"+a,b,a-b);
//		else if(t.equals("*"))
//			System.out.printf("%d*%d=%d\n"+a,b,(a*b));
//		else if(t.equals("/"))
//			System.out.printf("%d/%d=%.2f\n"+a,b,((double)a/b));
//		else
//			System.out.println("잘못된 기호");
		
		//실습)적정체중 구하기
//		Scanner sc=new Scanner(System.in);
//		System.out.print("이름/신장/몸무게?");
//		String name=sc.next();
//		double a=sc.nextInt();
//		double b=sc.nextInt();
//		double d=(a-100)*0.9;
//		if(b<=d*1.1)
//			System.out.println(name+":적정체중");
//		else if(b<d*0.9)
//			System.out.println(name+":체중미달");
//		else
//			System.out.println("과체중");
		
		//실습)전기사용요금
		//1)기본요금구하기
		//2)사용요금 단계별로 구하기
		//3)기본요금+사용요금 합산
//		Scanner sc=new Scanner(System.in);
//		System.out.print("월 사용량?");
//		int a=sc.nextInt();
//		//기본요금
//		int base;
//		double elecost;
//		double eleuse1=93.3, eleuse2=187.9, eleuse3=280.6;
//		if(a<=200) {
//			base=910;
//			elecost=a*eleuse1;
//		}
//		else if(a<=400) {
//			base=1600;
//			elecost=(a*eleuse1)+(a-200)*eleuse2;
//		}
//		else {
//			base=7300;
//			elecost=(a*eleuse1)+(a*eleuse2)+(a-400)*eleuse3;
//		}
//		
//		System.out.println("기본요금:"+base);
//		System.out.println("사용요금:"+elecost);
//		System.out.println("전기요금:"+Math.floor(base+elecost));
//		double s1=base+a*93.3;
//		double s2=base+(200*93.3)+((a-200)*187.9);
//		double s3=base+(200*93.3)+(200*187.9)+((a-400)*280.6);
//		if(a<=200)
//			System.out.println(s1+"원");
//		else if(a<=400)
//			System.out.println(s2+"원");
//		else
//			System.out.println(s3+"원");
		
		//실습)중첩 조건문
//		String myid="java",mypw="1234";
//		Scanner sc=new Scanner(System.in);
//		System.out.print("아이디를 입력해주세요:");
//		String id=sc.next();
//		if(id.equals(myid)) {
//			System.out.println("아이디가 일치합니다");
//			System.out.print("패스워드를 입력해주세요:");
//			String pw=sc.next();
//			if(pw.equals(mypw)) {
//				System.out.println("패스워드가 일치합니다");
//				System.out.println("로그인 성공");		
//			}else		
//				System.out.println("패스워드 불일치");
//		}else
//			System.out.println("아이디 불일치");
		
		//실습)윤년 체크하기
		//윤년의 조건
		//1)4의 배수면 윤년
		//2)100의 배수면 윤년이 아님
		//3)400의 배수이면 윤년
//		Scanner sc=new Scanner(System.in);
//		System.out.print("년도입력:");
//		int a=sc.nextInt();
//		if(a%4==0 && a%100!=0 || a%400==0)
//			System.out.println("윤년");
//		else
//			System.out.println("윤년아님");
		
		//실습)숫자인지 아닌지 체크하기
//		Scanner sc=new Scanner(System.in);
//		System.out.print("나이는?");
//		if(sc.hasNextInt()) {//다음에 읽을 값이 정수일때 true
//			int age=sc.nextInt();
//			System.out.println("당신의 나이는 "+ age);
//		}else
//			System.out.println("잘못된 값");
		
		//NaN: Not a Number:숫자가 아니다
//		Scanner sc=new Scanner(System.in);
		
		//실습)주사위게임(1~6)
		//랜덤:무작위의 값
		//Math.random():0<=x<1
		//랜덤수*마지막수+시작수
//		int a=(int)(Math.random()*6+1);
//		int b=(int)(Math.random()*6+1);
//		System.out.println("주사위 던지는중......");
//		Thread.sleep(3000);// 1/1000초
//		System.out.println("A:"+a);
//		System.out.println("B:"+b);
//		if(a>b)
//			System.out.println("A승");
//		else if(b>a)
//			System.out.println("B승");
//		else
//			System.out.println("무승부");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
