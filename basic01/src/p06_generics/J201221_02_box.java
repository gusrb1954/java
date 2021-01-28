package p06_generics;

class Note{
	public String toString() {
		return "노트";
	}
}

class Pen{
	public String toString() {
		return "펜";
	}	
}

//class Box{
//	private Object obj;
//	Box(Object note){
//		obj=note;
//	}
//	Object getObj() {
//		return obj;
//	}
//}

//제네릭 타입으로 재설계
class Box<T>{
	private T obj;
	Box(T obj){
		this.obj=obj;
	}
	T getObj() {
		return obj;
	}
}

public class J201221_02_box {

	public static void main(String[] args) {
//		Box box=new Box(new Note());
//		System.out.println(box.getObj());
		
//		Box box2=new Box(new Pen());
//		System.out.println(box2.getObj());
		//Object타입일 경우 문제점
		
		//제네릭을 이용한 Box객체 생성
		Box<Pen> box=new Box<Pen>(new Pen());
		System.out.println(box.getObj());
		
		Box<Note> box1=new Box<Note>(new Note());
		System.out.println(box1.getObj());
		
		
		
		
	}

}
