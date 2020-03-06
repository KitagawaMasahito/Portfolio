package pkg200114;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Sample01 {
	public static void main(String[] args) {
		
		int num = 9;
		String numToStr = String.valueOf(num);
		System.out.println(numToStr+10);
		System.out.println(num+10);
		
		String str = "15";
		int strToInt = Integer.parseInt(str);
		System.out.println(str+16);
		System.out.println(strToInt+16);
		
		Calendar cld = Calendar.getInstance();
		
		System.out.println("　年:"+cld.get(Calendar.YEAR));
		System.out.println("　月:"+cld.get(Calendar.MONTH));
		System.out.println("　日:"+cld.get(Calendar.DATE));
		System.out.println("　時:"+cld.get(Calendar.HOUR_OF_DAY));
		System.out.println("　分:"+cld.get(Calendar.MINUTE));
		System.out.println("　秒:"+cld.get(Calendar.SECOND));
		System.out.println("曜日:"+cld.get(Calendar.DAY_OF_WEEK));
		
		Calendar tokyoOlympic = Calendar.getInstance();
		
		tokyoOlympic.set(2020, 6, 24);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd(E)");
		System.out.println("開始日:"+sdf.format(tokyoOlympic.getTime()));
		
		tokyoOlympic.add(Calendar.DATE, 17-1);
		System.out.println("終了日:"+sdf.format(tokyoOlympic.getTime()));
	}
}
