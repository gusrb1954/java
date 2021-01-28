package p02_Inheritance;
//새 클래스
//부모클래스:이름(name), 다리수(legs),날수있다 기능
class Bird{
	private String name="새";
	public static final int legs=2;
	void fly() {
		System.out.println("날수있다");
	}
}
//자식클래스:이름(name)
//참새,타조
class Sparrow extends Bird{
	private String name="참새";

	public String getName() {
		return name;
	}
	
}

class Ostrich extends Bird{
	private String name="타조";

	public String getName() {
		return name;
	}
	//어노테이션
	//오버라이딩:부모클래스의 메소드를 재정의
	//자식클래스의 메소드가 실행
	@Override 
	void fly() {
		System.out.println("날수없다");
	}
	
}
public class J201216_02_overriding {

	public static void main(String[] args) {
		System.out.println("새의 다리수:"+Bird.legs);
		Sparrow s=new Sparrow();
		Ostrich o=new Ostrich();
		System.out.print(s.getName()+" "); s.fly();
		System.out.print(o.getName()+" "); o.fly();
	}

}
