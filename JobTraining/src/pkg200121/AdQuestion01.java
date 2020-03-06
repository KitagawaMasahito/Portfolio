package pkg200121;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class AdQuestion01 {
	public static void main(String[] args) {
		List<String> bufferData = new ArrayList<String>();
		
		Path pathIn = Paths.get("\\\\a01\\1911sk\\@配布用\\hanashima\\20200121\\input1.txt");
		Path pathOut = Paths.get("C:\\Users\\1911sk08\\Desktop\\files\\output1.txt");
		
		//データ読み込み
		try {
			System.out.println("データを読み込みます・・・");
			BufferedReader br = Files.newBufferedReader(pathIn);
			String line = "";
			
			while((line = br.readLine())!=null) {
				bufferData.add(line);
			}
			br.close();
			System.out.println("読み込み完了しました");
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		//データ書き込み
		try {
			System.out.println("データを書き込みます・・・");
			BufferedWriter bw = Files.newBufferedWriter(pathOut, StandardOpenOption.CREATE);
			PrintWriter pw = new PrintWriter(bw);
			for(String str:bufferData) {
				pw.println(str);
			}
			pw.close();
			System.out.println("書き込み完了しました");
		}catch(Exception e) {
			
		}
	}
}
