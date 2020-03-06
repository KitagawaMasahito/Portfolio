package pkg200107;
import java.util.LinkedList;
import java.util.Scanner;

public class Question01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LinkedList<Integer> pollA = new LinkedList<>();
		LinkedList<Integer> pollB = new LinkedList<>();
		LinkedList<Integer> pollC = new LinkedList<>();

		pollA.push(3);
		pollA.push(2);
		pollA.push(1);

		System.out.print("移動元の棒：");
		String pollFrom = sc.next();

		System.out.print("移動先の棒：");
		String pollTo = sc.next();

		if(pollFrom.equals("A")) {
			pollA.pop();
		}

		System.out.println(pollA);
		System.out.println(pollB);
		System.out.println(pollC);
		}
}

