package p03_exception;
class Car{
	private String name;
	private int speed;
	public Car(String name) {
		this.name = name;
	}
	//속도 up메소드:100을 넘으면 예외발생
	//throws:예외 던지기
	//throw:예외발생시키기
	void speedUP() throws Exception {
		speed+=1;
		if(speed>100) {
			speed=100;
			throw new Exception();
		}
	}
	//속도 down메소드:50미만이면 예외발생
	void speedDown() throws Exception {
		speed-=1;
		if(speed<50) {
			speed=50;
			throw new Exception();
		}
	}
}
public class J201218_03_car {
	public static void main(String[] args) {
		//객체생성
		Car car=new Car("포르쉐");
		//속도업 테스트
		for(int i=0;i<105;i++) {
			try {
				car.speedUP();
			} catch (Exception e) {
				System.out.println("속도 업 예외");
				e.printStackTrace();
			}			
		}
		//속도다운 테스트
		for(int i=0;i<51;i++) {
			try {
				car.speedDown();
			} catch (Exception e) {
				System.out.println("속도  다운 예외");
//				e.printStackTrace();
			}
		
		
		
		
		}
	}
}
