package success;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10451_ver2 {
	static int[] arr;
	static int[] visited;
	static int cnt;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int testCase = Integer.parseInt(br.readLine());
		for(int j=0; j<testCase; j++) {
			cnt = 0;
			int nodeNum = Integer.parseInt(br.readLine());
			arr = new int[nodeNum+1];
			visited = new int[nodeNum+1];
			
			st = new StringTokenizer(br.readLine());
			for(int i=1; i<arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			for(int i=1; i<arr.length; i++) {
				if(visited[i]==0) {
					cnt++;
					dfs(arr, i);
				}
			}
			
			System.out.println(cnt);
		}
	}
	
	
	public static void dfs(int[] arr, int num) {
		int next = arr[num];
		if(visited[next]==1) {
			return;
		}
		visited[next]++;
		dfs(arr, next);
	}
	
	
	public static void init() {
		for(int i=0; i<visited.length; i++) {
			if(visited[i]!=1) {
				visited[i]=0;
			}
		}
	}
}
