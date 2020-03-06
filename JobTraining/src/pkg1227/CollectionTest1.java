package pkg1227;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ArrayClass{
	int arrayNo;

	public ArrayClass(int num) {
		this.arrayNo = num;
	}



	public void printArray() {
		System.out.println("ArrayListでArrayClassを作成しました："+this.arrayNo);
	}
}

public class CollectionTest1 {
	public static void main(String[] args) {
		String[] values = new String[3];
		values[0]="配列１";
		values[1]="配列２";
		values[2]="配列３";

		for(int i=0;i<values.length;i++) {
			System.out.println(values[i]);
		}

		System.out.println();

		List<String> list1 = new ArrayList<>();


		//Q1
		Collections.addAll(list1, "Array１","Array２","Array３");
		list1.remove("Array１");	//Q3回答

		for(String l:list1) {
			System.out.println(l);
		}

		System.out.println();


		//Q2
		List<Integer> list2 = new ArrayList<>();

		Collections.addAll(list2, 1,2,3,4,5);
		list2.remove(3);	//Q3回答：Object指示不可。indexで指示

		for(Integer i:list2) {
			System.out.println(i);
		}

		System.out.println();


		//Q4
		List<ArrayClass> listClass = new ArrayList<>();

		Collections.addAll(listClass, new ArrayClass(1),new ArrayClass(2));

		for(ArrayClass a:listClass) {
			a.printArray();
		}
	}
}
