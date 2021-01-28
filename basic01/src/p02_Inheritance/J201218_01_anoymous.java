package p02_Inheritance;
//부모클래스
class Dog{
	void eat() {
		System.out.println("먹는다");
	}
	void walk() {
		System.out.println("걸을수 있다");
	}
}
//자식클래스
//다친강아지
//class HurtDog extends Dog{
//	@Override
//	void walk() { //오버라이딩
//		System.out.println("걸을수 없다");
//	}
//}

public class J201218_01_anoymous {

	public static void main(String[] args) {
		Dog dog=new Dog();
//		dog.walk();
//		dog.eat();
//		HurtDog hdog=new HurtDog();
//		hdog.eat();
//		hdog.walk();
		
		//익명클래스
		//Dog클래스의 자식클래스 생성
		//다형성을 이용해서 자식객체의 참조변수
		Dog hdog=new Dog() {
			@Override
			void walk() {
				System.out.println("걸을수 없다");
			}
			//오버라이딩 외에는 의미가 없다
//			void sleep() {
//				System.out.println("자고 있다");
//			}
		};
		
		hdog.walk();
		hdog.eat();
		
		
		
	}

}
