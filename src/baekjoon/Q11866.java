package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q11866 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=1; i<=n; i++) {
			q.add(i);
		}
		
		int loop =1;
		System.out.print("<");
		while(!q.isEmpty()){
			
			if(loop%k==0){
				System.out.print(q.poll());
				if(!q.isEmpty()) {
					System.out.print(", ");
				}
			}
			if(loop%k!=0){
				q.offer(q.poll());
			}
			loop++;
		}
		System.out.print(">");
	}
}
