package baekjoon_OLD;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Q2667 {
	static int[] nX = {-1, 0, 1, 0};
	static int[] nY = {0, -1, 0, 1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int[][] arr = new int[size][size];
		int[][] visited = new int[size][size];
		String str = "";
		for(int i=0; i<size; i++) {
			str = br.readLine();
			for(int j=0; j<size; j++) {
				arr[i][j] = str.charAt(j) - 48;
			}
		}
		int hc = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j]==1 && visited[i][j]==0) {
					hc++;
					al.add(BFS(arr, visited, i, j));
				}
			}
		}
		Collections.sort(al);
		System.out.println(hc);
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
	
	public static int BFS(int[][] arr, int[][] visited, int x, int y) {
		int houseCnt = 1;
		Queue<House> queue = new LinkedList<House>();
		visited[x][y] = 1;
		queue.add(new House(x, y));
		
		while(!queue.isEmpty()) {
			House current = queue.poll();
			int nextX = 0;
			int nextY = 0;
			for(int i=0; i<4; i++) {
				nextX = current.x + nX[i];
				nextY = current.y + nY[i];
				
				if(nextX<0 || nextY<0|| nextX>=arr.length || nextY>=arr.length) {
					continue;
				}
				if(visited[nextX][nextY]==1) {
					continue;
				}
				
				if(arr[nextX][nextY]==1) {
					visited[nextX][nextY]=1;
					queue.add(new House(nextX, nextY));
					houseCnt++;
				}
			}
		}
		
		return houseCnt;
	}
}
class House{
	int x;
	int y;
	public House(int x, int y) {
		this.x = x;
		this.y = y;
	}
}