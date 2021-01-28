package p07_collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class J201222_01_LinkedList {

	public static void main(String[] args) {
		// 1-2:LinkedList
		//리스트기반
		//각요소가 자신의 이전요소의 주소와 다음요소의 주소를 가지고 있다
		//추가/삭제가 유리, 검색이 불리
		
//		List<String> list=new LinkedList<>();
//		list.add("blue");
//		list.add("yellow");
//		list.add("green");
//		
//		//iterator를 이용한 출력
//		Iterator<String> a =list.iterator();
//		while(a.hasNext()) {
//			System.out.println(a.next());
//		}
//		//for문을 이용해서 출력
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		//여러가지 형을 넣고 싶다
		List<Object> list=new LinkedList<>();
		list.add("java");
		list.add(10);
		list.add(2.2);
		System.out.println(list);
		String a=(String)list.get(0);
		System.out.println(a);
		
		
		
		
		
		
		
		
		
	}

}
