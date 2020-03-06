package pkg200107;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample05 {
	public static void main(String[] args) {
		List<Integer> nList = new ArrayList<>();
		
		nList.add(1);
		nList.add(4);
		nList.add(3);
		nList.add(5);
		nList.add(2);
		System.out.println(nList+"←初期状態");
		
		Collections.sort(nList);
		System.out.println(nList+"←ソート後");
		
		Collections.swap(nList, 0, 3);
		System.out.println(nList+"←0番と3番チェンジ");
		
		Collections.rotate(nList, 2);
		System.out.println(nList+"←2つずらす");
		
		Collections.reverse(nList);
		System.out.println(nList+"←逆順");
		
		Collections.shuffle(nList);
		System.out.println(nList+"←シャッフル後");
		
		System.out.println("最大："+Collections.max(nList));
		System.out.println("最小："+Collections.min(nList));
	}
}
