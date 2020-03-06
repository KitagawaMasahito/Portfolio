package pkg200107;

import java.util.Arrays;

public class Question01_2 {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		
		Arrays.fill(numbers, -1);
		printArray(numbers);
		
		for(int i=0;i<10;i++) {
			numbers[i]=(int)(Math.random()*100)+1;
		}
		printArray(numbers);
		
		int[] copyNumbers = Arrays.copyOf(numbers, 10);
		Arrays.sort(copyNumbers);
		printArray(copyNumbers);
		System.out.println("配列比較結果⇒"+Arrays.equals(numbers, copyNumbers));
	}
	
	public static void printArray(int[] array) {
		for(int n:array) {
			System.out.print(n+", "); 
		}
		System.out.println();
	}
}
