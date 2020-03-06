package pkg1126;

public class Training1_002 {
	public static void main(String[] args) {
		
		Animal dog = new Animal();
		dog.name = "ポチ";
		dog.kind = "犬";
		dog.age = 2;
		
		Animal cat = new Animal();
		cat.name = "ミー";
		cat.kind = "猫";
		cat.age = 1;
		
		System.out.println(dog.name+" "+dog.kind+" "+dog.age+"才");
		System.out.println(cat.name+" "+cat.kind+" "+cat.age+"才");
	}
}

class Animal{
	String name;
	String kind;
	int age;
}
