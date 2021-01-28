package p03_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class J201218_01_exception {

	public static void main(String[] args) {
		// 예외처리:다른방식으로 처리가능한 에러
		// 예외가 발생하면 JVM이 해당예외객체를 생성해서
		//catch()를 호출
		//catch문의 예외클래스 순서는 자식부터 작성
		
//		Scanner sc=new Scanner(System.in);
		//0으로 나누었을 경우
		//데이터평이 잘못 입력됐을 경우
//		while(true) {
//			try {			
//				System.out.print("b의 값:");
//				int a=10;
//				int b=sc.nextInt();
//				System.out.println(a/b);
//				break;
//			}catch(InputMismatchException e) {
//				System.out.println("정수를 입력해주세요");
//				sc.nextLine(); //버퍼비우기
//				System.out.println(e);				
//				e.printStackTrace();//소스 단계별로 추척 메세지 출력
//			}catch(ArithmeticException e){
//				System.out.println("0으로 나눌수 없습니다");
//				System.out.println("다시 입력해주세요");
//				System.out.println(e);
//				
//			}catch(Exception e) {
//				System.out.println("예외가 발생");
//			}
//		}
		
		//두정수를 더하기
//		try {
//			System.out.println("정수는?");
//			int a=sc.nextInt();
//			int b=sc.nextInt();
//			System.out.println(a+b);
//		}catch(InputMismatchException e){
//			System.out.println("정수를 입력하세요");
//		}catch(Exception e) {
//			System.out.println("예외가 발생");
//		}
		//int의 범위
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Long.MIN_VALUE);
//		System.out.println(Long.MAX_VALUE);
		
//		int[] arr= {1,2,3};
//		try {
//			for(int i=0;i<arr.length;i++) {
//				System.out.println(arr[i]);				
//			}
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("잘못된 index");
//			System.out.println(e);
//		}catch(Exception e) {
//			System.out.println("예외발생");
//			e.printStackTrace();
//		}
		
		//예외의 종류:
		//1)체크예외: Exception의 자식이면서 RuntimeException을 상속하지 않은 클래스
		//2)언체크예외: RuntimeException을 상속한 클래스
		
		//체크예외
		try {
			Scanner sc=new Scanner(new File("file.txt"));
			while(sc.hasNextLine()){
				String data=sc.nextLine();
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다");
			//e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
