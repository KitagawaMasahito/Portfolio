package pkg1113;
import java.util.Scanner;

public class Sample14 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("数字を入力して下さい：");
		int val1 = scn.nextInt();
		
		System.out.print("もう一つ数字を入力して下さい：");
		int val2 = scn.nextInt();
		
		if( val1 > val2 ) {
			int div = val1/val2;
			int sur = val1%val2;
			System.out.println(val1+"÷"+val2+"＝"+div+"・・・余り"+sur);
		}else {
			int div = val2/val1;
			int sur = val2%val1;
			System.out.println(val2+"÷"+val1+"＝"+div+"・・・余り"+sur);
		}
	}
}
