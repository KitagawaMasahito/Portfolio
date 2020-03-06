package pkg200107;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question01_3 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		Collections.addAll(numbers, 1,2,3,4,5,6,7,8,9,10,11,12,13);
		System.out.println("(イ)："+numbers);
		
		Collections.reverse(numbers);
		System.out.println("(ウ)："+numbers);
		
		Collections.shuffle(numbers);
		System.out.println("(エ)："+numbers);
		
		Collections.rotate(numbers, 3);
		System.out.println("(オ)："+numbers);
		
		System.out.println("(カ)："+Collections.max(numbers));
		
		System.out.println("(キ)："+Collections.min(numbers));
	}
}
