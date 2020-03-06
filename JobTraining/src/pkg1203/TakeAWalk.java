package pkg1203;
import java.util.Scanner;

public class TakeAWalk {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		System.out.print("どの動物にしますか？(1:鳥 2:犬)：");
		int animalSelect = sc.nextInt();
		int doingSelect = 0;
		int eneMaxDefault = 25;

		if(animalSelect==1) {
			VirtualBird pet1=new VirtualBird();
			pet1.name=naming();
			pet1.maxEnergy=eneMaxDefault;
			pet1.energy=pet1.maxEnergy;
			while(true) {
			doingSelect = doing();
				if(doingSelect==1) {
					pet1.sleeping();
					pet1.printInfo();
				}else if(doingSelect==2) {
					pet1.fly();
					pet1.printInfo();
				}else if(doingSelect==3) {
					pet1.eat();
					pet1.printInfo();
				}else if(doingSelect==4) {
					pet1.printInfo();
					System.out.println("行動を終了します");
					break;
				}else {
					System.out.println("入力が不正です");
				}
			}
		}else if(animalSelect==2) {
			VirtualDog pet1=new VirtualDog();
			pet1.name=naming();
			pet1.maxEnergy=eneMaxDefault;
			pet1.energy=pet1.maxEnergy;
			while(true) {
			doingSelect = doing();
				if(doingSelect==1) {
					pet1.sleeping();
					pet1.printInfo();
				}else if(doingSelect==2) {
					pet1.walk();
					pet1.printInfo();
				}else if(doingSelect==3) {
					pet1.eat();
					pet1.printInfo();
				}else if(doingSelect==4) {
					pet1.printInfo();
					System.out.println("行動を終了します");
					break;
				}else {
					System.out.println("入力が不正です");
				}
			}		}else {
			System.out.println("入力が不正です");
			return;
		}
	}

	public static String naming() {
		Scanner sc =new Scanner(System.in);
		System.out.print("名前をつけてください：");
		String name=sc.next();
		return name;
	}

	public static int doing() {
		Scanner sc =new Scanner(System.in);
		System.out.print("行動選択\n1:寝る 2:移動する 3:食べる 4:散歩を終わる：");
		int n = sc.nextInt();
		return n;
	}
}

class VirtualBird extends VirtualPet{
	public void fly() {
		if(energy>=16) {
			System.out.println(name+"は飛んだ！");
			energy-=15;
		}else {
			System.out.println(name+"は動けない！");
		}
	}
}

class VirtualDog extends VirtualPet{
	public void walk() {
		if(energy>=11) {
			System.out.println(name+"は歩いた！");
			energy-=10;
		}else{
			System.out.println(name+"は動けない！");
		}
	}
}

class VirtualPet{
	String name;
	int maxEnergy;
	int energy;

	public void sleeping() {
		System.out.println(name+"は寝た。体力が全快した！");
		energy=maxEnergy;
	}
	
	public void eat() {
		System.out.println(name+"は餌を食べた。体力が5回復した！");
		energy+=5;
	}

	public void printInfo() {
		System.out.println("名前："+name+" 現在の体力："+energy+" 最大体力："+maxEnergy);
	}
}