package p03_exception;

public class J201218_02_thows {
//	static void arrIndex() {
//		try {
//			int[] arr=new int[3];
//			arr[0]=1; arr[3]=3;
//			System.out.println(arr[3]);			
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스 예외");
//		}
//	}
	//예외 던지기:throws
	//메소드가 간결해지고 가독성이 좋아진다
	//호출하는 쪽에서 처리 결정 가능
	//언체크예외
//	static void arrIndex() throws ArrayIndexOutOfBoundsException{
//		int[] arr=new int[3];
//		arr[0]=1; arr[3]=3;
//		System.out.println(arr[3]);			
//	}
	//체크예외
	static void arrIndex() throws Exception{
		int[] arr=new int[3];
		arr[0]=1; arr[3]=3;
		System.out.println(arr[3]);			
	}
	//예외발생 시키기
	static void throwTest(int a) throws Exception {
		if(a<0) {
			throw new Exception();
		}
	}
	
	public static void main(String[] args) {
		
//		try {
//			J201218_02_thows.arrIndex();
//		} catch (Exception e) {
//			System.out.println("예외가 발생");
//			e.printStackTrace();
//		}
		
		//예외발생을 처리
		try {
			J201218_02_thows.throwTest(-10);
		} catch (Exception e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		}
	}
}
