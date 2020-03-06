package pkg200121;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question04_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("メールアドレスを入力：");
		String mailAdress = sc.next();

		String regex = "[a-z][a-z\\_]*@[a-z\\.]+\\.jp";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(mailAdress);
		boolean boo = m.matches();

		if(boo==true) {
			System.out.println("メールアドレスです");
			String[] mailAdSplit = mailAdress.split("@");
			System.out.println("ユーザー名："+mailAdSplit[0]);
			System.out.println("ドメイン名："+mailAdSplit[1]);
		}else {
			System.out.println("メールアドレスではありません");
		}
		

	}
}
