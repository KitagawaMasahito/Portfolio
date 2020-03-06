package pkg1227;
import java.util.HashMap;
import java.util.Map;

public class Question01 {
	public static void main(String[] args) {
		Map<String,String> colors = new HashMap<>();
		
		colors.put("青", "blue");
		colors.put("赤", "red");
		colors.put("緑", "green");
		colors.put("白" , "white");
		
		System.out.println(colors.entrySet());
		System.out.println(colors.keySet());
		System.out.println(colors.values());
		
		colors.remove("青");
		
		colors.put("黄", "yellow");
		
		System.out.println(colors.get("白"));
		
		for(Map.Entry<String, String> clr:colors.entrySet()) {
			System.out.println(clr.getKey());
		}
		
		System.out.println(colors.entrySet());
	}
}
