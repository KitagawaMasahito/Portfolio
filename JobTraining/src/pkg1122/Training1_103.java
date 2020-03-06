package pkg1122;

public class Training1_103 {

	public static void main(String[] args) {
		printFortune();
	}

	public static void printFortune() {



		int countRandom = (int)(Math.random()*5);
		System.out.print("今日の運勢は");

		switch(countRandom) {
		case 0:
			System.out.println("凶です");
			break;
		case 1:
			System.out.println("末吉です");
			break;
		case 2:
			System.out.println("中吉です！");
			break;
		case 3:
			System.out.println("吉です！");
			break;
		case 4:
			System.out.println("大吉です！");
			break;

		}
	}
}
