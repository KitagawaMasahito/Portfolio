package pkg200123;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MorningTest {
	public static void main(String[] args) {

		List<Weather> weatherData = new ArrayList<Weather>();

		List<Double> tmpAve = new ArrayList<Double>();
		List<Double> dayLengthAve = new ArrayList<Double>();
		List<Double> prcMonth = new ArrayList<Double>();

		Path path = Paths.get("\\\\a01\\1911sk\\@配布用\\hanashima\\20200123\\ebina2019WeatherData.csv");

		String fileName = path.getFileName().toString();

		//		String regex = "[1|2][0-9]+";
		String regex = "[1|2][0-9]{3}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(fileName);

		if (m.find()) {
			System.out.println("ファイル名から年号を取得しました。年号⇒" + m.group());
		} else {
			System.out.println("ファイル名の中に年号が見つかりませんでした。");
		}

		try {
			BufferedReader br = Files.newBufferedReader(path);
			String line = "";
			int l = 0;
			while ((line = br.readLine()) != null) {
				if (l > 0) {
					String[] wDay = line.split(",");
					weatherData.add(new Weather(wDay[0], wDay[1], wDay[2], wDay[3]));
				}
				l++;
			}
			br.close();
		} catch (Exception e) {
		}

		double prcYear = 0;

		for (int i = 1; i <= 12; i++) {
			double tmp = 0;
			double dLg = 0;
			double prc = 0;
			int days = 0;
			for (Weather w : weatherData) {
				if (w.date.getMonthValue() == i) {
					tmp += w.temp;
					dLg += w.dayLength;
					prc += w.precipitation;
					days++;
					prcYear += w.precipitation;
				}
			}
//			System.out.println(i+"月 "+(tmp/days)+"℃　"+(dLg/days)+"時間　"+(prc)+"mm");
			tmpAve.add(tmp/days);
			dayLengthAve.add(dLg/days);
			prcMonth.add(prc);
		}

		System.out.println("年間降水量：" + prcYear + "mm");
	}
}

class Weather {
	LocalDate date;
	double temp;
	double dayLength;
	double precipitation;

	Weather(String date, String temp, String dayLength, String precipitation) {
		super();
		this.date = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy/M/d"));
		this.temp = Double.parseDouble(temp);
		this.dayLength = Double.parseDouble(dayLength);
		this.precipitation = Double.parseDouble(precipitation);
	}
}

