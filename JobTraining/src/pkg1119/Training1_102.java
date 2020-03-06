package pkg1119;
import java.util.Scanner;

public class Training1_102 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("目標貯金額：");
		int mokuhyou = scn.nextInt();
		
		int chokin = 1;
		int day = 1;
		
		while(chokin < mokuhyou) {
			chokin = chokin*2;
			day++;
		}
		System.out.println("貯金額"+mokuhyou+"円は"+day+"日で貯まります");
	}
}
