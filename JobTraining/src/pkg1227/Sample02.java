package pkg1227;
import java.util.HashSet;
import java.util.Set;

public class Sample02 {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		
		names.add("アズキ");
		names.add("キナコ");
		names.add("マメ");
		names.add("マロン");
		names.add("マメ");
		
		for(String s:names) {
			System.out.print(s+" ");
		}
		System.out.println("");
		
		names.remove("マロン");
		
		System.out.println(names+"要素数"+names.size());
		
		System.out.println("配列が空か:"+names.isEmpty());
		System.out.println("マメを含むか："+names.contains("マメ"));
		
		names.clear();
		
		System.out.println("配列が空か:"+names.isEmpty());
		System.out.println("マメを含むか："+names.contains("マメ"));
	}
}
