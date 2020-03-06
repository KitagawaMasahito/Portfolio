package pkg1119;
import java.util.Scanner;

public class Training2_007 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.print("文字を入力:");
			String str = scn.next();
			if(str.equals("end")) {
				break;
			}
			System.out.println(str);
		}
	}
}
