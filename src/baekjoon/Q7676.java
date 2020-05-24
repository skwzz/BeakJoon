package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7676 {
	static int[][] arr;
	static int[][] visited;
	// ?��?��좌우 ?��?��?�� 배열
	static int[] nX = {-1, 0, 1, 0};
	static int[] nY = {0, -1, 0, 1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int width = Integer.parseInt(st.nextToken());
		int height = Integer.parseInt(st.nextToken());
		arr = new int[height][width];
		visited = new int[height][width];
		Queue<Tomato> queue = new LinkedList<Tomato>();
		// 1 : ?��?? ?��마토 , 0 : ?��?��?? ?��마토 , -1 : ?��마토�? ?��?��?���??��?��
		boolean startAndComplete = true; // 0?�� ?��?��?��?��?�� 경우 체크?��
		
		for(int i=0; i<height; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<width; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				if(arr[i][j] == 0) {
					startAndComplete = false;
				}
				// 1?�� ?��?��?��?�� 경우 바로 방문체크 ?�� ?��?�� ?��마토 ?��치정보�?? �?�?고있?�� 객체�? add
				if(arr[i][j] == 1) {
					visited[i][j] = 1;
					queue.add(new Tomato(i, j));
				}
				// -1?�� 경우 미로찾기?�� 벽처?�� ?���?. ?��?�� ?��치�?? 방문체크
				if(arr[i][j] == -1) {
					visited[i][j] = 1;
				}
			}
		}
		//처음 ?��?��?�� ?��?��?? ?��마토�? ?��개도 ?��?��?��?��?�� 경우 바로 0출력 ?�� ?��
		if(startAndComplete) {
			System.out.print("0");
			return;
		}
		
		int max = -1;
		while(!queue.isEmpty()) {
			Tomato current = queue.poll();
			
			for(int i=0; i<4; i++) {
				// ?��?�� ?��?��?�� ?���? 계산
				int nextX = current.x + nX[i];
				int nextY = current.y + nY[i];
				// ?��?�� ?��치�? 배열?�� ?��?���? 경우 continue
				if(nextX<0 || nextY<0 || nextX>=height || nextY>=width) {
					continue;
				}
				// ?��?�� ?��치�? ?���? 방문?�� ?��?��?�� 경우 continue
				if(visited[nextX][nextY]==1) {
					continue;
				}else {
					/*
					 * ?��?�� 좌표�? 방문체크
					 * ?��?�� ?��마토 ?��치�?? ?��?�� ?��마토 �? + 1 (?��걸로 ?��?���? 계산?��거임)
					 * max?? 비교 ?�� max보다 ?��?���? max?�� ???��
					 * ?��?�� ?��?�� 좌표?��보�?? �?�?�? ?��?�� ?��마토 객체 add
					 */
					visited[nextX][nextY]=1;
					arr[nextX][nextY] = arr[current.x][current.y]+1;
					if(max<arr[nextX][nextY]) {
						max = arr[nextX][nextY];
					}
					queue.add(new Tomato(nextX, nextY));
				}
			}
		}
		// ?��?? ?��마토�? ?��?���? 체크
		boolean finish = true;
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				if(arr[i][j]==0) {
					finish = false;
				}
			}
		}
		// 매무�? 
		if(finish) {
			System.out.print(max-1);
		}else {
			System.out.print("-1");
		}
	}
}
class Tomato{
	int x;
	int y;
	public Tomato(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
