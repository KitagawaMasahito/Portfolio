package pkg1126;
import java.util.Scanner;

public class Training1_103 {
	public static void main(String[] args) {
		
		Stationery[] stationery = new Stationery[3];
		int allPrice = 0;
		
		Scanner scn = new Scanner(System.in);
		
		for(int i=0;i<stationery.length;i++){
			stationery[i] = new Stationery();
			System.out.print((i+1)+"番目の文房具の名前：");
			stationery[i].name = scn.next();
			System.out.print((i+1)+"番目の文房具の価格：");
			stationery[i].price = scn.nextInt();
			allPrice += stationery[i].price;
		}
		
		for(int j=0;j<stationery.length;j++) {
			System.out.println(stationery[j].name+ " "+stationery[j].price);
		}
		System.out.println("-------------------------------------");
		System.out.println("合計金額　　"+allPrice);
	}
}

class Stationery{
	String name;
	int price;
}