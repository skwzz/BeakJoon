package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q1753 {
	static int[] dist; // ê±°ë¦¬ ???¥?š©. ë°‘ì— -1ë¡? ì´ˆê¸°?™”?•´?„œ -1?? ë°©ë¬¸?•˜ì§? ?•Š??ê±¸ë¡œ ?‘œ?‹œ?•¨
	static ArrayList<NextNode>[] arr; // në²? ? •? ê³? ?—°ê²°ëœ ? •? ?“¤?„ arr[n]?œ¼ë¡? ?‚¬?š©?•¨
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
		// ?…? ¥ê³? ì´ˆê¸°?™” ?
		
		// ?š°?„ ?ˆœ?œ„ ?ë¥? ?‚¬?š©?•  ?•Œ ê°?ì¤‘ì¹˜?— ?”°?¼ ?„£?–´ì£¼ì–´?•¼ ?†?„ë¥? ë³´ì¥?•¨
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
				
				if(dist[nextNode] == -1) { // ì²˜ìŒ ë°©ë¬¸
					dist[nextNode] = nextDist;
					pq.add(new NextNode(nextNode, nextDist));
				}
				if(dist[nextNode] > nextDist) { // ?‹¤?‹œ ë°©ë¬¸?–ˆ?„ ê²½ìš° ?›?˜ ?ˆ?˜ ê°’ê³¼ ?˜„?¬ ê°±ì‹ ?• ? ¤?Š” ê°’ì„ ë¹„êµ ?›„ ê°±ì‹ ê°’ì´ ?‘?„ê²½ìš° ?„£?–´ì¤?
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