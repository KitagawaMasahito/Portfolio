package pkg1227;
import java.util.HashMap;
import java.util.Map;

public class Question02 {
	public static void main(String[] args) {
		Map<Integer, String> money = new HashMap<>();
		
		money.put(10000, "福沢諭吉");
		money.put(5000, "樋口一葉");
		money.put(2000, "紫式部");
		money.put(1000, "夏目漱石");
		
		System.out.println(money.size());
		
		System.out.println(money.entrySet());
		
		money.put(1000, "野口英世");
		
		for(Map.Entry<Integer, String> mny:money.entrySet()) {
			System.out.println(mny.getKey()+"円札："+mny.getValue());
		}
		
		money.remove(2000);
		
		System.out.println(money.values());
	}
}
