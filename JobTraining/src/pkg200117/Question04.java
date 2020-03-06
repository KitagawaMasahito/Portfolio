package pkg200117;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Question04 {
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
		
		for(int i=0;i<20;i++) {
			num.add((int)(Math.random()*10)+1);
		}
		for(Integer n:num) {
			System.out.print("["+n+"]");
		}
		System.out.println();
		
		Stream<Integer> numbers = num.stream();
		
		numbers.map(n -> n*5).filter(n -> n%2==0).forEach(n -> System.out.print("["+n+"]"));
		System.out.println();
	}
}
