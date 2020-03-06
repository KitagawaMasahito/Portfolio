package pkg1119;

public class Training2_002 {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 10){
			if(i == 6) {
				i++;
				continue;
			}else {
				System.out.print(i+" ");
				i++;
			}
		}
	}
}
