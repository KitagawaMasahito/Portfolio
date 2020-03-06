package pkg200108;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MorningTest {
	public static void main(String[] args) {
		String[] stations = {"TOKYO","SHINAGAWA","SHINYOKOHAMA","NAGOYA","KYOTO","SHINOSAKA"}; 
		
		List<String> stationsList = Arrays.asList(stations);
		System.out.println("～(3)："+stationsList);
		
		Collections.sort(stationsList);
		System.out.println("～(5)："+stationsList);
		
		Collections.reverse(stationsList);
		System.out.println("～(7)："+stationsList);
		
		Collections.shuffle(stationsList);
		System.out.println("～(9)："+stationsList);
		
		int keyTokyo = -1;
		int keyKyoto = -1;
		
		for(int i=0;i<stationsList.size();i++) {
			if(stationsList.get(i).equals("TOKYO")) {
				keyTokyo=i;
			}
			if(stationsList.get(i).equals("KYOTO")) {
				keyKyoto=i;
			}
		}
		
		if(keyTokyo>-1 && keyKyoto>-1) {
			Collections.swap(stationsList, keyTokyo, keyKyoto);
			System.out.println("～(10)："+stationsList);
		}
	}
}
