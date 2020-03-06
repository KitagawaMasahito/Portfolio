package pkg1122;

public class Sample04 {
	public static void main(String[] args) {
		int returnNumber = makeNumber();
		System.out.println(returnNumber);
//		System.out.println(makeNumber());
	}
	
	public static int makeNumber() {
		int number = (int)(Math.random()*10+1);
		return number;
	}
}
