package baekjoon_OLD;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q11399 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<num; i++) {
			pq.add(Integer.parseInt(st.nextToken()));
		}
		int result = 0;
		int answer = 0;
		while(!pq.isEmpty()) {
			int cur = pq.poll();
			result = result+cur;
			answer += result;
		}
		System.out.print(answer);
	}
}
