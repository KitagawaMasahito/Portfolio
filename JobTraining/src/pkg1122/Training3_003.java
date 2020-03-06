package pkg1122;

public class Training3_003 {
	public static void main(String[] args) {
		String tenki = getRandomWeather();
		System.out.println("明日の天気は"+tenki+"です");
	}
	
	public static String getRandomWeather() {
		String[] weather = {"晴れ","くもり","雨","雪"};
		int i = (int)(Math.random()*weather.length);
		return weather[i];
	}
}
