package pkg1126;
import java.util.Scanner;

public class Training1_104 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		Menu[] menu = new Menu[10];

		int menuNum = 0;
		
		while(true) {
			System.out.print("何を行いますか？(1.登録 2.出力 3.終了)：");
			int function = scn.nextInt();
			if(function==1) {
				System.out.println("メニューの登録を行います");
				menu[menuNum]=new Menu();
				System.out.print("料理名：");
				menu[menuNum].name=scn.next();
				System.out.print("価格：");
				menu[menuNum].price=scn.nextInt();
				menuNum++;
			}else if(function==2) {
				for(int i=0;i<menuNum;i++) {
					System.out.println(menu[i].name+" "+menu[i].price+"円");
				}
			}else if(function==3) {
				System.out.println("終了します");
				break;
			}else {
				System.out.println("もう一度入力して下さい");
			}

		}
	}
}

class Menu{
	String name;
	int price;
}