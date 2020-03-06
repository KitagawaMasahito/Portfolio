package pkg1220;

public class Question01 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println("Main("+i+")");
		}
	}
}

class MyThread extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Run("+i+")");
		}
	}
}