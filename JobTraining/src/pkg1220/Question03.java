package pkg1220;

public class Question03 {
	public static void main(String[] args) {
		TestThread t03 = new TestThread();
		Thread t3 = new Thread(t03);
		t3.run();

		for(int i=1;i<=400;i++) {
			if(i%4==0) {
				System.out.println("Main:"+i);
			}
		}
	}
}

class TestThread implements Runnable{
	public void run() {
		for(int i=1;i<=300;i++) {
			if(i%3==0) {
				System.out.println("Thread:"+i);
			}
		}
	}
}