package pkg1205;

public class Question02_2 {
	public static void main(String[] args) {
		Animal animal1 = new Rabbit("モカ");
		Animal animal2 = new Lion("チャチャマル");
		Animal animal3 = new Monkey("ちび");
		
		doEat(animal1);
		doEat(animal2);
		doEat(animal3);
	}
	
	public static void doEat(Object animal) {
		if(animal instanceof Rabbit){
			((Rabbit) animal).eat();
		}else if(animal instanceof Lion) {
			((Lion) animal).eat();
		}else if(animal instanceof Monkey) {
			((Monkey) animal).eat();
		}
	}
}

class Rabbit extends Animal{
	
	Rabbit(String name){
		super(name);
	}
	
	public void eat() {
		System.out.println(name+"はニンジンを食べました");
	}
}

class Lion extends Animal{
	
	Lion(String name){
		super(name);
	}
	
	public void eat() {
		System.out.println(name+"はお肉を食べました");
	}
}

class Monkey extends Animal{
	
	Monkey(String name){
		super(name);
	}
	
	public void eat() {
		System.out.println(name+"は雑食です。色々食べました");
	}
}

class Animal{
	
	String name;
	
	Animal(String name){
		this.name=name;
	}
	
	public void eat() {
		System.out.println("食べ物を食べます");
	}
}