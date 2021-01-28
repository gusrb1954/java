package p01_Class;
//책 클래스
//필드:출판사(public static final),책권수(private static),책코드(private),책이름,단가
//생성자:기본생성자,책코드/책이름,책코드/책이름/책단가(음수불가)
//세터/게터:책코드(게터),책이름(게터/세터),책단가(게/세터),책권수(게터)
//toString
class Book{
	public static final String COMPANY_NAME;
	static {
		COMPANY_NAME="국제출판사";
	}
	private static int bookCnt; //책권수
	
	private String bookCode;
	private String bookName;
	private int bookPrice;
//	public Book() {}
	public Book(String bookCode, String bookName) {
		bookCnt+=1;
		this.bookCode = bookCode;
		this.bookName = bookName;
	}
	public Book(String bookCode, String bookName, int bookPrice) {
		this(bookCode,bookName); //나자신의 생성자
		setBookPrice(bookPrice);
	}
	//static메소드:책권수 getter
	public static int getBookCnt() {
		return bookCnt;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		if(bookPrice>=0) this.bookPrice = bookPrice;
	}
	public String getBookCode() {
		return bookCode;
	}
	@Override
	public String toString() {
		return "Book [bookCode=" + bookCode + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	
}



public class J201215_04_book {

	public static void main(String[] args) {
		System.out.println("책권수:"+Book.getBookCnt());
		//객체생성
		Book b=new Book("B001","자바프로그래밍",10000);
		System.out.println(b);
		System.out.println("책권수:"+Book.getBookCnt());
		Book b2=new Book("B002","파이썬",20000);
		System.out.println(b2);
		System.out.println("책권수:"+Book.getBookCnt());
		
		
		
		
		
		
	}

}
