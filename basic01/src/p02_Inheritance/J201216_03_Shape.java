package p02_Inheritance;
//모양클래스
//부모클래스:필드(height,width),생성자(둘다입력),기능(넓이:height*width)
//final class:상속불가
class Shape{
	private int height;
	private int width;

	Shape(int height, int width) {
		this.height = height;
		this.width = width;
	}
	//메소드의 final: 오버라이딩 불가
	//자식클래스가 재정의해서 메소드를 사용 못하게한다
//	final double area() {
	double area() {
		return height*width;
	}

	@Override
	public String toString() {
		return "Shape [height=" + height + ", width=" + width + "]";
	}

}
//자식클래스:
class Rectangle extends Shape{

	Rectangle(int height, int width) {
		super(height, width);
	}
	
}
class Triangle extends Shape{
	//넓이:height*width/2
	Triangle(int height, int width) {
		super(height, width);
	}

	@Override
	double area() {
		return super.area()/2;
	}
	
}
public class J201216_03_Shape {

	public static void main(String[] args) {
		Rectangle rec=new Rectangle(10, 20);
		Triangle tri=new Triangle(10, 20);
		System.out.println("사각형넓이:"+rec.area());
		System.out.println("삼각형넓이:"+tri.area());
		//오브젝트의 toString()실행
		System.out.println("사각형:"+rec);
		System.out.println("삼각형:"+tri);
	}

}
