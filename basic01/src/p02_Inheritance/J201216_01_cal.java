package p02_Inheritance;
import p02_Inheritance.sub.Cal;

//계산기 클래스
//자식:추가기능:나머지,제곱
class NewCal extends Cal{
	void remine(double a) {
		result%=a;
	}
	void square() {
		result=Math.pow(result, 2);
	}
}
public class J201216_01_cal {

	public static void main(String[] args) {
		NewCal ncal=new NewCal();
		ncal.add(10.5);
		System.out.println(ncal.getResult());
		ncal.remine(2);
		System.out.println(ncal.getResult());
		ncal.square();
		System.out.println(ncal.getResult());
	}

}
