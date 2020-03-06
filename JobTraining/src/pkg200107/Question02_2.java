package pkg200107;

import java.util.Arrays;
import java.util.List;

public class Question02_2 {
	public static void main(String[] args) {
		String[] drinks = {"コーヒー","緑茶","つぶつぶオレンジ","おしるこ","コーンポタージュ"};
		printArray(drinks);
		
		String[] copyDrinks = Arrays.copyOf(drinks, 5);
		
		Arrays.sort(copyDrinks);
		printArray(copyDrinks);
		
		Arrays.fill(drinks, "飲み物");
		printArray(drinks);
		
		List<String> drinksList = Arrays.asList(copyDrinks);
		System.out.println("紅茶を含む？⇒"+drinksList.contains("紅茶"));
	}
	
	public static void printArray(String[] array) {
		for(String s:array) {
			System.out.print(s+", ");
		}
		System.out.println();
//		System.out.println(Arrays.asList(array));
	}
}
