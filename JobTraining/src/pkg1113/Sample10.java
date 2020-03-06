package pkg1113;

public class Sample10 {
	public static void main(String[] args) {
		int score = 75;
//		score = 98;
//		score = 88;
//		score = 54;
		
		if( score >= 90 ) {
			System.out.println("評価：優");
		}else if( score >=80 ) {
			System.out.println("評価：良");
		}else if( score >=60 ){
			System.out.println("評価：可");
		}
	}
}
