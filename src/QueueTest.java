import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i=0; i<10; i++) {
			q.add(i);
		}
		int m = q.poll();
		
		Iterator it = q.iterator();
		while(it.hasNext()) {
			int k = (int) it.next();
			System.out.println(k);
		}
		
		
		Iterator it2 = q.iterator();
		while(it2.hasNext()) {
			int k = (int) it2.next();
			System.out.println(k);
		}
		
	}
}
