package p02_Inheritance;
//부모클래스
//슈퍼
class Super{
	void superName() {
		System.out.println("국제슈퍼마켓");
	}
}
//자식클래스
//공산품
class Product extends Super{

	@Override
	public String toString() {
		return "공산품";
	}
	
}
//고기
class Meat extends Super{

	@Override
	public String toString() {
		return "고기";
	}
}
//야채
class Vegetable extends Super{

	@Override
	public String toString() {
		return "야채";
	}
	
}
//입고클래스
class Input{
	//오버로딩
//	void inputPrint(Product p) {
//		System.out.println(p+"입고");
//	}
//	void inputPrint(Meat m) {
//		System.out.println(m+"입고");
//	}
//	void inputPrint(Vegetable v) {
//		System.out.println(v+"입고");
//	}
	void inputPrint(Super s) {
		System.out.println(s+"입고");
	}
}

public class J201216_06_super {
	public static void main(String[] args) {
		//다형성 이용해서 공산품/고기/야채 객체 생성
		Super prod=new Product();
		Super meat=new Meat();
		Super vet=new Vegetable();
		
		Input inp=new Input();
		inp.inputPrint(prod);
		inp.inputPrint(meat);
		inp.inputPrint(vet);
	}

}
