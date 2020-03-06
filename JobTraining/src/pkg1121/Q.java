package pkg1121;

public class Q {
	public static void main(String[] args) {
		//Q1
/*		int i = 0;
		while(i<5) {
			System.out.println("whileでループ処理");
			i++;
		}*/
		
		//Q2
/*		int q2 = 1;
		while(++q2<5) {
			System.out.print(q2);
		}*/
		
		//Q3
		int[] numbers = {7,14,-4,9};
		//for(int i =0;i<4;i++) {	←読み取る配列数が固定になる
		for(int i =0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		//Q4
/*		while(true) {
			int n = (int)(Math.random()*11);
			System.out.println(n);
			if(n==5) {
				break;
			}
		}*/
		
		//Q6
/*		int[] numbers = new int[3];
		for( int i = 0; i <=3; i++){
		//↑"i<=3"が【ランタイムエラー】の元。配列intは[0]～[2]まで
			numbers[i]= i * 10;
		}
		for( int i = 0; i < numbers.length; i++){
			System.out.print( numbers[i] + " " );
		}*/
		
		//Q7
/*		double[] results = new double[3];
		int[] a1 = { 10, 20, 30 };
		double[] a2 = {1.2, 3.4, 5.6 };
		for(int q7 = 0; q7 < results.length; q7++ ){
			results[q7] = a1[q7] * a2[q7];
		}
		System.out.println(results[1]);*/
	}
}
