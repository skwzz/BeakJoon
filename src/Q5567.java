import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q5567 {
	public static void main(String[] args) throws IOException{
		Q5567 t = new Q5567();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int friendNum = Integer.parseInt(br.readLine());
		int edge = Integer.parseInt(br.readLine());
		int a, b;
		Dot5567[] d = new Dot5567[friendNum+1];
		int[] checker = new int[friendNum+1];
		
		for(int i=0; i<d.length; i++) {
			d[i] = new Dot5567();
		}
		
		for(int i=0; i<edge; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			d[a].al.add(b);
		}
		int result = 0;
		t.BFS(1, d, checker);
		for(int i=0; i<checker.length; i++) {
			if(checker[i]==1) {
				result++;
			}
		}
		System.out.print(result-1);
	}
	
	public void BFS(int start, Dot5567[] d, int[] checker) {
		Queue<Integer> q = new LinkedList<Integer>();
		checker[start] = 1;
		q.add(start);
		
		int cur = 0;
		int next = 0;
		int loopCnt = 0;
		
		while(!q.isEmpty() && loopCnt<3) {
			cur = q.poll();
			
			for(int i=0; i<d[cur].al.size(); i++) {
				next = d[cur].al.get(i);
				if(checker[next]==0) {
					checker[next] = 1;
					q.add(next);
				}
			}
			loopCnt++;
		}
	}
}

class Dot5567{
	ArrayList<Integer> al;
	public Dot5567() {
		al = new ArrayList<Integer>();
	}
}
