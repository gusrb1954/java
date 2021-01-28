package basic01;

import java.util.Arrays;
import java.util.Scanner;

public class J201210_02_array {

	public static void main(String[] args) {
		//배열(array)
//		int[]a; //참조변수 //stack영역에 선언
//		a=new int[6]; //배열은 연속적인 공간의 할당
//		//a[0]=10; a[1]=20
//		//반복문을 이용하여 초기화
//		for(int i=0;i<a.length;i++) {
//			a[i]=(i+1)*10;
//			System.out.println(a[i]);
//		}
		
		//선언과 동시에 초기화
		//int[]a=new int[] {10,20,30}; //반드시 배열의 크기 생략
//		int[]a= {10,20,30}; //new 연산자 생략 가능
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
//		//클래스를 이용해서 값확인
//		System.out.println(Arrays.toString(a));
		
		//실습)크기가 10인 실수형배열을 선언하고 0.1~1.0까지 초기화
//		double[]a=new double[10];
//		for(int i=0;i<a.length;i++) {
//			a[i]=(i+1)*0.1;
//			System.out.printf("%.1f\n",a[i]);
//		}
//		System.out.println(Arrays.toString(a));
		
		//실습)3명의 학생의 국어점수를 입력받아 배열에 저장하고
		//합계와 평균 구하기
//		Scanner sc=new Scanner(System.in);
//		int[] score=new int[3];
//		int sum=0;
//		for(int i=0;i<score.length;i++) {
//			System.out.print(i+1+"번 국어점수는?");
//			score[i]=sc.nextInt();
//			sum+=score[i];
//		}
//		System.out.println("합계:"+sum);
//		System.out.printf("평균:%.2f\n",(double)sum/score.length);
		
		//자바는 배열의 동적할당
		//런타임시점에 크기 결정가능
//		int[] arr;
//		int size=3;
//		arr=new int[size];
		
		//실습)사용자에게 배열의 크기를 입력받아 배열의 사이즈 결정
		//실수를 입력받아 저장하고 합계를 출력
//		Scanner sc=new Scanner(System.in);
//		System.out.print("배열의 크기?");
//		int size=sc.nextInt();
//		double[] a=new double[size];
//		double sum=0;
//		for(int i=0;i<a.length;i++) {
//			System.out.print(i+1+"실수 입력:");
//			a[i]=sc.nextDouble();
//			sum+=a[i];
//		}
//		System.out.println("합계:"+sum);
//		//값출력
//		System.out.println(Arrays.toString(a));
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
//		//foreach문
//		for(double i:a) {
//			System.out.println(i);
//		}
		
		//foreach문 연습
//		int[] arr= {10,20,30,40,50};
//		int[] arr=new int[5]; //0으로 자동 초기화
//		for(int i:arr) {
//			System.out.println(i);
//		}
		
//		char[] arr= {'a','b','c','d','e'};
//		for(char c:arr) {
//			System.out.println(c);
//		}
		
		//기본형이 double형이기 때문에 뒤에 f를 써서 float형으로 명시해줘야함
//		float[] arr= {1.1f,2.2f,3.3f};
//		for(float f:arr) {
//			System.out.println(f);
//		}
		
		//문자열의 배열
//		String[] arr= {"java","python","c","basic"};
//		String[] arr=new String[4]; //null로 자동초기화
//		for(String s:arr) {
//			System.out.println(s);
//		}
		
		//실습)학생3명의 이름과 나이를 입력받아 배열에 저장하고 출력
//		String[] name=new String[3];
//		int[] age=new int[3];
//		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<3;i++) {
//			System.out.print("이름?");
//			name[i]=sc.next();
//			System.out.print("나이?");
//			age[i]=sc.nextInt();
//		}
//		System.out.println();
//		for(int i=0;i<3;i++) {
//			System.out.println(name[i]+":"+age[i]);
//		}
		
		//실습)시험 채점 프로그램
		//사용자에게 정답을 입력받아 정답배열과 비교하여 채점
		//총문항수 5문항, 한문항당 20점 배점:100점 만점0
//		int[] right= {3,4,1,1,2};//정답
//		Scanner sc=new Scanner(System.in);//대답
//		int[] an=new int[5];
//		int sum=0;
//		for(int i=0;i<an.length;i++) {
//			System.out.print("정답입력:");
//			an[i]=sc.nextInt();
//			if(right[i]==an[i])
//				sum+=20;
//		}
//		System.out.println("총점:"+sum);
		
		//실습)선택정렬
		//오름차순
		//1)배열에서 최솟값을 구한다
		//2)현재선택된 index의 값과 최소값 바꾸기
		//3)배열의 끝까지 진행
//		int[] arr= {4,6,2,1,3,5,7};
//		
//		for(int j=0;j<arr.length-1;j++) {			
//			//최소값구하기
//			int minIndex=j; //최소값의 index
////			int min=arr[j];
//			for(int i=j+1;i<arr.length;i++) {
//				if(arr[i]<arr[minIndex]]) {
////					min=arr[i];
//					minIndex=i;
//				}
//			}
//			
////			System.out.println(min);
//			System.out.println(minIndex);
//			//두수를 바꾸기
//			int temp=arr[j];
//			arr[j]=arr[minIndex];
//			arr[minIndex]=temp;
//			
//			System.out.println(Arrays.toString(arr));
//		}
		
		//더해보기) 토너먼트
		//두팀씩 묶어서 이긴팀 출력
		//마지막 한팀이 남을때까지
		int[] score= {4,5,3,4,6,7,4,5,6,7,2,4,5,8,9,3,4};
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
