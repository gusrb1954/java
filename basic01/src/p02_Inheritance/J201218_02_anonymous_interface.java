package p02_Inheritance;
interface AnonymousTest{
	//추상메소드
	void methodTest();
}

class Sample implements AnonymousTest{
	@Override
	public void methodTest() {
		System.out.println("메소드 테스트");
	}
	
}
public class J201218_02_anonymous_interface {

	public static void main(String[] args) {
//		Sample sp=new Sample();
//		sp.methodTest();
		
		//익명클래스
		//인터페이스는 객체생성 안됨
		AnonymousTest at=new AnonymousTest() {
			@Override
			public void methodTest() {
				System.out.println("메소드 테스트");
			}
		};
		
		at.methodTest();
	}

}
