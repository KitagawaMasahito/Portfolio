package pkg200110;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MorningTest2 {
	public static void main(String[] args) {
		List<Food> foods = new ArrayList<Food>();
		
		foods.add(new Food("チャーハン　　　", 750, "ご飯・麺類"));
		foods.add(new Food("エビシュウマイ　",  40, "点心　　　"));
		foods.add(new Food("スブタ　　　　　", 450, "肉・魚料理"));
		foods.add(new Food("レバニラ炒め　　", 300, "肉・魚料理"));
		foods.add(new Food("タンメン　　　　", 600, "ご飯・麺類"));
		foods.add(new Food("マーボードウフ　", 300, "一品料理　"));
		foods.add(new Food("ヤキギョウザ　　",  90, "点心　　　"));
		foods.add(new Food("チンジャオロース", 270, "肉・魚料理"));
		
//		for(int i=0;i<foods.size();i++) {
//			foods.get(i).showInfo();
//		}
		for(Food f:foods) {
			f.showInfo();
		}
		
		Collections.sort(foods);
		
		System.out.println("------------ソート後------------");
		
//		for(int i=0;i<foods.size();i++) {
//			foods.get(i).showInfo();
//		}
		for(Food f:foods) {
			f.showInfo();
		}
	}
}

class Food implements Comparable<Food>{
	String name;
	int calorie;
	String kind;
	
	Food(String name, int calorie, String kind) {
		this.name = name;
		this.calorie = calorie;
		this.kind = kind;
	}
	
	public void showInfo() {
		System.out.println(this.name+"　"+this.kind+"　"+this.calorie+"kcal");
	}

	@Override
	public int compareTo(Food otherFood) {
//		return this.calorie-otherFood.calorie;
//		return this.name.compareTo(otherFood.name);
		
		int result = this.kind.compareTo(otherFood.kind);
		if(result == 0) {
			return this.name.compareTo(otherFood.name);
		}else {
			return result;
		}
	}
}