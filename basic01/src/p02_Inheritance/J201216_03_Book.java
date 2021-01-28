package p02_Inheritance;
//책
//부모클래스
abstract class Book{
	//자식클래스가 반드시 구현해야될 메소드 정의
	abstract String position(); //위치
	abstract int salPer(); //세일율
}
//자식클래스
class Language extends Book{
	private String name="언어";
	@Override
	String position() {
		return "A1-1";
	}
	@Override
	int salPer() {
		return 20;
	}
	@Override
	public String toString() {
		return name;
	}
	
}
class Novel extends Book{
	private String name="소설";
	@Override
	String position() {
		return "B1-1";
	}
	@Override
	int salPer() {
		return 10;
	}
	@Override
	public String toString() {
		return name;
	}
	
}
//책관리클래스
class BookInfo{
	//책위치 출력
	void bkPosition(Book b) {
		
		System.out.println(b+" 위치:"+b.position());
	}
	//책의 할인율 출력
	void bkSalePer(Book b) {
		System.out.println(b+" 할인율:"+b.salPer());
	}
}
public class J201216_03_Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book po=new Language();
		Book sale=new Novel();
		
		BookInfo info=new BookInfo();
		info.bkPosition(po); info.bkSalePer(po);
		info.bkPosition(sale); info.bkSalePer(sale);
	}

}
