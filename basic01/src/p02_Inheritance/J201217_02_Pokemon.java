package p02_Inheritance;

import java.util.Scanner;

//포켓몬
//부모클래스
abstract class Pokemon{
	private String name;
	//생성자
	public Pokemon(String name) {
		this.name = name;
	}
	//게터
	String getName() {
		return name;
	}
	//추상메소드
	//?:다형성을 이용
	//?:자식메소드들이 같은 이름의 메소드를 정의(강제)
	abstract void attack(); //공격
	abstract void sound(); //소리
}
//자식클래스
//피카츄
class Pikachu extends Pokemon{
	Pikachu(String name) {
		super(name);
	}
	//공격메소드/소리메소드
	@Override
	void attack() {
		System.out.println("전기공격");
	}
	@Override
	void sound() {
		System.out.println("피카피카");
	} 
	
}
//꼬부기
class Squirtle extends Pokemon{
	Squirtle(String name) {
		super(name);
	}
	//공격메소드/소리메소드
	@Override
	void attack() {
		System.out.println("물공격");
	}
	@Override
	void sound() {
		System.out.println("꼬북꼬북");
	} 
}
//게임클래스
class GamePlay{
	//소리+공격
	void attackPlay(Pokemon p) {
		System.out.println(p.getName());
		p.attack();
	}
	
	void soundPlay(Pokemon p) {
		System.out.println(p.getName());
		p.sound();
	}
	
}
public class J201217_02_Pokemon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("플레이1:");
		String player1=sc.nextLine();
		System.out.print("플레이2:");
		String player2=sc.nextLine();
		
		//피카츄/꼬부기 객체생성
		Pokemon pika=new Pikachu(player1);
		Pokemon squ=new Squirtle(player2);
		
		//게임시작
		GamePlay game=new GamePlay();
		while(true) {
			System.out.println("플레이1 1:공격");
			System.out.println("플레이1 2:소리");
			System.out.println("플레이2 3:공격");
			System.out.println("플레이2 4:소리");			
			System.out.println("--------------");
			int no=sc.nextInt();
			if(no==1) {
				game.attackPlay(pika);				
			}else if(no==2) {
				game.soundPlay(squ);				
			}
		}
		
	}

}
