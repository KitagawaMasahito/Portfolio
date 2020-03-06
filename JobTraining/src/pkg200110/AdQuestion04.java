package pkg200110;

import java.util.Scanner;
import java.util.function.Predicate;

public class AdQuestion04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("整数を入力：");
		int num = sc.nextInt();
		
		Predicate<Integer> plus = n -> {return n>0;};

		if(plus.test(num)==true) {
			System.out.println("正の整数です");
		}else{
			System.out.println("正の整数ではありません！");
		}
	}
}
