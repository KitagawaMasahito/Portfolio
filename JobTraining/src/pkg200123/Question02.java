package pkg200123;

public class Question02 {
	public static void main(String[] args) {
		Fruit fruits1 = Fruit.APPLE;
		System.out.println(fruits1.name());
		System.out.println(fruits1.getValue());
		System.out.println(fruits1.ordinal());
		
		for(Fruit f:Fruit.values()) {
			System.out.println(f.getValue());
		}
	}
}

enum Fruit{
	ORANGE("オレンジ"),BANANA("バナナ"),APPLE("りんご"),WATERMELON("メロン"),LEMON("レモン");
	
	private final String jpFruit;

	private Fruit(String jpFruit) {
		this.jpFruit = jpFruit;
	}
	
	public String getValue() {
		return jpFruit;
	}
}