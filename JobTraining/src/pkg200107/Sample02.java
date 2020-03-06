package pkg200107;
import java.util.LinkedList;

public class Sample02 {
	public static void main(String[] args) {
		LinkedList<String> stack = new LinkedList<>();
		
		System.out.println("stackの状態"+stack.isEmpty());
		System.out.println(stack);
		
		stack.push("No.1");
		stack.push("No.2");
		stack.push("No.3");
		System.out.println(stack);
		
		stack.pop();
		stack.pop();
		stack.push("No.4");
		
		System.out.println(stack);
		System.out.println("stackの状態"+stack.isEmpty());
	}
}
