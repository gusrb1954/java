package p05_util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class J201221_02_SimpleDataFomat {

	public static void main(String[] args) {
		// 날짜와 시간을 원하는 포맷으로
		Date date=new Date();
		System.out.println(date);
		
		//년(4)-월(2)-일(2)
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		System.out.println(sf.format(date));
		
		
		

	}

}
