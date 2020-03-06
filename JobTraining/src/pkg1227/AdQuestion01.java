package pkg1227;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdQuestion01 {
	public static void main(String[] args) {
		
		Map<Character,String> numbers = new HashMap<>();
		numbers.put('0', "〇");
		numbers.put('1', "一");
		numbers.put('2', "二");
		numbers.put('3', "三");
		numbers.put('4', "四");
		numbers.put('5', "五");
		numbers.put('6', "六");
		numbers.put('7', "七");
		numbers.put('8', "八");
		numbers.put('9', "九");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("整数の値を入力して下さい：");
		String num = sc.nextLine();
		
		for(int i=0;i<num.length();i++) {			//1～"num.length"番目まで順に、下記を実施
			if(num.length()%3==i%3) {				//ⅰ．"num.length"/3の余り
				System.out.print(',');				//ⅱ．","を出力
			}
			char chara = num.charAt(i);			//①i番目の数字(String)を取り出す
			System.out.print(numbers.get(chara));	//②上記で取り出した数字をキーに、値の漢数字を出力
		}
	}
}

