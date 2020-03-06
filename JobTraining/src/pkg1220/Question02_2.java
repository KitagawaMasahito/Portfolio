package pkg1220;

public class Question02_2 {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			
			try {
				Thread.sleep((int)(Math.random()*6)*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("*");
		}
	}
}
