package pkg1122;

public class Training3_002 {
	public static void main(String[] args) {
		int randomNum = getRandomNumber();
		System.out.println(randomNum);
	}
	
	public static int getRandomNumber() {
		int num = (int)(Math.random()*100+1);
		return num;
	}
}
