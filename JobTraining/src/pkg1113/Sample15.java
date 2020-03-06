package pkg1113;
import java.util.Scanner;

public class Sample15 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("西暦を入力して下さい：");
		int year = scn.nextInt();
		
		if( year % 400 == 0 ) {
			System.out.println(year+"年はうるう年です");
		}else {
			System.out.println(year+"年はうるう年ではありません");
		}
	}
}
