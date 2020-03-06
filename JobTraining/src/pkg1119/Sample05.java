package pkg1119;

public class Sample05 {
	public static void main(String[] args) {
		for(int i = 0;i < 3;i++) {
			for(int j = 0;j < 4;j++) {
				if(j == 2) {
					break;
				}
				System.out.println("i:"+i+" j:"+j);
			}
		}
	}
}
