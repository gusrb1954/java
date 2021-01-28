package p02_Inheritance;
//덧셈계산기
interface AddCal{
	int add(int a, int b);
}

public class J201218_04_anony_Cal {

	public static void main(String[] args) {
		// 익명클래스
//		AddCal cal=new AddCal() {
//			
//			@Override
//			public int add(int a, int b) {
//				return a+b;
//			}
//		};
//		System.out.println(cal.add(10, 20));
		//람다식
		AddCal cal2=(a,b)->a+b;
		System.out.println(cal2.add(10, 6));
	}

}
