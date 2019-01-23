
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q4964_back {
	public static int[] nX = {-1, 0, 1, -1, 1, -1, 0, 1};
	public static int[] nY = {-1, -1, -1, 0, 0, 1, 1, 1};
	
	public static void main(String[] args) throws IOException{
		Q4964_back to = new Q4964_back();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[h][w];
		
		for(int i=0; i<arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j]==1) {
					count++;
					to.getIsland(arr, new Dot4(i, j));
				}
			}
		}
		System.out.println(count);
	}
	
	public void getIsland(int[][] arr, Dot4 Dot4) {
		Queue<Dot4> q = new LinkedList<Dot4>();
		q.add(Dot4);
		arr[Dot4.x][Dot4.y] = 0;
		
		int curX;
		int curY;
		int nextX;
		int nextY;
		Dot4 d;
		
		while(!q.isEmpty()) {
			d = q.poll();
			curX = d.x;
			curY = d.y;
			
			for(int i=0; i<8; i++) {
				nextX = curX+nX[i];
				nextY = curY+nY[i];
				
				if(nextX<0 || nextY<0 || nextX>=arr.length ||nextY>=arr[0].length) {
					continue;
				}
				if(arr[nextX][nextY]==1) {
					arr[nextX][nextY]=0;
					q.add(new Dot4(nextX, nextY));
				}
			}
		}
		
	}
}
class Dot4{
	int x;
	int y;
	
	public Dot4(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
*/