package pkg1122;

public class Training1_101 {
	public static void main(String[] args) {
		printRandomMessage();
	}

	public static void printRandomMessage() {

		String[] message = {"おはよう","こんにちは","こんばんは"};

		int n = (int)(Math.random()*message.length);

		System.out.println(message[n]);

/*		int n = (int)(Math.random()*3);
		String message = "";

		switch(n) {
		case 0:
			message = "おはよう";
			break;
		case 1:
			message = "こんにちは";
			break;
		case 2:
			message = "こんばんは";
			break;
		}

		System.out.println(message);
		*/
	}
}
