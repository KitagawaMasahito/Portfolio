package pkg1115;
import java.util.Scanner;

public class Sample40 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("nを入力：");
		int n = scn.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("●");
			}
			System.out.println("");
		}
	}
}
