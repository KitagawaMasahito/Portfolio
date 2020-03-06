package pkg1211;

public class Question02 {
	public static void main(String[] args) {
		
		Cat cat = new Cat("ジジ",70);
		cat.showStatus();
		cat.eat();
		cat.showStatus();
		cat.eat();
		cat.walk();
		cat.walk();
		cat.showStatus();
		cat.walk();
		cat.showStatus();
		cat.walk();
		cat.showStatus();
//		cat.walk();
	}
}

class Cat{
	private String name;
	private int satiety;
	
	Cat(String name, int satiety) {
		super();
		this.name = name;
		this.satiety = satiety;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int getSatiety() {
		return satiety;
	}

	private void setSatiety(int satiety) {
		if(satiety >=0 && satiety <= 100) {
			this.satiety = satiety;
		}else if(satiety >100) {
			this.satiety = 100;
		}else {
			this.satiety = 0;
		}
	}
	
	public void eat() {
		if(satiety == 100) {
			System.out.println(name+" お腹がいっぱいでご飯が食べられなかった。");
		}else {
			System.out.println(name+" は ごはんを食べた");
			satiety += 30;
			if(satiety > 100) {
				setSatiety(100);
			}
		}
	}
	
	public void walk() {
		if(satiety <= 30) {
			System.out.println(name+" は お腹がすいていて散歩できなかった。");
		}else {
			System.out.println(name+" は 散歩した");
			satiety -= 20;
		}
	}
	
	public void showStatus() {
		if(satiety >= 80) {
			System.out.println(name+" お腹がいっぱいで眠そうだ");
		}else if(satiety < 30) {
			System.out.println(name+" お腹がすいてエサがほしそうだ");
		}else {
			System.out.println(name+" すこしお腹がすいているかも");
		}
	}
}