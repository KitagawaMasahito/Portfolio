package pkg1224;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample01 {
	public static void main(String[] args) {
		List<String> strs = new ArrayList<String>();
		
		strs.add("hello");
		strs.add("ArrayList");
		System.out.println(strs);
		
		strs.remove(1);
		strs.set(0, "Hello");
		System.out.println(strs);
		
		Collections.addAll(strs, "Java","World");
		System.out.println(strs);
	}
}
