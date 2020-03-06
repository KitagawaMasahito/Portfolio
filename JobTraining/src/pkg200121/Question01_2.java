package pkg200121;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question01_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("数字を入力：");
		String input = sc.next();
		
		String regex = "[0-9]+";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		boolean b = m.matches();
		
		if(b==true) {
			System.out.println("入力完了です");
		}else {
			System.out.println("入力が不正です");
		}
	}
}
