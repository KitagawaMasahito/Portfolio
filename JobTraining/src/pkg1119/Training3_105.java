package pkg1119;
import java.util.Scanner;

public class Training3_105 {
	public static void main(String[] args) {
		int[] num = new int[10];
		
		Scanner scn = new Scanner(System.in);
		for(int i=0;i<num.length;i++) {
			System.out.print((i+1)+"番目の数字を入力して下さい：");
			num[i] = scn.nextInt();
		}
		
		for(int j=num.length-1;j>=0;j--) {
			System.out.print(num[j]+" ");
		}
	}
}
