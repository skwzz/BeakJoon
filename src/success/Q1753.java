package success;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q1753 {
	static int[] dist; // 거리 저장용. 밑에 -1로 초기화해서 -1은 방문하지 않은걸로 표시함
	static ArrayList<NextNode>[] arr; // n번 정점과 연결된 정점들을 arr[n]으로 사용함
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int nodeCnt = Integer.parseInt(st.nextToken());
		int edgeCnt = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(br.readLine());
		
		arr = new ArrayList[nodeCnt+1];
		dist = new int[nodeCnt+1];
		for(int i=0; i<arr.length; i++) {
			arr[i] = new ArrayList<NextNode>();
		}
		for(int i=0; i<dist.length; i++) {
			dist[i] = -1;
		}
		for(int i=0; i<edgeCnt; i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			int distP = Integer.parseInt(st.nextToken());

			arr[num1].add(new NextNode(num2, distP));
		}
		// 입력과 초기화 끝
		
		// 우선순위 큐를 사용할 때 가중치에 따라 넣어주어야 속도를 보장함
		Comparator<NextNode> valueComparator = new Comparator<NextNode>() {
            @Override
            public int compare(NextNode n1, NextNode n2) {
                return n1.value - n2.value;
            }
        };
		PriorityQueue<NextNode> pq = new PriorityQueue<>(valueComparator);
		dist[start] = 0 ;
		pq.add(new NextNode(start, 0));
		
		while(!pq.isEmpty()) {
			NextNode current = pq.poll();
			for(int i=0; i<arr[current.dest].size(); i++) {
				NextNode next = arr[current.dest].get(i);
				int nextNode = next.dest;
				int nextDist = next.value + dist[current.dest];
				
				if(dist[nextNode] == -1) { // 처음 방문
					dist[nextNode] = nextDist;
					pq.add(new NextNode(nextNode, nextDist));
				}
				if(dist[nextNode] > nextDist) { // 다시 방문했을 경우 원래 있던 값과 현재 갱신할려는 값을 비교 후 갱신값이 작을경우 넣어줌
					dist[nextNode] = nextDist;
					pq.add(new NextNode(nextNode, nextDist));
				}
				
			}
		}
		
		printAnswer();
	}
	
	public static void printAnswer() {
		for(int i=1; i<dist.length; i++) {
			if(dist[i]==-1) {
				System.out.println("INF");
			}else {
				System.out.println(dist[i]);
			}
		}
	}
}

class NextNode{
	int dest;
	int value;
	
	public NextNode(int dest, int value) {
		this.dest = dest;
		this.value = value;
	}
}