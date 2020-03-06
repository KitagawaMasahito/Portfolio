package pkg1113;

public class Sample22 {
	public static void main(String[] args) {
		String season = "春";
		season = "夏";
		season = "秋";
		season = "冬";
		
		switch(season) {
			case "春":
				System.out.println("ぽかぽか暖かい季節です");
				break;
			case "夏":
				System.out.println("太陽がまぶしい季節です");
				break;
			case "秋":
				System.out.println("涼しく過ごしやすい季節です");
				break;
			case "冬":
				System.out.println("寒くて乾燥した季節です");
		}
	}
}
