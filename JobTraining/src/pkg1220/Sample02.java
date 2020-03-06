package pkg1220;

public class Sample02 {
	public static void main(String[] args) {
		Pattern2Class t2 = new Pattern2Class();
		
		Thread thread2 = new Thread(t2);
		thread2.start();
		
		for(int i=0;i<1000;i++) {
			System.out.println("メインスレッド2");
		}
	}
}

class Pattern2Class implements Runnable{
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.println("Pattern 2");
		}
	}
}