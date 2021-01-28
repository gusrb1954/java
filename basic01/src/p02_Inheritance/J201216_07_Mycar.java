package p02_Inheritance;
//부모클래스
class MyCar{
	
}
//자식클래스
class Tire extends MyCar{
	private String company;
	Tire(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return company+"타이어";
	}
}
class Mirror extends MyCar{
	private String company;
	public Mirror(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return company+"미러";
	}
}
//수리업체클라스
class Refair{
	//부품을 체인지 해주는 기능
	void changePart(MyCar m) {
		//한국타이어 교체완료
		//모비스미러 교체완료
		System.out.println(m+"교체완료");
	}
}
public class J201216_07_Mycar {

	public static void main(String[] args) {
		MyCar tire=new Tire("한국");
		MyCar mirror=new Mirror("모비스");
		
		Refair rf=new Refair();
		rf.changePart(tire);
		rf.changePart(mirror);
		
		
	}

}
