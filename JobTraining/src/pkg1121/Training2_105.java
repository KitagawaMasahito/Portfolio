package pkg1121;

public class Training2_105 {
	public static void main(String[] args) {
		int[] multipleOfFive = new int[5];
		for(int i=0;i<multipleOfFive.length;i++) {
			multipleOfFive[i]=(int)(Math.random()*10+1)*3;
		}
		for(int num :multipleOfFive) {
			System.out.print(num+" ");
		}
		
		System.out.println("\n-----");
		
		for(int num2:multipleOfFive) {
			if(num2%6!=0) {
				System.out.print("");
			}else{
				System.out.println(num2);
			}
		}
	}
}
