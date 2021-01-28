package p07_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class J201221_01_ArrayList {

	public static void main(String[] args) {
		// 자료구조:프로그램에서 사요되는 데이터를 메모리나 저장장치에 저장하고
		//이를 사용하는 논리적인 구조
		//자료구조에 따라 프로그램의 성능이 좌우된다
		//데이터의 저장방식:리스트, 스택, 큐, 트리, 해쉬
		
		//컬렉션 프레임워크: 데이터의 저장방법과 알고리즘에 대한 프레임워크
		
		//1.List
		// 1)저장순서가 있다(index)
		// 2)동일한 데이터 중복 저장 허용
		//1-1.ArrayList
		//배열기반 자료구조:연속적인 공간의 할당
		//					추가삭제가 어렵다 검색시 유리
		
//		String[] s=new String[3];
//		s[0]="홍길동"; s[1]="이순신"; s[2]="유관순";
//		
//		//ArrayList 프레임워크의 제너릭타입으로 arrayList객체생성
//		ArrayList<String>names=new ArrayList<>();
//		names.add("홍길동");
//		System.out.println(names);
		
		//실습)사용자에게 정수를 입력받아 ArrayList에 저장하고 출력
		//0을 입력하면 반복문 종료
//		ArrayList<Integer>num=new ArrayList<>();
//		다형성을 이용 참조변수 선언
//		List<Integer> num=new ArrayList<>();
//		Scanner sc=new Scanner(System.in);
//		while(true) {
//			System.out.print("정수입력:");
//			int a=sc.nextInt();
//			if(a==0) break;
//			num.add(a);
//		}
//		System.out.println(num);
//		//for문으로 출력
//		for(int i=0;i<num.size();i++) {
//			System.out.println(num.get(i));
//		}
		//foreach문으로 출력
//		for(int a:num) {
//			System.out.println(a);
//		}
		
		//add메서드
		//Double저장 ArrayList생성
//		List<Double> list=new ArrayList<>();
//		list.add(1.1);
//		list.add(2.2);
//		System.out.println(list);
//		list.add(1, 3.3); //중간에 삽입
//		System.out.println(list);
//		list.remove(0); //삭제
//		System.out.println(list);
//		System.out.println(list.remove(2.2));
//		System.out.println(list);
//		list.add(4.4);
//		System.out.println(list);
//		System.out.println(list.indexOf(4.4)); //index값 얻기
//		//for문
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		//foreach문
//		for(double a:list) {
//			System.out.println(a);
//		}
		
		
		//실습)점수를 입력받아 ArrayList에 저장하고 합계와 평균구하기
		//0을 입력하면 종료
		//입력받을 반복문
//		Scanner sc=new Scanner(System.in);
//		List<Integer> list=new ArrayList<>();
//		while(true) {
//			System.out.print("점수입력:");
//			int score=sc.nextInt();
//			if(score==0) break; 
//			list.add(score);
//		}
//		//합계구하기위한 반복문
//		int sum=0;
////		for(int a:list) {
////			sum+=a;
////		}
//		//반복자(iterater)를 통해서 순회
//		//다시 순회하려면 반복자 다시 획득
//		Iterator<Integer>it=list.iterator();
//		while(it.hasNext()) {
//			int r=it.next();
//			sum+=r;
//		}
//		
//		System.out.println("합계:"+sum);
//		System.out.println("평균:"+(double)sum/list.size());
	}

}
