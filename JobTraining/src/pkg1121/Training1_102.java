package pkg1121;

public class Training1_102 {
	public static void main(String[] args) {
		String[][] fruit = {{"momo","nashi","suika"},{"grape","apple","malon"}};
		
		for(int i=0;i<fruit.length;i++) {
			for(int j=0;j<fruit[i].length;j++) {
				System.out.print(fruit[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
