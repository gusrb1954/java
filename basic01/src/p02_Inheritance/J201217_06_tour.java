package p02_Inheritance;

import java.util.Scanner;

//인터페이스
//숙박/먹을거리/스포츠
interface Tour{} //인터페이스의 부모
interface Stay extends Tour{
	String stay();
}
interface Food extends Tour{
	String food();
}
interface Sport extends Tour{
	String sport();
}
//클래스
//한국/미국/중국
class Korea implements Food,Sport,Stay{

	@Override
	public String stay() {
		return "한옥마을";
	}

	@Override
	public String sport() {
		return "스키";
	}

	@Override
	public String food() {
		return "치맥";
	}
	
}
class America implements Food,Sport,Stay{

	@Override
	public String stay() {
		return "호텔";
	}

	@Override
	public String sport() {
		return "번지점프";
	}

	@Override
	public String food() {
		return "스테이크";
	}
	
}
class China implements Food,Sport,Stay{

	@Override
	public String stay() {
		return "호텔";
	}

	@Override
	public String sport() {
		return "놀이동산";
	}

	@Override
	public String food() {
		return "베이징덕";
	}
	
}
//여행사 클래스
class TourGuide{
	//숙박출력
	void stayPrint(Stay s) {
		System.out.println("숙박시설:"+s.stay());
	}
	//먹거리출력
	void foodPrint(Food f) {
		System.out.println("먹거리:"+f.food());
	}
	//스포츠출력
	void sportPrint(Sport s) {
		System.out.println("레져:"+s.sport());
	}
}
public class J201217_06_tour {

	public static void main(String[] args) {
		//사용자에게 관광지 입력받아 출력
		Scanner sc=new Scanner(System.in);
		System.out.println("1.한국 2.미국 3.중국");
		System.out.print("관광지를 선택:");
		int no=sc.nextInt();
		TourGuide tg=new TourGuide();
		
//		if (no==1){
//			Korea korea=new Korea();
//			tg.stayPrint(korea);
//			tg.foodPrint(korea);
//			tg.sportPrint(korea);
//		}else if(no==2) {
//			America america=new America();
//			tg.stayPrint(america);
//			tg.foodPrint(america);
//			tg.sportPrint(america);
//		}else if(no==3) {
//			China china=new China();
//			tg.stayPrint(china);
//			tg.foodPrint(china);
//			tg.sportPrint(china);
//		}
		//object는 가장 최상위의 부모
		//어떤데이터형이든지 저장가능하기 때문에 문제
		//Object object; //별로 좋지 않다
		Tour tour=null; //인터페이스의 부모를 생성
		
		if(no==1) {
			tour=new Korea();
		}else if(no==2) {
			tour=new China();
		}
		
		//다운캐스팅
		tg.stayPrint((Stay)tour);
		tg.foodPrint((Food)tour);
		tg.sportPrint((Sport)tour);
		
		
		
	}

}
