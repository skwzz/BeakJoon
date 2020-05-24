package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1697 {
	static int[] move = new int[3]; // seq: -1, +1, *2 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[100002];
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		Queue<Integer> queue = new LinkedList<Integer>();
		
		arr[start] = 1;
		queue.add(start);
		boolean brk = false;
		while(!queue.isEmpty()) {
			int current = queue.poll();
			int next = 0;
			move[0] = current - 1;
			move[1] = current + 1;
			move[2] = current * 2;
			
			for(int i=0; i<3; i++) {
				next = move[i];
				if(move[i]<0 || move[i]>100000) {
					continue;
				}
				if(arr[next]>0) {
					continue;
				}else {
					arr[next] = arr[current]+1;
					if(next == end) {
						brk = true;
						break;
					}
					queue.add(next);
				}
			}
			
			if(brk) {
				break;
			}
 		}
		System.out.print(arr[end]-1);
	}
}
