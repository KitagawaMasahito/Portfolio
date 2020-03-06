package pkg1115;
import java.util.Scanner;

public class Sample09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("整数を入力して下さい:");
		int a = scn.nextInt();
		
		System.out.print("もう一つ整数を入力して下さい:");
		int b = scn.nextInt();
		
		int absA = Math.abs(a);
		int absB = Math.abs(b);
		
		System.out.println(absA == absB ? "絶対値が等しいです":"絶対値が等しくありません");
	}
}
