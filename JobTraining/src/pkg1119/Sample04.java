package pkg1119;

public class Sample04 {
	public static void main(String[] args) {
		for(int i = 0;i < 5;i++) {
			if(i == 3) {
				continue;
			}
			System.out.println("iの値："+i);
		}
	}
}
