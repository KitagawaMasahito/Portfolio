package pkg1224;

public class MorningTest {
	public static void main(String[] args) {
		
		CutFood cut = new CutFood();
		
		TakeStock takeSt = new TakeStock();
		Thread take = new Thread(takeSt);
		

		System.out.println("なべを作ります！");
		
		cut.start();
		take.start();
		
		try {
			cut.join();
			take.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		
		System.out.println("なべが完成しました！　いただきます！");
	}
}

class CutFood extends Thread{
	public void run() {
		System.out.println("食材を切ります！");
		
		for(int i=0;i<(5+(int)(Math.random()*6));i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("食材を切っています");
		}
		
		System.out.println("食材を切り終わりました！");
	}
}

class TakeStock implements Runnable{
	public void run() {
		System.out.println("出汁を取りはじめます");
		
		for(int i=0;i<(5+(int)(Math.random()*6));i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("出汁をとっています");
		}
		
		System.out.println("出汁をとり終わりました");
	}
}