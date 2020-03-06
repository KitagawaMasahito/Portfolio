package pkg200117;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class question05 {
	public static void main(String[] args) {
		List<String> fru = new ArrayList<String>();
		
		Collections.addAll(fru, "apricot","strawberry","kiwifruit","cherry","watermelon",
				"plum","pearbanana","peach","apple");
		for(String str:fru) {
			System.out.print(str+",");
		}
		System.out.println();
		
		Stream<String> fruits = fru.stream();
		fruits.filter(f -> f.length()>=6).sorted().forEach(f -> System.out.print(f+","));
		System.out.println();
		
		Stream<String> fruits2 = fru.stream();
		fruits2.filter(f2 -> f2.contains("r")).sorted().forEach(f2 -> System.out.print(f2+","));
		System.out.println();
		
		Stream<String> fruits3 = fru.stream();
		fruits3.sorted((f3a,f3b) ->f3a.length()-f3b.length()).forEach(f3 -> System.out.print(f3+","));
		System.out.println();
	}
}
