package pkg1227;
import java.util.HashSet;
import java.util.Set;

public class Question01_2 {
	public static void main(String[] args) {
		Set<String> months = new HashSet<>();

		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("February");

		for(String m:months) {
			System.out.println(m);
		}

		System.out.println("Aprilを含むか："+months.contains("April"));

		months.remove("February");
		System.out.println("セットが空か："+months.isEmpty());
		for(String m:months) {
			System.out.println(m);
		}

		System.out.println("要素数："+months.size());
		
		months.clear();
		System.out.println("セットが空か："+months.isEmpty());
		System.out.println("要素数："+months.size());
	}
}
