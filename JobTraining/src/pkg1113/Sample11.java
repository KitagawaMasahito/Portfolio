package pkg1113;

public class Sample11 {
	public static void main(String[] args) {
		int math = 80;
		int english =75;
		
		if( math >=80 && english >= 80 ) {
			System.out.println("評価：S");
		}else if( math >=80 || english >= 80 ) {
			System.out.println("評価：A");
		}else {
			System.out.println("評価：B");
		}
	}
}
