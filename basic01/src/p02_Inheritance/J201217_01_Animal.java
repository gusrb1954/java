package p02_Inheritance;
//동물원
//부모클래스
//추상클래스:추상메소드를 한개라도
abstract class Animal{
	private String name="동물";
	//추상메소드:구현부가 없다
	abstract String openTime();
}
//자식클래스
class Rabbit extends Animal{
	private String name="토끼";
	String openTime() {
		return "09:00~13:00";
	}
	public String toString() {
		return name;
	}
}
class Lion extends Animal{
	private String name="사자";
	String openTime() {
		return "14:00~15:00";
	}
	public String toString() {
		return name;
	}
}
//사육사
class AnimalCare{
	//동물들에게 먹이주기
	//동물들 산책하기
	void feeding(Animal a) {
		System.out.println(a+" 먹이주기");
	}
	void walking(Animal a) {
		System.out.println(a+" 산책하기");
	}
	void openning(Animal a) {
		System.out.println(a+"오픈시간:"+a.openTime());
	}
}
public class J201217_01_Animal {

	public static void main(String[] args) {
		//추상클래스는 객체생성 불가
//		new Animal();
		
		//토끼,사자의 객체생성
		Animal r=new Rabbit();
		Animal l=new Lion();
		//사육사 객체생성
		AnimalCare a=new AnimalCare();
		a.feeding(r); a.walking(r);
		a.feeding(l); a.walking(l);
		a.openning(r); a.openning(l);
	}

}
