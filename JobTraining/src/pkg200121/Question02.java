package pkg200121;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Question02 {
	public static void main(String[] args) {
		Path path = Paths.get("\\\\a01\\1911sk\\@配布用\\hanashima\\20200121\\input2.txt");
		
		try {
			BufferedReader br = Files.newBufferedReader(path);
			
			String line = "";
			
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
		}catch(Exception e){
			
		}
	}
}
