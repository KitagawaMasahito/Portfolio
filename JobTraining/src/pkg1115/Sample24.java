package pkg1115;
import java.util.Scanner;

public class Sample24 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("文章を入力：");
		String str = scn.next();
		
		System.out.print("検索文字を入力：");
		String strCont = scn.next();
		boolean boo =str.contains(strCont);
		
		System.out.println(boo==true ? "文字列“"+strCont+"”が含まれています！":"文字列“"+strCont+"”は含まれていません");
	}
}
