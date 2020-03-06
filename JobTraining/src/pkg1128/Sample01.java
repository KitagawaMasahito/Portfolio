package pkg1128;

public class Sample01 {
	public static void main(String[] args) {
		Human hito1 = new Human();
		hito1.name = "三谷";
		hito1.age = 18;
		hito1.walk();
		hito1.eat("焼肉");
		hito1.plusOne();
		hito1.sleep(23);
		System.out.println(hito1.age);
	}
}
class Human{
	String name;
	int age;
	
	public void walk() {
		System.out.println(name+"は歩く。");
	}
	public void eat(String food) {
		System.out.println(name+"は"+food+"を食べた。");
	}
	public void plusOne() {
		age++;
	}
	public void sleep(int time) {
		System.out.println(name+"は"+time+"時に寝る");
	}
}