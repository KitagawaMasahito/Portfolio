package pkg1108;
import java.util.Scanner;

public class Jishuu {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("商品名：");
		String name = scn.next();
		
		System.out.print("価格[\\]：");
		int price = scn.nextInt();
		
		System.out.print("消費税[%]：");
		double shz = scn.nextDouble();
		
		double kakaku = price*(1+shz/100);
		int intKakaku = (int)kakaku;
		
		System.out.println(name+"の価格は税込\\"+intKakaku+"です");
	}
}
