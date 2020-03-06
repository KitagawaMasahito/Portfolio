package pkg200123;

public class Question01 {
	public static void main(String[] args) {
		Season sea = Season.SUMMER;
		System.out.println(sea.name());
		System.out.println(sea.ordinal());
		
		for(Season s:Season.values()) {
			System.out.println(s.getValue());
		}
	}
}

enum Season{
	SPRING("春"),SUMMER("夏"),AUTUMN("秋"),WINTER("冬");
	private final String jpSeason;

	private Season(String jpSeason) {
		this.jpSeason = jpSeason;
	}
	
	public String getValue() {
		return jpSeason;
	}
}