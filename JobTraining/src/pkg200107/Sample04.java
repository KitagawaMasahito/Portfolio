package pkg200107;
import java.util.Arrays;
import java.util.List;

public class Sample04 {
	public static void main(String[] args) {
		String[] bt = {"AB","A","O","B"};
		
		List<String> bloodType = Arrays.asList(bt);
		System.out.println(bloodType);
		
		Arrays.sort(bt);
		printArrays(bt);
		
		Arrays.fill(bt, "Unknown");
		printArrays(bt);
		
		String[] seasons = {"春","夏","秋","冬"};
		
		String[] copy = Arrays.copyOf(seasons, 2);
		printArrays(seasons);
		printArrays(copy);
		
		System.out.println("配列比較結果⇒"+Arrays.equals(seasons, copy));
	}
	
	public static void printArrays(String[] array) {
		for(String s:array) {
			System.out.print(s+", "); 
		}
		System.out.println();
	}
}
