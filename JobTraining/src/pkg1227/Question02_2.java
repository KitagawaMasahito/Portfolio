package pkg1227;
import java.util.HashSet;
import java.util.Set;

public class Question02_2 {
	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();
		
		for(int a=0;a<10;a++) {
			for(int i=0;i<10;i++) {
				numbers.add(1+(int)(Math.random()*10));
			}
			System.out.println("要素数："+numbers.size());
			for(Integer n:numbers) {
				System.out.print(n+" ");
			}
			System.out.println("");
			numbers.clear();
		}
	}
}
