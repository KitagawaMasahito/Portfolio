package pkg200107;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question03_3 {
	public static void main(String[] args) {
		List<String> sushi = new ArrayList<>();
		
		Collections.addAll(sushi, "たまご","イカ","マグロ","エビ","いくら","タコ","サーモン");
		System.out.println("(イ)："+sushi);
		
		Collections.swap(sushi, 2, 6);
		System.out.println("(ウ)："+sushi);
		
		Collections.shuffle(sushi);
		System.out.println("(エ)："+sushi);
		
		Collections.sort(sushi);
		System.out.println("(オ)："+sushi);
		
		Collections.reverse(sushi);
		System.out.println("(カ)："+sushi);
		
		System.out.println("(キ)最大："+Collections.max(sushi));
		System.out.println("(キ)最小："+Collections.min(sushi));
	}
}
