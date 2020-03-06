package pkg200117;

import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Question02_2 {
	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\1911sk08\\Desktop\\files\\names.txt");
		
		try {
			System.out.println("ファイル出力します");
			BufferedWriter bw = Files.newBufferedWriter(path);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println("社員番号, 名前");
			pw.println("　　　１, 佐藤");
			pw.println("　　　２, 鈴木");
			pw.println("　　　３, 高橋");
			pw.close();
			
		}catch(Exception e) {
		}finally {
			System.out.println("ファイル出力しました");
		}
	}
}
