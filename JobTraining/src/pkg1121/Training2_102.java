package pkg1121;

public class Training2_102 {
	public static void main(String[] args) {
		
		int[] numbers = new int[10];
		
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=(int)(Math.random()*100+1);
		}
		for(int num:numbers) {
			System.out.print(num+" ");
		}
	}
}
