package pkg200107;
import java.util.LinkedList;
import java.util.Queue;

public class Sample03 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		System.out.println("キューは空？⇒"+queue.isEmpty());
		
		queue.offer("A");
		System.out.println(queue);
		
		queue.offer("B");
		System.out.println(queue);
		
		queue.offer("C");
		System.out.println(queue);
		
		System.out.println("pollメソッド実行⇒"+queue.poll());
		System.out.println(queue);
		
		System.out.println("peekメソッド実行⇒"+queue.peek());
		System.out.println(queue);
		
		System.out.println("キューは空？⇒"+queue.isEmpty());
	}
}
