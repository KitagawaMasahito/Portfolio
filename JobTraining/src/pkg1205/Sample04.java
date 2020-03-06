package pkg1205;

public class Sample04 {
	public static void main(String[] args) {
		Human[] humans = new Human[4];
		humans[0] = new Buyer();
		humans[1] = new Driver();
		humans[2] = new Musician();
		humans[3] = new Human();
		
		for(Human h:humans) {
			h.work();
		}
	}
}

class Human{
	public void work() {
		System.out.println("働きます");
	}
}

class Buyer extends Human{
	public void work() {
		System.out.println("物を売り買いします");
	}
}

class Driver extends Human{
	public void work() {
		System.out.println("運転をします");
	}
}

class Musician extends Human{
	public void work() {
		System.out.println("音楽を奏でます");
	}
}