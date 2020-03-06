package pkg200117;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class AdQuestion01 {
	public static void main(String[] args) {

		List<StudentCard> student2019 = new ArrayList<StudentCard>();
		student2019.add(new StudentCard(1006, "ソラ", 7));
		student2019.add(new StudentCard(1010, "モモ", 6));
		student2019.add(new StudentCard(1005, "ココ", 5));
		student2019.add(new StudentCard(1003, "マル", 6));
		student2019.add(new StudentCard(1004, "ハル", 7));
		student2019.add(new StudentCard(1013, "ハル", 6));
		student2019.add(new StudentCard(1002, "リン", 6));
		student2019.add(new StudentCard(1008, "キナコ", 5));

		Scanner sc = new Scanner(System.in);

		for(;;) {
			System.out.println("コマンドを入力して下さい。");
			System.out.println("a：学生追加　d：学生削除　o：出力　e：終了");

			String command = sc.next();

			if(command.equals("a")) {
				System.out.println("学生情報を追加します。");

				System.out.print("学籍番号：");
				int idAdd = sc.nextInt();
				System.out.print("学生名：");
				String nameAdd = sc.next();
				System.out.print("年齢：");
				int ageAdd = sc.nextInt();

				student2019.add(new StudentCard(idAdd, nameAdd, ageAdd));
				System.out.println("学生情報を追加しました！");

			}
			else if(command.equals("d")) {
				System.out.println("学生情報を削除します。");
				System.out.print("対象の学籍番号：");
				int idDel = sc.nextInt();

				for(int i=0;i<student2019.size();i++) {
					if(idDel==student2019.get(i).id) {
						System.out.println(student2019.get(i).name+"の学生情報を削除します");
						System.out.print("よろしいですか？ y／n：");
						String delYN = sc.next();
						if(delYN.equals("y")) {
							student2019.remove(i);
							System.out.println("削除しました！");
						}else if(delYN.equals("n")){
						}else {
							System.out.println("コマンドが不正です。");
						}
					}
				}
			}
			else if(command.equals("o")) {
				Stream<StudentCard> stuOutput = student2019.stream();
				stuOutput.forEach(s -> s.output());
			}
			else if(command.equals("e")){
				System.out.println("プログラムを終了します。");
				break;
			}
			else {
				System.out.println("コマンドが不正です。");
			}
		}
	}
}

class StudentCard{
	int id;
	String name;
	int age;

	StudentCard(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	void output() {
		System.out.println("【"+id+" "+name+" "+age+"才】");
	}
}