package p01_Class;
//상품클래스
//필드(private):상품코드,상품명,단가
//생성자:매개변수=>상품코드,상품명,단가
//메소드:상품코드(게터),상품명(게터,세터),단가(게터,세터)
//		toString()
class Item{
	private String Itemcode;
	private String Itemname;
	private int price;
	//생성자를 생성하면 기본생성자 생성 안됨
	//오버로딩:매개변수의 갯수나 데이터형이 다른 경우
	//동일한 이름의 메소드를 여러개 생성가능
	public Item(String itemcode, String itemname) {
		super(); //부모클래스의 생성자:상속클래스 학습시 자세한 설명
		Itemcode = itemcode;
		Itemname = itemname;
	}

	Item(String Itemcode,String Itemname,int price){
		this.Itemcode=Itemcode;
		this.Itemname=Itemname;
		this.price=price;
	}

	public String getItemname() {
		return Itemname;
	}

	public void setItemname(String itemname) {
		Itemname = itemname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getItemcode() {
		return Itemcode;
	}
	//오버라이딩:부모클래스의 메소드를 자식클래스가 재정의
	@Override
	public String toString() {
		return "Item [Itemcode=" + Itemcode + ", Itemname=" + Itemname + ", price=" + price + "]";
	}
	
}

public class J201214_06_Item {

	public static void main(String[] args) {
		//상품객체생성
		Item i1=new Item("8801","라면",4000);
		System.out.println(i1);
		
		Item i2=new Item("8802","콜라");
		i2.setPrice(1500);
		System.out.println(i2);
	}

}
