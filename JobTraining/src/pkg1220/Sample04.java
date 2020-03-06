package pkg1220;

public class Sample04 {
	public static void main(String[] args) {
		TestThreadA thread = new TestThreadA();
		thread.start();
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i=1;i<=20;i++) {
			System.out.println("main "+i+" times");
		}
		
	}
}

class TestThreadA extends Thread{
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println("thread "+i+" times");
		}
	}
}