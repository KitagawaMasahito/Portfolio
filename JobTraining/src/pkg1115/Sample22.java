package pkg1115;
import java.util.Scanner;

public class Sample22 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("１つ目の文字情報：");
		String str1 = scn.next();
		
		System.out.print("２つ目の文字情報：");
		String str2 = scn.next();
		
		boolean boo =str1.equals(str2);
		
		System.out.println("--------- 比較結果 ---------");
		System.out.println("１つ目の文字列⇒"+str1);
		System.out.println("２つ目の文字列⇒"+str2);
		System.out.println(boo == true ? "2つの文字列は等しいです":"2つの文字列は異なっています");
	}
}
