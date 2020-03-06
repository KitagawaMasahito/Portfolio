package pkg1115;
import java.util.Scanner;

public class Sample23 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("文字列：");
		String str = scn.next();
		
		System.out.print("何番目の文字を出力(数字で)：");
		int chrNum = scn.nextInt();
		
		char chr = str.charAt(chrNum-1);
		
		System.out.println("入力文字列⇒"+str);
		System.out.println(chrNum+"番目の文字⇒"+chr);
	}
}
