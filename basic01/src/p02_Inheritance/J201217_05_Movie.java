package p02_Inheritance;
//영화
interface Movie{
	void title();
	void openDate();
	void actor();
}
//상영관
interface Theater{
	void theaterName(); //상영관명
	void theaterRoom(); //관
}
//로코
class Movie1 implements Movie,Theater{
	private String name;
	private String odate;
	private String actorname;
	Movie1(String name, String odate, String actorname) {
		this.name = name;
		this.odate = odate;
		this.actorname = actorname;
	}

	@Override
	public void openDate() {
		System.out.println("오픈일자:"+odate);
	}

	@Override
	public void actor() {
		System.out.println("배우:"+actorname);
	}

	@Override
	public void title() {
		System.out.println("---------------");
		System.out.println("제목:"+name);
		openDate();
		actor();
		System.out.println("---------------");
		
	}

	@Override
	public void theaterName() {
		System.out.print("CGV ");
	}

	@Override
	public void theaterRoom() {
		System.out.println("1관");
	}
	
}
//로맨스
class Movie2 implements Movie,Theater{
	private String name;
	private String odate;
	private String actorname;
	Movie2(String name, String odate, String actorname) {
		super();
		this.name = name;
		this.odate = odate;
		this.actorname = actorname;
	}
	@Override
	public void openDate() {
		System.out.println("오픈일자:"+odate);		
	}
	@Override
	public void actor() {
		System.out.println("배우:"+actorname);		
	}
	@Override
	public void title() {
		System.out.println("---------------");
		System.out.println("제목:"+name);
		openDate();
		actor();
		System.out.println("---------------");
		
	}
	@Override
	public void theaterName() {
		System.out.print("롯데시네마 ");
	}
	@Override
	public void theaterRoom() {
		System.out.println("5관");
	}
	
}
//영화정보
class MovieInfo{
	//상영관 정보,영화정보
	void infoPrint(Movie m,Theater t) {
		m.title();
		t.theaterName();
		t.theaterRoom();
		System.out.println("***************");
	}
}
public class J201217_05_Movie {

	public static void main(String[] args) {
		Movie1 movieA=new Movie1("런", "2020-11-20", "사라폴슨");
		Movie2 movieB=new Movie2("이웃사촌", "2020-12-09", "오달수");
		MovieInfo info=new MovieInfo();
		info.infoPrint(movieA,movieA);
		info.infoPrint(movieB,movieB);
	}

}
