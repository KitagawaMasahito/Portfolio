package pkg1227;
import java.util.HashMap;
import java.util.Map;

public class Sample01 {
	public static void main(String[] args) {
		Map<String,String> dic = new HashMap<>();

		dic.put("水", "water");
		dic.put("雲", "cloud");
		dic.put("木", "tree");
		dic.put("空", "sky");

		System.out.println(dic);

		System.out.println("マップサイズ："+dic.size());
		System.out.println("キー指定で値を取り出します："+dic.get("雲"));
		System.out.println("表示① セット表示："+dic.entrySet());
		System.out.println("表示② キー表示　："+dic.keySet());
		System.out.println("表示③ 値表示　　："+dic.values());

		dic.remove("木");

		for(Map.Entry<String, String> map:dic.entrySet()) {
			System.out.println("キー："+map.getKey()+" 値："+map.getValue());
		}

		for(String st:dic.values()) {
			System.out.println("値のみ："+st);
		}
	}
}
