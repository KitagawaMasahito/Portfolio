package pkg200110;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class AdQuestion03 {
	public static void main(String[] args) {
		List<String> colorTable = new ArrayList<String>();
		Collections.addAll(colorTable, "黒","白","水色","赤","オレンジ","緑","青","黄緑","紫");

		Supplier<Integer> color = () -> {
			return (int)(Math.random()*9);
		};
		System.out.println("今日のラッキーカラーは"+colorTable.get(color.get())+"です!");
	}
}
