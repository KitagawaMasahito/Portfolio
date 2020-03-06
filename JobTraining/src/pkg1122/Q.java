package pkg1122;

public class Q {
	public static void main(String[] args) {
		//Q2
		String[][] array ={{"A","B","C"},{"B","C","D","E"},{"C","D"}};
		System.out.println(array[1][2] + ":" + array[2].length);
		
		
		//Q3
		int[][] a = {{1,2},{3,4}};
		int sum = 0;
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length ; j++){
				sum += a[i][j];
			}
		}
		System.out.println(sum); 
		
		
		//Q4
		String[] trees = {"銀杏","カエデ","秋桜","リンドウ","金木犀","ススキ"};
		for(String str:trees) {
//			System.out.println(str);
			if(str.contains("桜")) {
				System.out.println(str);
			}
		}
	}
}
