package pkg1115;
import java.util.Scanner;

public class Sample20 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Imput here!:");
		String str =scn.next();
		
		boolean boo =str.contains("er");
		System.out.println(boo == true ? "erを含みます":"erは含まれません");
	}
}
