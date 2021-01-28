package p02_Inheritance;
//부모클래스
class Education{
	private String name="교육청";
	int scoreCal(int score) {
		return 0;
	}
}
//자식클래스
class High extends Education{
	private String name="고등학교";
	int scoreCal(int score) {
		return score*5;
	}
	@Override
	public String toString() {
		return name;
	}
	
}
class Middle extends Education{
	private String name="중학교";
	int scoreCal(int score) {
		return score*7;
	}
	@Override
	public String toString() {
		return name;
	}
}
class Elementary extends Education{
	private String name="초등학교";
	int scoreCal(int score) {
		return score*10;
	}
	@Override
	public String toString() {
		return name;
	}
}
//성적출력 클래스
class ScoreInfo{
	void scorePrint(Education e,int score) {
		System.out.print(e+":");
		System.out.println(e.scoreCal(score));
	}
	
	void scorePrintNew(Object obj) {
		System.out.println(obj);
	}
}
public class J201216_08_education {

	public static void main(String[] args) {
		Education high=new High();
		Education middle=new Middle();
		Education ele=new Elementary();
		
		ScoreInfo info=new ScoreInfo();
//		info.scorePrint(ele,10);
//		info.scorePrint(middle,10);
//		info.scorePrint(high,10);
		info.scorePrintNew(high);
		

	}

}
