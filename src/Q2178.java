import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2178 {
	public static int[] nX = {-1, 0, 1, 0};
	public static int[] nY = {0, -1, 0, 1};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[a][b];
		int[][] visited = new int[a][b];
		
		String str;
		for(int i=0; i<arr.length; i++) {
			str = br.readLine();
			char[] temp = str.toCharArray();
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = temp[j]-48;
			}
		}
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(new Node(0, 0));
		visited[0][0] = 1;
		int nextX = 0;
		int nextY = 0;
		while(!q.isEmpty()) {
			Node current = q.poll();
			for(int i=0; i<4; i++) {
				nextX = current.x + nX[i];
				nextY = current.y + nY[i];
				if(nextX<0 || nextY<0 || nextX>=a || nextY>=b) {
					continue;
				}
				if(arr[nextX][nextY]==0) {
					continue;
				}
				if(visited[nextX][nextY]==1) {
					continue;
				}else {
					visited[nextX][nextY]=1;
					arr[nextX][nextY] = arr[current.x][current.y]+1;
					q.add(new Node(nextX, nextY));
				}
			}
		}
		
		System.out.print(arr[a-1][b-1]);
	}
}
class Node{
	int x;
	int y;
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
