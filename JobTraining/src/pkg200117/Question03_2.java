package pkg200117;

import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Question03_2 {
	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\1911sk08\\Desktop\\files\\names.txt");
		
		try {
			System.out.println("names.txtに追記中");
			BufferedWriter bw = Files.newBufferedWriter(path, StandardOpenOption.APPEND);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println("　　　４, 内村");
			pw.println("　　　５, 瀬戸");
			pw.close();
			
		}catch(Exception e) {
		}finally {
			System.out.println("追記完了しました。");
		}
	}
}
