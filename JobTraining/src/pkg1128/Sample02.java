package pkg1128;

public class Sample02 {
	public static void main(String[] args) {
		Party member1 = new Party();
		member1.name="タマ";
		Party member2 = new Party();
		member2.name="ポチ";
		
		member1.buyPersonal(1000);
		member1.buyPersonal(2000);
		member2.putPersonal(7000);
		
//		Party.buy(1000);
//		Party.buy(5000);
//		Party.put(3000);
	}
}
class Party{
	static int wallet=10000;
	String name;
	
	public void buyPersonal(int money) {
		System.out.print(name+"は");
		Party.buy(money);
	}
	
	public void putPersonal(int money) {
		System.out.print(name+"は");
		Party.put(money);
	}
	
	public static void buy(int money) {
		wallet-=money;
		System.out.println(money+"円の買い物をしました");
		System.out.println("財布の中身"+wallet);
	}
	public static void put(int money) {
		wallet+=money;
		System.out.println(money+"円をお財布に入れました");
		System.out.println("財布の中身"+wallet);
	}
}