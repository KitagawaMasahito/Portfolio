package pkg1227;
import java.util.Set;
import java.util.TreeSet;

public class Question03_2 {
	public static void main(String[] args) {
		Set<String> items = new TreeSet<>();
		
		items.add("コーヒー");
		items.add("緑茶");
		items.add("つぶつぶオレンジ");
		items.add("おしるこ");
		items.add("コーヒー");
		
		System.out.println("要素数："+items.size());
		for(String s:items) {
			System.out.print(s+" ");
		}
		System.out.println("");
		
		items.remove("おしるこ");
		
		System.out.println("コーヒーを含むか："+items.contains("コーヒー"));
		System.out.println("おしるこを含むか："+items.contains("おしるこ"));
		
		System.out.println("要素数："+items.size());
		for(String s:items) {
			System.out.print(s+" ");
		}
		System.out.println("");
		
		System.out.println("空かどうか："+items.isEmpty());
		
		items.clear();
		
		System.out.println("空かどうか："+items.isEmpty());
	}
}
