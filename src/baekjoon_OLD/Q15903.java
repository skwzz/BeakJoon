package baekjoon_OLD;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q15903{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cardCnt = Integer.parseInt(st.nextToken());
		int loopCnt = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Long> pq = new PriorityQueue<Long>();
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<cardCnt; i++) {
			pq.add(Long.parseLong(st.nextToken()));
		}
		
		while(loopCnt > 0) {
			long temp = pq.poll();
			temp += pq.poll();
			
			pq.add(temp);
			pq.add(temp);
			loopCnt--;
		}
		long sum = 0;
		while(!pq.isEmpty()) {
			sum += pq.poll();
		}
		System.out.print(sum);
		
	}
}
