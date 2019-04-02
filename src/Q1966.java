import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1966 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Q1966 oc = new Q1966();
		int testCnt = Integer.parseInt(br.readLine());
		
		for(int i=0; i<testCnt; i++) {
			
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			Queue<Node> queue = new LinkedList<Node>();
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				queue.add(new Node(j, Integer.parseInt(st.nextToken())));
			}
			
			System.out.println(oc.getAnswer(queue, m));
			
		}
	}
	
	public int getAnswer(Queue queue, int targetIdx) {
		int answer = 1;
		Iterator it;
		
		while(!queue.isEmpty()) {
			// 1. 큐에 한개만 남아있을 경우
			if(queue.size()==1) {
				break;
			}
			// 2. 큐에 여러개가 남아잇을 경우
			boolean check = true;
			Node current = (Node)queue.poll();
			it = queue.iterator();
			
			while(it.hasNext()) {
				Node next = (Node)it.next();
				if(current.priority < next.priority) { // 우선순위 밀릴경우 그냥 뒤로 보내고 반복문 끝
					queue.add(current);
					check = false;
					break;
				}
			}
			
			if(check) { //우선순위 제일 높음
				if(current.idx == targetIdx) {
					break;
				}else {
					answer++;
				}
			}else {
				queue.add(current);	
			}
			
		}
		
		return answer;
	}
	
	private static class Node{
		int idx;
		int priority;
		
		public Node(int idx, int priority) {
			this.idx = idx;
			this.priority = priority;
		}
	}
}
