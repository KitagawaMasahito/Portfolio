package pkg1224;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question01 {
	public static void main(String[] args) {
		List<String> strs = new ArrayList<String>();
		
		Collections.addAll(strs,"Spring","Summer","Autumn","Winter");
		
		for(String s:strs) {
			System.out.println(s);
		}
		
		strs.remove("Autumn");
		
		strs.add(2, "Fall");
		
		System.out.println("----------");
		for(String s:strs) {
			System.out.println(s);
		}
		
		System.out.println("----------");
		System.out.println("要素数："+strs.size());
		
		System.out.println("----------");
		System.out.println(strs);
	}
}
