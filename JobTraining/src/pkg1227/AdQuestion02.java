package pkg1227;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdQuestion02 {
	public static void main(String[] args) {

		Map<Integer,String> years = new HashMap<>();
		years.put(1861, "文久");
		years.put(1864, "元治");
		years.put(1865, "慶応");
		years.put(1868, "明治");
		years.put(1912, "大正");
		years.put(1926, "昭和");
		years.put(1989, "平成");
		years.put(2019, "令和");

		Scanner sc = new Scanner(System.in);
		System.out.print("西暦を入力:");
		int year = sc.nextInt();

//		for(int i=year;) {

//		}
	}
}
