package programmers.kit.dynamicprogramming;

import java.util.LinkedList;
import java.util.Queue;

public class Roadtoschool {
	static int[][] arr;
	static int[][] visited;
	static int[] nextHeight = {-1, 1, 0, 0};
	static int[] nextWidth = {0, 0, -1, 1};
	public static void main(String[] args) {
		int width = 4;
		int height = 3;
		
		int[][] pud = new int[][] {{2, 2}};
		
		arr = new int[height+2][width+2];
		visited = new int[height+2][width+2];
		for(int i=0; i<arr.length; i++) {
			arr[i][0] = -1;
			arr[i][arr[0].length-1] = -1;
			visited[i][0] = 1;
			visited[i][arr[0].length-1] = 1;
		}
		for(int i=0; i<arr[0].length; i++) {
			arr[0][i] = -1;
			arr[arr.length-1][i] = -1;
			visited[0][i] = 1;
			visited[arr.length-1][i] = 1;
		}
		
		for(int i=0; i<pud.length; i++) {
			int pudY = pud[i][1];
			int pudX = pud[i][0];
			arr[pudY][pudX] = -1;
			visited[pudY][pudX] = 1;
		}
		
		// (0,0) 시작, (height-1, width-1) 도착
		Queue<Road> q = new LinkedList<>();
		visited[1][1] = 1;
		arr[1][1] = 1;
		q.add(new Road(1, 1));
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		/*for(int i=0; i<visited.length; i++) {
			for(int j=0; j<visited[0].length; j++) {
				System.out.print(visited[i][j]+" ");
			}
			System.out.println("");
		}*/
		
		
		while(!q.isEmpty()) {
			Road current = q.poll();
			System.out.println("curX : "+current.width+"   curY : "+current.height);
			for(int i=0; i<4; i++) {
				int nextY = current.height + nextHeight[i];
				int nextX = current.width + nextWidth[i];
				if(visited[nextY][nextX]==1) {
					continue;
				}else {
					int tempVal = 0;
					for(int j=0; j<4; j++) {
						int tempY = nextY + nextHeight[j];
						int tempX = nextX + nextWidth[j];
						if(visited[tempY][tempX]==1 && arr[tempY][tempX]>0) {
							tempVal += arr[tempY][tempX];
						}
					}
					arr[nextY][nextX] = tempVal;
					visited[nextY][nextX] = 1;
					q.add(new Road(nextY, nextX));
				}
			}
		}
		System.out.println("\n\n\n*****************************************");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("ANSWER : "+arr[height][width]);
	}
}
class Road{
	int height;
	int width;
	public Road(int height, int width) {
		this.height = height;
		this.width = width;
	}
}
