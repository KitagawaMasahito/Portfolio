package pkg200117;

import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample02 {
	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\1911sk08\\Desktop\\files\\20200117.txt");
		
		try {
			BufferedWriter bw = Files.newBufferedWriter(path);
			PrintWriter pw = new PrintWriter(bw);
			pw.println("こんにちは！");
			pw.println("お元気ですか？");
			pw.println("私は元気です");
			pw.close();
		}catch(Exception e) {
		}finally {
			System.out.println("finallyブロック内です");
		}
	}
}
