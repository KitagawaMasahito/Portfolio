package pkg1220;

public class Question01_2 {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("*");
		}
	}
}

