package p06_generics;

//회원관리 클래스
//필드:아이디(String,Integer),패스워드(String,Integer)
class Member<T1,T2>{
	private T1 userid;
	private T2 pwd;
	
	Member(T1 userid, T2 pwd){
		this.userid=userid;
		this.pwd=pwd;
	}

	public T1 getUserid() {
		return userid;
	}

	public void setUserid(T1 userid) {
		this.userid = userid;
	}

	public T2 getPwd() {
		return pwd;
	}

	public void setPwd(T2 pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "Member [userid=" + userid + ", pwd=" + pwd + "]";
	}
	
	
	
	
	
}



public class J201221_03_member {

	public static void main(String[] args) {
		//문자열:M001/1111
		Member<String,String> member=new Member<>("M001", "1111");
		System.out.println(member);
		
		//정수:100/2222
		Member<Integer,Integer> member1=new Member<>(100, 2222);
		System.out.println(member1);
	}

}
