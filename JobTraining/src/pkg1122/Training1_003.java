package pkg1122;

public class Training1_003 {
	public static void main(String[] args) {
		printRandomNumber();
	}
	
	public static void printRandomNumber() {
		int randomNum = (int)(Math.random()*100+1);
		System.out.println(randomNum);
	}
}
