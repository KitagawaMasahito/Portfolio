package pkg1220;

public class Sample01 {
	public static void main(String[] args) {
		Pattern1Class thread = new Pattern1Class();
		thread.start();
		for(int i=0;i<1000;i++) {
			System.out.println("メインスレッド");
		}
	}
}

class Pattern1Class extends Thread{
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.println("Pattern 1");
		}
	}
}