package pkg1113;
import java.util.Scanner;

public class Sample18 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("ID:");
		String id = scn.next();
		
		System.out.print("パスワード:");
		String passWord = scn.next();
		
		if(id.equals("admin") && passWord.equals("java")) {
			System.out.println("ログインに成功しました");
		}else {
			System.out.println("IDまたはパスワードが違います");
		}
	}
}
