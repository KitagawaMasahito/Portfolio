package pkg1203;

public class Question01_2 {
	public static void main(String[] args) {
		Hito hito1 = new Hito();

		hito1.walk();
		hito1.eat();
		hito1.sleep();

		Cat2 cat1 = new Cat2();

		cat1.walk();
		cat1.eat();
		cat1.sleep();
	}
}

class Animal2{
	String name;
	int age;

	public void walk() {
		System.out.println("歩きます");
	}
	public void eat() {
		System.out.println("食べます");
	}
	public void sleep() {
		System.out.println("寝ます");
	}
}

class Hito extends Animal2{
	public void walk() {
		System.out.println("2本の足でスタスタ歩きます");
	}
	public void eat() {
		System.out.println("箸やフォークで食べます");
	}
	public void sleep() {
		System.out.println("ベッドの上で眠ります");
	}
}

class Cat2 extends Animal2{
	public void walk() {
		System.out.println("4本の足でスイスイ歩きます");
	}
	public void eat() {
		System.out.println("ムシャムシャ食べます");
	}
	public void sleep() {
		System.out.println("丸くなって眠ります");
	}
}