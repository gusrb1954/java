package basic01;

import java.util.Scanner;

public class J201208_02_Scanner {

	public static void main(String[] args) {
		//사용자에게 입력받기: Scanner클래스
//		Scanner sc=new Scanner(System.in);
//		System.out.print("정수는?");
//		int a=sc.nextInt(); //정수를 입력
//		System.out.println("입력한 값:"+a);
		
		//실습)정수를 입력받아 60점 이상이면 합격
//		Scanner sc=new Scanner(System.in);
//		System.out.print("점수입력:");
//		int a=sc.nextInt();
//		String s=a>=60?"합격":"불합격";
//		System.out.println(s);
		
		//실습)두 정수를 입력받아 덧셈
//		Scanner sc=new Scanner(System.in);
//		System.out.print("첫번째수:");
//		System.out.print("두번째수:");
//		System.out.print("두 정수:");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		System.out.println("합:"+(a+b));
		
		//실수 입력받기
//		Scanner sc=new Scanner(System.in);
//		System.out.print("실수는?");
//		double d=sc.nextDouble();
//		System.out.println(d);
		
		//실습)반지름(정수)과 원주율(실수)을 입력받아서 원의 넓이를 구하기
//		Scanner sc=new Scanner(System.in);
//		System.out.print("반지름, 원주율:");
//		int i=sc.nextInt();
//		double d=sc.nextDouble();
//		System.out.println("원의넓이:"+(i*i*d));
		
		//수학관련 클래스:java.lang.Math(내장 패키지)
		//static은 객체 생성없이 바로 접근 가능
//		System.out.println(Math.PI); 
		
		//문자열 입력 받기
		//next() 공백/엔터 기준으로 입력
//		Scanner sc=new Scanner(System.in);
//		System.out.print("이름은?");
//		String s=sc.next();
//		System.out.println("당신의 이름은"+s);
		
		//라인단위로 입력을 받기
//		Scanner sc=new Scanner(System.in);
//		System.out.print("이름은?");
//		String name=sc.nextLine();
//		System.out.println("당신의 이름은 "+name);
		
		//실습)이름과 닉네임을 입력받아서 출력
//		Scanner sc=new Scanner(System.in);
//		System.out.print("이름: ");
//		String s1=sc.next();
//		sc.nextLine(); //\n의 버퍼를 비우기 위해서 
//		System.out.print("닉네임: ");
//		String s2=sc.nextLine();
//		System.out.println("이름:"+s1+"닉네임: "+s2);
		
		//실습) 나이와 취미를 입력받아 출력
//		Scanner sc=new Scanner(System.in);
//		System.out.print("나이는?");
//		int age=sc.nextInt();
//		System.out.print("취미는?");
//		String h=sc.next();
//		System.out.println("나이:"+age);
//		System.out.println("취미:"+h);
		
		//실습)이름,국어/영어/수학 점수를 입력
		//이름,합계,평균 출력
//		Scanner sc=new Scanner(System.in);
//		System.out.print("이름은?");
//		String name=sc.next();
//		System.out.print("국어 영어 수학 점수는?");
//		int s1=sc.nextInt();
//		int s2=sc.nextInt();
//		int s3=sc.nextInt();
//		int sum=s1+s2+s3;
//		System.out.printf("이름:"+name +" 합계:"+sum+" 평균:%.2f"+(double)(sum/3));
		
//		int x=10;
//		int y=20;
//		int z=(++x)+(y--);
//		System.out.println(z);
		
//		int pen=534;
//		int stu=30;
//		
//		int p=pen%stu;
//		System.out.println(p);
		
//		int value=356;
//		int var=(356/100)*100;
//		System.out.println(var);
		
//		int lengthtop=5;
//		int lengthbottom=10;
//		int height=7;
//		double area=(lengthtop+lengthbottom)*height/2;
//		System.out.println(area);
		
		//0으로 나눌수 없다
//		int a=10, b=0;
//		System.out.println(a/b);
		
		//NaN
		double x=5.0, y=0.0;
		double z=x%y;
		System.out.println(z);
		
		System.out.println(Double.isNaN(z)?
				"0으로 나눌수 없습니다":z+0.1);
		
		Object obj=Double.isNaN(z)?"0으로 나눌수 없습니다":z+0.1;
		System.out.println(obj);
		//Object는 모든 클래스의 최상위클래스
		
//		System.out.println(z+0.1);
//		System.out.println(Double.isNaN(z));
		
		
		
	}

}
