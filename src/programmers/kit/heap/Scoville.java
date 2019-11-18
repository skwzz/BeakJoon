package programmers.kit.heap;

import java.util.PriorityQueue;

public class Scoville {
	public static void main(String[] args) {
		
		int[] foods = {1, 2, 3, 9, 10, 12};
		int k = 7;
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=0; i<foods.length; i++) {
			pq.add(foods[i]);
		}
		int answer = 0;
		while(pq.peek()<k) {
			if(pq.size()==1) {
				System.out.println("-1");
				break;
			}
			answer++;
			
			int tmp1 = pq.poll();
			int tmp2 = pq.poll();
			int pushV = tmp1+tmp2*2;
			pq.add(pushV);
		}
		System.out.println(answer);
	}
}
