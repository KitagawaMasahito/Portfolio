package pkg200107;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sample01 {
	public static void main(String[] args) {
		Set<String> pans = new HashSet();
		
		pans.add("食パン");
		pans.add("あんぱん");
		pans.add("カレーパン");
		pans.add("メロンパン");
		pans.add("食パン");
		
		Iterator<String> ite = pans.iterator();
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
}
