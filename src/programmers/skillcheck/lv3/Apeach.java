package programmers.skillcheck.lv3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Apeach {
	static int[][] visited;
	static ArrayList<Integer> al;
	
	static int[] nX = {-1, 0, 1, 0};
	static int[] nY = {0, -1, 0, 1};
	
	public static void main(String[] args) {
		Apeach t = new Apeach();
		int m = 6;
		int n = 4;
		int[][] arr = new int[][] {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
		
		visited = new int[m][n];
		al = new ArrayList<>();
		
		for(int i=0; i<1; i++	) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j]!=0 && visited[i][j]==0) {
					System.out.println("["+i+"]"+"["+j+"]");
					visited[i][j] = 1;
					t.BFS(i, j, arr, arr[i][j]);
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(visited[i][j]+" ");
			}
			System.out.println("");
		}
		
		
	}
	
	public void BFS(int m, int n, int[][] arr, int target) {
		int count = 1;
		
		Queue<APC> q = new LinkedList<APC>();
		q.add(new APC(m, n));
		
		while(!q.isEmpty()) {
			APC cur = q.poll();
			
			for(int i=0; i<4; i++) {
				int nextX = cur.x + nX[i];
				int nextY = cur.y + nY[i];
				if(nextX>=0 && nextY>=0 && nextX<=arr.length && nextY<=arr[0].length) {
					if(arr[nextX][nextY] == target && visited[nextX][nextY] == 0) {
						visited[nextX][nextY] = 1;
						count++;
						q.add(new APC(nextX, nextY));
					}
				}
			}
		}
		System.out.println("COUNT:"+count);
		al.add(count);
		
	}
}

class APC{
	int x;
	int y;
	
	public APC(int x, int y){
		this.x = y;
		this.x = y;
	}
}
