package pkg1227;
import java.util.HashMap;
import java.util.Map;

class HashClass{
	int hashNo;

	public HashClass(int num) {
		this.hashNo = num;
	}
	
	public void printHash() {
		System.out.println("HashMapでHashClassを作成しました："+this.hashNo);
	}
}

public class CollectionTest2 {
	public static void main(String[] args) {
		Map<String,String> map1 = new HashMap<String,String>();
		map1.put("key1", "Map１");
		
		
		//Q5
		map1.put("key2", "Map２");
		map1.put("key3", "Map３");
		
		for(Map.Entry<String, String> mp5:map1.entrySet()) {
			System.out.println(mp5.getValue());
		}
		System.out.println();
		
		
		//Q6
		
	}
}
