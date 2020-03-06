package pkg200107;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question02_3 {
	public static void main(String[] args) {
		List<String> nums = new ArrayList<>();
		
		Collections.addAll(nums,"one","two","three","four","five","six","seven","eight","nine","ten");
		System.out.println("(イ)："+nums);
		
		Collections.swap(nums, 0, 2);
		System.out.println("(ウ)："+nums);
		
		Collections.shuffle(nums);
		System.out.println("(エ)："+nums);
		
		Collections.sort(nums);
		System.out.println("(オ)："+nums);
		
		System.out.println("(カ)："+Collections.max(nums));
		
		System.out.println("(キ)："+Collections.min(nums));
	}
}


