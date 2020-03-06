package pkg1227;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MorningTest {
	public static void main(String[] args) {

		//①
		List<String> eto = new ArrayList<String>();

		//②
		Collections.addAll(eto, "★★★","ねずみ","うし","うさぎ","へび","ひつじ");

		//③
		System.out.println(eto);

		//④
		eto.add(3, "とら");

		//⑤
		eto.add(5, "たつ");

		//⑥
		eto.add(7, "うま");

		//⑦
		System.out.println(eto);

		//⑧
		eto.remove("★★★");

		//⑨
		eto.remove("ひつじ");

		//⑩
		System.out.println(eto);
	}
}
