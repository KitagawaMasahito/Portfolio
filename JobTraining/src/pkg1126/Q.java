package pkg1126;
import java.util.Scanner;

public class Q {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("月を入力：");
		int mon = scn.nextInt();
		if(mon<=0 || mon>12) {
			System.out.println("入力が不正です");
		}else {
			String jName = getJapaneseMonthName(mon);
			System.out.println(mon+"月は和風月名で「"+jName+"」です");
		}
	}
	
/*	public static String getJapaneseMonthName(int x) {
		String[] months = { "睦月","如月","弥生","卯月","皐月","水無月","文月","葉月","長月","神無月","霜月","師走"};
		int month = x-1;
		return months[month];
	}*/
	
	public static String getJapaneseMonthName(int month) {
		String[] months = { "睦月","如月","弥生","卯月","皐月","水無月","文月","葉月","長月","神無月","霜月","師走"};
		return months[month-1];
	}
}
