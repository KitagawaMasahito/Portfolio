package pkg200107;

import java.util.Arrays;
import java.util.List;

public class Question03_2 {
	public static void main(String[] args) {
		String[] vegetables = {"さつまいも","ナス","たまねぎ","キャベツ","トマト","大根"};
		printArray(vegetables);
		
		String[] newVeget = Arrays.copyOfRange(vegetables, 1, 5);
		printArray(newVeget);
		
		System.out.println("配列比較結果⇒"+Arrays.equals(vegetables, newVeget));
		
		List<String> vegetList = Arrays.asList(vegetables);
		System.out.println("大根を含むか？⇒"+vegetList.contains("大根"));
	}
	
	public static void printArray(String[] array) {
		for(String s:array) {
			System.out.print(s+", ");
		}
		System.out.println();
//		System.out.println(Arrays.asList(array));
	}
}
