package programmers.success;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueue {
	public static void main(String[] args) throws IOException{
		int[] arr = new int[] {1, 1, 9, 1, 1, 1};
		int location = 0;
		
		PrinterQueue pq = new PrinterQueue();
		int result = pq.solution(arr, location);
		System.out.print("RESULT:"+result);
	}
	public int solution(int[] arr, int location) {
		int answer = 1;
		
		Queue<Node> queue = new LinkedList<Node>();
		for(int i=0; i<arr.length; i++) {
			queue.add(new Node(i, arr[i]));
		}
		
		while(!queue.isEmpty()) {
			Node current = queue.poll();
			
			Iterator it = queue.iterator();
			boolean check = true;
			
			while(it.hasNext()) {
				Node other = (Node)it.next();
				if(current.priority < other.priority) {
					check = false;
					break;
				}
			}
			
			if(check) { // 우선순위가 제일 높을 경우
				//찾고자 하는 경우
				if(current.idx == location) {
					return answer;
				}else { //찾는 노드가 아님
					answer++;
				}
			}else { //우선순위가 낮을경우 그냥 뒤로 붙임
				queue.add(current);
			}
		}
		
		return answer;
	}
	
	public class Node{
		int idx;
		int priority;
		
		public Node(int idx, int priority){
			this.idx = idx;
			this.priority = priority;
		}
	}
}



