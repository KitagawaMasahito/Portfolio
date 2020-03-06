package pkg200114;

import java.util.Scanner;
import java.util.function.Function;

public class MorningTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("入力文字列：");
		
		String strInput = sc.next();
		
//		StrMethod strCtrl = (String str) -> {return str.length();};
//		System.out.println("文字数："+strCtrl.StrLength(strInput)+"文字");
		
		Function<String, Integer> strlen = str ->  str.length();
		System.out.println("文字数："+strlen.apply(strInput)+"文字");
	}
}

//interface StrMethod{
//	int StrLength(String strI);
//}
