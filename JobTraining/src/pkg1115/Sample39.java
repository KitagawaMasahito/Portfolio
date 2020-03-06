package pkg1115;

public class Sample39 {
	public static void main(String[] args) {
		for(int i=0;i<8;i=i+2) {
			System.out.print("〇");
			for(int j=1;j<i;j=j+2) {
				System.out.print("〇〇");
			}
			System.out.print("\n●●");
			for(int k=1;k<i;k=k+2) {
				System.out.print("●●");
			}
			System.out.println("");
		}
	}
}
