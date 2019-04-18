package success;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2668 {
	static int cnt = 0;
	static int[] visited;
	static int[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		arr = new int[num+1][2];
		visited = new int[num+1];
		for(int i=1; i<arr.length; i++) {
			arr[i][0] = i;
			arr[i][1] = Integer.parseInt(br.readLine());
		}
		
		for(int i=1; i<arr.length; i++) {
			if(visited[i]==2) {
				continue;
			}
			DFS(i);
			init();
		}
		
		System.out.println(cnt);
		for(int i=1; i<visited.length; i++) {
			if(visited[i]==2) {
				System.out.println(i);
			}
		}
	}
	
	public static void DFS(int x) {
		if(visited[x]==2) {
			return;	
		}
		
		visited[x]++;
		if(visited[x]==2) {
			cnt++;
		}
		DFS(arr[x][1]);
	}
	public static void init() {
		for(int i=0; i<visited.length; i++) {
			if(visited[i]!=2) {
				visited[i] = 0;
			}
		}
	}
}
