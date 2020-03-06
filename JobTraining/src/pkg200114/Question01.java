package pkg200114;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Question01 {
	public static void main(String[] args) {
		Calendar tokyoO = Calendar.getInstance();
		tokyoO.set(2020, 6, 24);
		
		SimpleDateFormat XDay = new SimpleDateFormat("yyyy-MM-dd(E)");
		System.out.println("2020年のスポーツの日(祝日):"+XDay.format(tokyoO.getTime()));
	}
}
