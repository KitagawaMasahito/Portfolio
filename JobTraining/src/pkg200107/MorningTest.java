package pkg200107;
import java.util.HashMap;
import java.util.Map;

public class MorningTest {
	public static void main(String[] args) {
		Map<Integer,String> tvMap = new HashMap<>();

		tvMap.put(1, "NKH総合");
		tvMap.put(2, "NHKEテレ");
		tvMap.put(4, "日本テレビ");
		tvMap.put(8, "フジテレビ");

		System.out.println("====HashMapによる出力結果====");

		System.out.println("要素数："+tvMap.size());

		System.out.println("ペア出力："+tvMap.entrySet());

		System.out.println("キー出力："+tvMap.keySet());

		System.out.println("値出力："+tvMap.values());

		tvMap.put(5, "テレビ朝日");

		tvMap.remove(4);

		for(int i=1;i<=8;i++) {
//			String value = tvMap.get(i);
			if(!tvMap.containsKey(i)) {
				System.out.println(i+"チャンネルは受信できません。");
			}else {
				System.out.println(i+"チャンネルは、"+tvMap.get(i)+"です。");
			}
		}
	}
}

