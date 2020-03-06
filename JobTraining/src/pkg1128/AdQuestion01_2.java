package pkg1128;

public class AdQuestion01_2 {
	public static void main(String[] args) {
		Family fam1 = new Family();
		Family fam2 = new Family();
		
		fam1.name="太郎";
		fam1.relation="父";
		fam2.name="翔";
		fam2.relation="子";
		
		fam1.putMoney(200000);
		fam2.useMoney(12000);
		fam1.useMoney(25000);
		fam2.useMoney(5000);
	}
}
class Family{
	static int wallet = 10000;
	String name;
	String relation;
	
	public void useMoney(int money) {
		Family.reduceMoney(money);
		System.out.println(name+"は"+money+"円財布から使いました！");
		printAmount();
	}
	
	public void putMoney(int money) {
		Family.addMoney(money);
		System.out.println(name+"は"+money+"円財布に入れました！");
		printAmount();
	}
	
	public void printAmount() {
		System.out.println("財布の中身は"+getAmount()+"円です！");
	}
	
	public static int getAmount() {
		return wallet;
	}
	
	public static void addMoney(int money) {
		wallet+=money;
	}
	
	public static void reduceMoney(int money) {
		wallet-=money;
	}
}