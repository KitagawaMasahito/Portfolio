package pkg1122;
import java.util.Scanner;

public class Training3_107 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("数値を入力：");
		int a = scn.nextInt();
		
		boolean prime =isPrimeNumber(a);
		System.out.println(prime==true ? a+"は素数です":a+"は素数ではありません");
	}
	
	public static boolean isPrimeNumber(int p) {
		int wrkr = 0;			//割り切れた回数カウンター
		boolean prm = true;	//素数判断（デフォルトはtrue）
		for(int i=1;i<p;i++) {	//p÷1～p÷(p-1)を実行、割り切れた回数をカウント
			if(p%i==0) {
				wrkr++;
			}
		}
		if(wrkr>1) {			//割り切れた回数が１回超えたら素数でない
			prm=false;
		}
		return prm;
	}
}
