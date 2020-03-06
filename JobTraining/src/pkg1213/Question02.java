package pkg1213;

public class Question02 {
	public static void main(String[] args) {
		Momonga momo = new Momonga();
		Swallow tsubame = new Swallow();
		
		momo.fly();
		tsubame.fly();
	}
}

interface Flyable{
	void fly();
}

class Momonga implements Flyable{
	public void fly() {
		System.out.println("滑空します！");
	}
}

class Swallow implements Flyable{
	public void fly() {
		System.out.println("羽で羽ばたきます！");
	}
}