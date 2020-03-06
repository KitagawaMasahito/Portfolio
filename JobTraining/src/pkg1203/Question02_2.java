package pkg1203;

public class Question02_2 {
	public static void main(String[] args) {
		Cat3 cat1 = new Cat3("モモ",100);
		Bird bird1 = new Bird("ささみ",80);
		
		cat1.attack();
		bird1.attack();
	}
}

class Character{
	String name;
	int hp;
	
	Character(String name,int hp){
		this.name=name;
		this.hp=hp;
	}
	
	void attack() {
		int damage = 5+(int)(Math.random()*11);
		System.out.println("敵に"+damage+"のダメージを与えた！");
	}
}

class Cat3 extends Character{
	Cat3(String name, int hp) {
		super(name, hp);
	}

	@Override
	void attack() {
		System.out.println(name+"は引っ掻いて攻撃！");
		super.attack();
	}
	
}

class Bird extends Character{

	Bird(String name, int hp) {
		super(name, hp);
	}

	@Override
	void attack() {
		System.out.println(name+"はつついて攻撃！");
		super.attack();
	}
	
}