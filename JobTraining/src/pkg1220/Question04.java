package pkg1220;

public class Question04 {
	public static void main(String[] args) {
		MultipleOfTwo m2 = new MultipleOfTwo();
		MultipleOfFive m5 = new MultipleOfFive();
		
		Thread mo2 = new Thread(m2);
		Thread mo5 = new Thread(m5);
		
		mo2.run();
		mo5.run();
		
		for(int i=1;i<=700;i++) {
			if(i%7==0) {
				System.out.println("\\\\"+i);
			}
		}
		
	}
}

class MultipleOfTwo implements Runnable{
	public void run() {
		for(int i=1;i<=200;i++) {
			if(i%2==0) {
				System.out.println(i);
			}	
		}
	}
}

class MultipleOfFive implements Runnable{
	public void run() {
		for(int i=1;i<=500;i++) {
			if(i%5==0) {
				System.out.println("\\"+i);
			}		
		}
	}
}