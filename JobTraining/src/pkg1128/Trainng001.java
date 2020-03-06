package pkg1128;
import java.util.Scanner;

public class Trainng001 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Cat cat1 = new Cat();
		
		System.out.print("名前：");
		cat1.name=sc.next();
		
		cat1.year=2018;
		cat1.hp=14;
		
		while(true) {
			System.out.print("行動を選択\n(1.食べる 2.散歩する 3.終了する):");
			int selected=sc.nextInt();
			
			if(selected==1) {
				cat1.eat("ご飯");
				cat1.showProfile(2019);
			}else if(selected==2) {
				cat1.walk();
				cat1.showProfile(2019);
			}else if(selected==3) {
				System.out.println("終了します。");
				break;
			}else {
				System.out.println("入力が不正です。");
			}
		}
		
	}
}
class Cat{
	String name;
	int year; //生まれた年
	int hp;
	public void eat(String food) {
		System.out.println(name+"は"+food+"を食べた");
		hp+=10;
	}
	public void walk() {
		if(hp<5) {
			System.out.println(name+"はお腹が空いて動けない！");
		}else {
			System.out.println(name+"は散歩した");
			hp-=5;
		}
	}
	public int getAge(int year) {
		int age=year-this.year;
		return age;
	}
	public void showProfile(int year) {
		System.out.println(name+" "+this.getAge(year)+"才 HP:"+hp);
	}
}