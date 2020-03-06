package pkg200117;

import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Question01_2 {
	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\1911sk08\\Desktop\\files\\greet.txt");
		
		try {
			System.out.println("ファイル出力します");
			BufferedWriter bw = Files.newBufferedWriter(path);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println("こんばんは。");
			pw.println("お元気ですか？");
			pw.println("はい。元気です");
			pw.println("ではまた");
			pw.close();
		}catch(Exception e) {
		}finally {
			System.out.println("ファイル出力しました");
		}
	}
}
