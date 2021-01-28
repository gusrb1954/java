package p02_Inheritance.sub;

//부모:결과필드,더하기,빼기,곱하기,나누기
public class Cal{
	//접근제한자(protected):
	//같은패키지/자식클래스 접근 가능한 접근제한자
	protected double result;
	public double getResult() {
		return result;
	}
	public void add(double a) {
		result+=a;
	}
	public void sub(double a) {
		result-=a;
	}
	public void mul(double a) {
		result*=a;
	}
	public void div(double a) {
		result/=a;
	}

}