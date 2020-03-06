package pkg1113;
import java.util.Scanner;

public class Jishuu1113 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("姓；");
		String name = scn.next();
		
		System.out.print("名：");
		String lastName = scn.next();
		
		name += lastName;
		
		System.out.println(name+"さん、ようこそ！");
	}
}
