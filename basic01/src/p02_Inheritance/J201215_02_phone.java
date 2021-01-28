package p02_Inheritance;
//핸드폰
//부모클래스:전화걸기,사진찍기
class Phone{
	void call() {
		System.out.println("전화걸기");
	}
	void photo() {
		System.out.println("사진찍기");
	}
}

//자식클래스:상속받고
//추가기능: 블루투스
class NewPhone extends Phone{
	void bluetooth() {
		System.out.println("블루투스");
	}
}
//NewPhone의 자식
//추가기능:자동결제
class Smartphone extends NewPhone{
	void autoPay() {
		System.out.println("자동결제");
	}
}
public class J201215_02_phone {

	public static void main(String[] args) {
		// 
		NewPhone n=new NewPhone();
		n.call(); n.photo(); n.bluetooth();
		Smartphone s=new Smartphone();
		s.call(); s.photo(); s.bluetooth(); s.autoPay();
	}

}
