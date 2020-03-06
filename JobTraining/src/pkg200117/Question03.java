package pkg200117;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Question03 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(int i=0;i<20;i++) {
			numbers.add((int)(Math.random()*20)+1);
		}
		
		for(Integer n:numbers) {
			System.out.print(n+",");
		}
		System.out.println();
		
		Stream<Integer> numStrm = numbers.stream();
		
		numStrm.map(n -> n+1).filter(n -> n<=10).forEach(n -> System.out.print(n+","));
		System.out.println();
	}
}
