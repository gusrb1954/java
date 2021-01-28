package p02_Inheritance;
//부모클래스
//학교
class School{
	void schoolName() {
		System.out.println("국제컴퓨터학교");
	}
}
//자식클래스
//학생
class Stud extends School{
	void nameInfo() {
		System.out.println("홍길동");
	}
	void telInfo() {
		System.out.println("010-9999-9999");
	}
}
public class J201216_05_student {
	public static void main(String[] args) {
		// 부모의 참조변수형으로 자식클래스 생성
		School sc=new Stud();
		sc.schoolName();
		((Stud)sc).nameInfo();//다운캐스팅
		((Stud)sc).telInfo();
		
		Stud std2=new Stud();
		std2.schoolName();
		std2.nameInfo();
	}

}
