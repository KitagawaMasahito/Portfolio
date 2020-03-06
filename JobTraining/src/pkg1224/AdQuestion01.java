package pkg1224;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdQuestion01 {
	public static void main(String[] args) {
		List<Integer> evenNum = new ArrayList<Integer>();
		List<Integer> oddNum  = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("数字を入力：");
			int num = sc.nextInt();
			
			if(num==0) {
				System.out.println("処理を終了します");
				break;
			}else if(num%2==0) {
				System.out.println("偶数です");
				evenNum.add(num);
			}else if(num%2==1) {
				System.out.println("奇数です");
				oddNum.add(num);
			}
		}
		System.out.println("偶数配列："+evenNum);
		System.out.println("奇数配列："+oddNum);
	}
}
