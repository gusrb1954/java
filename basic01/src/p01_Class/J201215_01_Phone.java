package p01_Class;
//핸드폰 클래스
//필드:모델,색상,용량(capacity)
//생성자:기본생성자,색상,색상과 용량,용량
//게터,세터
//toString

class Phone{
	private String model="갤럭시 s9";
	private String color;
	private int capacity;
	public Phone() {}
	public Phone(String color) {
		this.color = color;
	}
	public Phone(String color, int capacity) {
		//나자신의 생성자 호출:다른코드 작성시보다 먼저
		//코드의 중복을 막기 위해
		this(capacity); //나자신의 생성자
		this.color = color;
	}
	
	public Phone(int capacity) {
		if(capacity>=0) this.capacity=capacity;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Phone [model=" + model + ", color=" + color + ", capacity=" + capacity + "]";
	}
	
}
public class J201215_01_Phone {

	public static void main(String[] args) {
		Phone[] phones=new Phone[3];
		//핸드폰객체생성
		phones[0]=new Phone("레드",128);
		phones[1]=new Phone("블루",64);
		phones[2]=new Phone("블랙",64);
		
//		for(int i=0;i<phones.length;i++) {
//			System.out.println(phones[i]);
//		}
		for(Phone p:phones) {
			System.out.println(p);
		}
	}

}
