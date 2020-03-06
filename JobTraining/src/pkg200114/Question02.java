package pkg200114;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Question02 {
	public static void main(String[] args) {
		Calendar tokyoPara = Calendar.getInstance();
		
		tokyoPara.set(2020, 7, 25, 20, 0);
		
		SimpleDateFormat xDay = new SimpleDateFormat("yyyy/MM/dd(E) ah:mm");
		System.out.println("東京パラリンピック開会式:"+xDay.format(tokyoPara.getTime()));
		
		tokyoPara.add(Calendar.DATE, 13-1);
		System.out.println("東京パラリンピック閉会式:"+xDay.format(tokyoPara.getTime()));
	}
}
