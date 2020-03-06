package pkg1220;

public class Question04_2 {
	public static void main(String[] args) {
		MultipleOfFive2 m5 = new MultipleOfFive2();
		Thread mo5 = new Thread(m5);
		
		mo5.run();
		
		try {
			mo5.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		for(int i=1;i<=10;i++) {
			
			try {
				Thread.sleep(2000+(long)(Math.random()*3)*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i*3);
		}
		
	}
}

class MultipleOfFive2 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {

			try {
				Thread.sleep(2000+(long)(Math.random()*3)*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i*5);
		}
	}
}