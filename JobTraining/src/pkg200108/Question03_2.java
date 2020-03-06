package pkg200108;

import java.util.Scanner;

public class Question03_2 {
	public static void main(String[] args) {
		EatSomething meal = new EatSomething() {

			@Override
			public void eat(String foods) {
				System.out.println(foods+"を食べます");
			}
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("何を食べます？：");
		String food = sc.next();
		
		meal.eat(food);
	}
}

interface EatSomething{
	void eat(String foods);
}