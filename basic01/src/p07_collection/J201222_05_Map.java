package p07_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J201222_05_Map {

	public static void main(String[] args) {
		// Map<K,V>
		//맵계열은 순서가 없다
		//key와 value의 한쌍
		//key중복이 안되고 value는 중복가능
		//HashMap:null값 허용, HashTable:null값 허용안됨
		//TreeMap:정렬기능을 제공
		
//		Map<String, Integer> map=new HashMap<>();
//		map.put("홍길동", 20);
//		map.put("이순신", 40);
//		System.out.println(map.get("홍길동"));
//		
//		System.out.println(map.keySet());
//		System.out.println(map.values());
//		
		
		//실습)사용자에게 0~3까지의 영어단어를 입력받아 맵에 저장하고
		//출력
		Map<Integer, String> map=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.print(i+"의 영단어?");
			String spell=sc.next();
			map.put(i, spell);
		}
		System.out.println(map);
		System.out.println("--------------");
////		System.out.println(map.size());
//		for(int i=0;i<map.size();i++) {
//			System.out.println(map.get(i));
//		}
		//map.keyset()
		for(int key:map.keySet()) {
			System.out.println(key+":"+map.get(key));
		}
		
		
		
		
		
		
		
		
		
	}

}
