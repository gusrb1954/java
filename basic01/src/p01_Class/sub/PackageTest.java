package p01_Class.sub;

public class PackageTest {
	//접근제한자
	//public:어떤 클래스든지 접근가능
	//protected:같은 패키지와 자식클래스만 접근가능
	//default(안붙일때):같은 패키지만 접근가능
	//private:자신의 클래스만 접근가능
	private int a=100;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a=a;
	}
}
