package pkg200117;

import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question04_2 {
	public static void main(String[] args) {
		List<String> kikkyo = new ArrayList<String>();
		Collections.addAll(kikkyo, "大吉","吉","中吉","小吉","末吉","凶");
		int omikuji = (int)(Math.random()*6);
		
		LocalDate now = LocalDate.now();
		
//		System.out.println(now.getMonthValue()+"月"+now.getDayOfMonth()+"日の運勢は"+kikkyo.get(omikuji)+"です");
		
		try {
			System.out.println("おみくじを引きます");
			Path path = Paths.get("C:\\Users\\1911sk08\\Desktop\\files\\omikuji.txt");
			BufferedWriter bw = Files.newBufferedWriter(path);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println(now.getMonthValue()+"月"+now.getDayOfMonth()+"日の運勢は"+kikkyo.get(omikuji)+"です");
			pw.close();
			
		}catch(Exception e) {
		}finally {
			System.out.println("おみくじが引けました");
		}
	}
}
