package p07_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class J201222_04_Queue_Stack {

	public static void main(String[] args) {
		//큐:FIFO=>가장먼저 넣은 요소가 가장 먼저 나온다
		//LinkedList는 List와 Queue 인터페이스 상속
		Queue<String> que=new LinkedList<>();
		que.offer("python");
		que.offer("java");
		System.out.println("peek:"+que.peek());
		
		//스택:LIFO=>가장 나중에 넣은 요소가 가장 먼저 나온다
		Stack<String> stack=new Stack<>();
		stack.push("python");
		stack.push("java");
		System.out.println("peek:"+stack.peek());
		
	}

}
