package p02_Inheritance;
//부모클래스
class Parent{
	void parentM() {
		System.out.println("부모 메소드");
	}
	void childM() {} //컴파일에러를 피하기 위해 생성
}
//자식클래스
class ChildA extends Parent{
	void childM() {
		System.out.println("자식 메소드");
	}
}
class ChildB extends Parent{
	void childM() {
		System.out.println("자식 메소드");
	}	
}
public class J201216_04_polymorphism {

	public static void main(String[] args) {
		// ChildA객체생성
//		ChildA cha=new ChildA();
//		cha.parentM();
//		cha.childM();
		//다형성을 이용해서 부모의 형으로 참조변수를 만들었다
		Parent pa=new ChildA();
		pa.parentM();
		//불가
		//컴파일시점:문법적인 에러를 체크
		//런타임시점에는 부모클래스+자식클래스가 생성되므로 사용가능
		pa.childM();
		
		//ChildB객체생성
		Parent pb=new ChildB();//업캐스팅:자동형변환
		pb.childM();		
		((ChildB)pb).childM();//다운캐스팅:명시적형변환
		
		//instanceof:참조변수에 클래스 포함여부
		System.out.println(pb instanceof Parent);
		System.out.println(pb instanceof ChildB);
		
		byte b=10;
		int a=b; //자동 형변환
		byte c=(byte)a; //명시적 형변환
		
	}
}
