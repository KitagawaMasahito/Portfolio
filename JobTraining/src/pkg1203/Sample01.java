package pkg1203;

public class Sample01 {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.name="ベル";
		cat1.voice="みゃー";
//		Cat cat1 = new Cat("ベル","みゃー");
		cat1.makeSound();
		cat1.scratch();
	}
}

class Cat extends Animal{
	public void scratch() {
		System.out.println(name+"は引っ掻く");
	}
}

class Animal{
	String name;
	String voice;
	
//	Animal(String name,String voice){
//		this.name=name;
//		this.voice=voice;
//	}
	
	public void makeSound() {
		System.out.println(voice+voice);
	}
}