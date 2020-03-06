package pkg200121;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question02_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("入力：");
		String str = sc.next();
		
		String regex = "^[ぁ-ん]+";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		boolean boo = m.matches();
		
		if(boo==true) {
			System.out.println("入力完了です");
		}else {
			System.out.println("入力が不正です");
		}
	}
}
