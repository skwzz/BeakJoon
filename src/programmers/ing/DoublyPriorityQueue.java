package programmers.ing;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class DoublyPriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq1 = new PriorityQueue<>();
		PriorityQueue<Integer> pq2 = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1>o2) {
					return -1;
				}else if(o1<o2) {
					return 1;
				}else {
					return 0;
				}
			}
		});
		
//		String[] arr = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
		String[] arr = {"I 0", "D 1"};
		for(int i=0; i<arr.length; i++) {
			StringTokenizer st = new StringTokenizer(arr[i]);
			String oper = st.nextToken();
			int val = Integer.parseInt(st.nextToken());
			if(oper.equals("I")) {
				pq1.add(val);
				pq2.add(val);
			}else {
				if(val<0) {
					if(!pq1.isEmpty()) {
						pq1.poll();
					}
				}else {
					if(!pq2.isEmpty()) {
						pq2.poll();
					}
				}
			}
		}
		int[] answer = new int[2];
		if(pq1.size()==0 || pq2.size()==0) {
		}else if(pq1.size()==1 && pq2.size()==1){
		}else {
			answer[0] = pq2.peek();
			answer[1] = pq1.peek();
		}
		System.out.println(pq1.size()+" "+pq2.size());
		System.out.print(answer[0]+" "+answer[1]);
	}
}
