package pkg1119;

public class Training3_102 {
	public static void main(String[] args) {
		String[] mark =  {"♥","♦","♠","♣"};
		String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		int x = (int)(Math.random()*mark.length);
		int y = (int)(Math.random()*numbers.length);
		
//		System.out.println(numbers[y]);
		System.out.println(mark[x]+numbers[y]);
	}
}
