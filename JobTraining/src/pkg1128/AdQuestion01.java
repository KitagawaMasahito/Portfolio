package pkg1128;
import java.util.Scanner;

public class AdQuestion01 {
	public static void main(String[] args) {
		
		BankAccount bank1 = new BankAccount();
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("ご利用者の名前を入力して下さい：");
//		bank1.name = sc.next();
		
		while(true) {
			System.out.print("何をしますか？\n1.預金 2.引き出し 3.残高照会 4.終了：");
			int select = sc.nextInt();
			if(select==1) {
				System.out.print("預金額を入力して下さい：");
				int money = sc.nextInt();
				bank1.depositMoney(money);
			}else if(select==2) {
				System.out.print("お引き出し額を入力して下さい：");
				int money =sc.nextInt();
				if(money>bank1.deposit) {
					System.out.println("残高不足です。");
				}else if (money>300000) {
					System.out.println("お引き出し上限額を超えています");
				}else {
					bank1.removeMoney(money);
				}
			}else if(select==3) {
				System.out.println("残高："+bank1.inquiry());
			}else if(select==4) {
				System.out.println("終了します");
				break;
			}else {
				System.out.println("入力が不正です");
			}
		}
	}
}
class BankAccount{
	String name;
	int deposit;
	
	public void depositMoney(int money) {
		deposit+=money;
	}
	public void removeMoney(int money) {
		deposit-=money;
	}
	public int inquiry() {
		return deposit;
	}
}