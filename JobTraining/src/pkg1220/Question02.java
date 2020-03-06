package pkg1220;

public class Question02 {
	public static void main(String[] args) {
		MyThread2 t02 = new MyThread2();

		Thread t2 = new Thread(t02);
		t2.start();

		for(int i=1;i<=100;i++) {
			System.out.println("Main("+i+")");
		}
	}
}

class MyThread2 implements Runnable{
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("Run("+i+")");
		}
	}
}