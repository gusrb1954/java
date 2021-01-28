package p05_util;

import java.text.DecimalFormat;

public class J201221_03_DecimalFomat {

	public static void main(String[] args) {
		// 숫자를 형식화
		//#,0,+/-
		float pi=1253.14f;
		
		//#:있는 자리수만
		DecimalFormat dc=new DecimalFormat("###.###");
		System.out.println(dc.format(pi));
		
		//0:자릿수 고정
		DecimalFormat dc2=new DecimalFormat("000.000");
		System.out.println(dc2.format(pi));
		//,:자릿수
		DecimalFormat dc3=new DecimalFormat(",###.000");
		System.out.println(dc3.format(pi));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
