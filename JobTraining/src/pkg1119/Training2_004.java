package pkg1119;

public class Training2_004 {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 10) {
			i++;
			if((i-1)%4 == 0) {
				continue;
			}
			System.out.print((i-1)+" ");
		}
	}
}
