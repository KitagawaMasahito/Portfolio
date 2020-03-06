package pkg200108;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question02 {
	public static void main(String[] args) {
		List<Umbrella> umbrella = new ArrayList<Umbrella>();
		umbrella.add(new Umbrella(65, "青", 1500));
		umbrella.add(new Umbrella(60, "透明", 500));
		umbrella.add(new Umbrella(70, "赤", 1000));
		umbrella.add(new Umbrella(65, "透明", 300));
		umbrella.add(new Umbrella(60, "黒", 1800));
		
		outputInfo(umbrella);
		
		Collections.sort(umbrella);
		
		System.out.println("---------ソート後---------");
		outputInfo(umbrella);
	}
	
	public static void outputInfo(List<Umbrella> umbrella) {
		for(Umbrella u:umbrella) {
			System.out.println("[サイズ:"+u.size+",色:"+u.color+",価格:"+u.price+"円]");
		}
	}
}

class Umbrella implements Comparable<Umbrella>{
	int size;
	String color;
	int price;
	
	Umbrella(int size, String color, int price) {
		this.size = size;
		this.color = color;
		this.price = price;
	}

	@Override
	public int compareTo(Umbrella others) {
//		return this.size-others.size;
//		return this.color.compareTo(others.color);
		return this.price-others.price;
	}
}