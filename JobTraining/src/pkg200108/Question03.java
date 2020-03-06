package pkg200108;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question03 {
	public static void main(String[] args) {
		List<Human> human = new ArrayList<Human>();
		human.add(new Human("クゥ", 25.1, 5, 10));
		human.add(new Human("マル", 19.6, 2, 1));
		human.add(new Human("トラ", 20.2, 6, 5));
		human.add(new Human("ハナ", 20.1, 4, 9));
		human.add(new Human("ウニ", 19.9, 4, 7));
		
		outputPerson(human);
		
		Collections.sort(human);
		System.out.println("---------ソート後---------");
		outputPerson(human);
	}
	
	public static void outputPerson(List<Human> human) {
		for(Human p:human) {
			System.out.println("["+p.name+",身長:"+p.height+",体重:"+p.weight+","+p.age+"才]");
		}
	}
}

class Human implements Comparable<Human>{
	String name;
	double height;
	int weight;
	int age;
	
	Human(String name, double height, int weight, int age) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}

	@Override
	public int compareTo(Human other) {
		int diff;
		double diffD = this.height-other.height;
		if(diffD<1 && diffD>0) {
			diff=1;
		}else if(diffD<0 && diffD>-1) {
			diff=-1;
		}else {
			diff=(int)(diffD);
		}
		return diff;
//		return this.weight-other.weight;
//		return this.age-other.age;
	}
}