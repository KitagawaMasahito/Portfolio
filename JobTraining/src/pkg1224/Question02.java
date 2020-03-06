package pkg1224;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question02 {
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		Collections.addAll(numbers, 5,-5,67,54,-4);
		
		System.out.println(numbers);
		
		numbers.remove(2);
		
		System.out.println(numbers.size());
		
		System.out.println(numbers.get(3));
		
		System.out.println(numbers);
		
		for(int i=0;i<numbers.size();i++) {
			if(numbers.get(i)<0) {
				numbers.remove(i);
			}
		}
		
		int sum=0;
		for(Integer n:numbers) {
			sum+=n;
		}
		System.out.println(sum);
		
		for(Integer m:numbers) {
			System.out.println(m);
		}
	}
}
