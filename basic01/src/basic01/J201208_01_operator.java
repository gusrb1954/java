package basic01;

public class J201208_01_operator {

	public static void main(String[] args) {
		//연산자
		//산술연산자(+,-,*,/,%)
//		int a=10, b=3;
//		System.out.printf("%d+%d=%d\n",a,b,a+b);
//		System.out.printf("%d-%d=%d\n",a,b,a-b);
//		System.out.printf("%d*%d=%d\n",a,b,a*b);
//		//정수와 정수=> 정수
//		System.out.printf("%d/%d=%.2f\n",a,b,(double)a/b);
//		System.out.printf("%d%%%d=%d\n",a,b,a%b);
		
		//비교(기본형)연산자
//		int a=20, b=10;
//		System.out.println(a>b);
//		System.out.println(a<b);
//		System.out.println(a==b);
//		System.out.println(a!=b);
		
		//문자열의 비교:문자열비교시 equals 메소드 사용
		//java를 변수에 대입
//		String s1="java";
//		String s2=new String("java");
//		String s3="java";
//		System.out.println(s1==s2); //주소비교:false
//		System.out.println(s1.equals(s2)); //값비교:true
//		System.out.println(s1==s3);//주소비교
//		System.out.println(s1.equals(s3));
//		
//		s1="python";
//		System.out.println(s1);
//		System.out.println(s3);
//		System.out.println(s1==s3);//주소비교
		
		//논리연산자
//		int a=10, b=-5;
//		System.out.println(a>0 && b>0);
//		System.out.println(a>0 || b>0);
//		System.out.println(!(a>0));
		
		//삼항연산자
//		int a=10;
//		String s=a>0?"양수":"음수";
//		System.out.println(s);
		
		//실습)두수중 큰수 출력
//		int a=10, b=20;
//		int i=a>b?a:b;
//		System.out.println("큰수:"+i);
		
		//실습)세수중 큰수 출력
//		int a=10, b=20, c=30;
//		int r=a>b?a:b;
//		r=r>c?r:c;
//		System.out.println("큰수:"+r);
		
		//실습)어떤 정수의 짝/홀수 출력
//		int a=5;
//		String x=a%2==0?"짝수":"홀수";
//		System.out.println(x);
		
		//실습)두점수가 80이상이면 합격
//		int s1=90, s2=85;
//		System.out.println(r);
//		String r=(s1>=80 && s2>=80)?"합격":"불합격";
		
		//실습)두 실수가 0보다 크면 양수 아니면 양수아님
		double a=0.48, b=8.52;
		String r=(a>0 && b>0)?"양수":"양수아님";
		System.out.println(r);
		
		
	}

}
