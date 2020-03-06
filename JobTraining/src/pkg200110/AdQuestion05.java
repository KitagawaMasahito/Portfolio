package pkg200110;

import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class AdQuestion05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("[辺１]");
		double side1 = sc.nextDouble();
		
		System.out.print("[辺２]");
		double side2 = sc.nextDouble();
		
		DoubleBinaryOperator triangle = (sd1,sd2) -> {
			return Math.sqrt(sd1*sd1+sd2*sd2);
		};
		
		double side3 = triangle.applyAsDouble(side1, side2);
		
		System.out.println("直角三角形の3辺は"+side1+"と"+side2+"と"+side3+"です");
	}
}

