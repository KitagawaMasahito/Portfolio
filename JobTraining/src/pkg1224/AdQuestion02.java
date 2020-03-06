package pkg1224;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdQuestion02 {
	public static void main(String[] args) {
		List<String> strs = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("文字を入力：");
			String st = sc.nextLine();
			
			if("".equals(st)) {
				break;
			}else {
				strs.add(st);
			}
		}
		System.out.println(strs);
		
		int maxLength=0;
		int maxLengthStr=0;
		for(int i=0;i<strs.size();i++) {
			if(strs.get(i).length()>maxLength){
				maxLength=strs.get(i).length();
				maxLengthStr=i;
			}
		}
		System.out.println("最長文字列："+strs.get(maxLengthStr));
		
		for(int i=0;i<strs.size();i++) {
			if(strs.get(i).length()>=5){
				System.out.println(strs.get(i));
			}
		}
	}
}

