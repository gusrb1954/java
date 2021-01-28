package p01_Class;
//학생클래스
//필드:학교명,이름,학년,평균
//생성자:매개변수=>이름, 학년
//메소드:학년변경,평균구하기(점수배열),학생정보반환

class Stu{//F4 누르고 상속관계확인
	String school="국제고";
	String name;
	int gra;
	double avg;
	Stu(String name,int gra){
		this.name=name;
		this.gra=gra;
	}
	void setGra(int gra) {
		this.gra=gra;
	}
	//평균구하기
	void getAvg(int[] scores) {
		int sum=0;
		for(int score:scores)
			sum+=score;
		avg=(double)sum/scores.length;
	}
//	//학생정보 반환
//	String stdInfo() {
//		return "학교명:"+school+"\n"
//				+"이름:"+name+"\n"
//				+"학년:"+gra+"\n"
//				+"평균:"+avg;
//	}
	//어노테이션
	//@Override:부모의 메소드를 재정의
	@Override
	public String toString() {
		return "Stu [school=" + school + ", name=" + name + ", gra=" + gra + ", avg=" + avg + "]";
	}
}


public class J201214_04_student {

	public static void main(String[] args) {
		//학생 객체 생성
		Stu s1=new Stu("홍길동",1);
		s1.getAvg(new int[] {88,89,99});
		//학생정보출력
		System.out.println(s1); //println메소드가 주소만 넘길때 자동 toString실행
		//학년변경
		s1.setGra(2);
		System.out.println(s1);
	}

}
