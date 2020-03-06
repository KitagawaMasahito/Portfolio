package pkg200121;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question03_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("携帯電話番号を入力：");
		String phoneNum = sc.next();
		
		String regex = "0[8|9]0-?[0-9]{4}-?[0-9]{4}";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(phoneNum);
		
		boolean boo = m.matches();
		
		if(boo==true) {
			System.out.println("これは携帯電話の番号です");
		}else {
			System.out.println("これは携帯電話の番号ではありません");
		}
	
	}
}
