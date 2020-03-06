package pkg1211;

public class Question01_2 {
	public static void main(String[] args) {
		VirtualDog dog = new VirtualDog();
		dog.name="トト";
		dog.move();
	}
}

abstract class VirtualPet{
	String name;
	abstract void move();
}

class VirtualDog extends VirtualPet{
	void move() {
		System.out.println("元気に歩く！");
	}
}
