package pkg1220;

public class Sample05 {
	public static void main(String[] args) {
		Bank mizuho = new Bank();
		Consumer[] consumers = new Consumer[2];
		consumers[0] = new Consumer("A",mizuho);
		consumers[1] = new Consumer("B",mizuho);
		
		consumers[0].start();
		consumers[1].start();
		
		for(Consumer mc:consumers) {
			try {
				mc.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("銀行の口座残高："+mizuho.savings);
	}
}

class Bank{
	int savings = 0;
	synchronized void addSavings(int money) {
		savings += money;
	}
}

class Consumer extends Thread{
	String name;
	Bank bank;
	int wallet = 100000;

	public Consumer(String name, Bank bank) {
		this.name = name;
		this.bank = bank;
	}

	@Override
	public void run() {
		System.out.println("最初：顧客"+this.name+"の財布"+wallet+"円");
		for(int i=0;i<100000;i++) {
			saveMoney(1,bank);
		}
		System.out.println("最後：顧客"+this.name+"の財布"+wallet+"円");
	}

	void saveMoney(int money,Bank bank) {
		wallet -= money;
		bank.addSavings(money);
	}
}