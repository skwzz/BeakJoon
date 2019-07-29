package success;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7676 {
	static int[][] arr;
	static int[][] visited;
	// 상하좌우 탐색용 배열
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
		// 1 : 익은 토마토 , 0 : 안익은 토마토 , -1 : 토마토가 안들어가잇음
		boolean startAndComplete = true; // 0이 안들어왔을 경우 체크용
		
		for(int i=0; i<height; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<width; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				if(arr[i][j] == 0) {
					startAndComplete = false;
				}
				// 1이 들어왔을 경우 바로 방문체크 후 큐에 토마토 위치정보를 가지고있는 객체를 add
				if(arr[i][j] == 1) {
					visited[i][j] = 1;
					queue.add(new Tomato(i, j));
				}
				// -1인 경우 미로찾기의 벽처럼 생각. 해당 위치를 방문체크
				if(arr[i][j] == -1) {
					visited[i][j] = 1;
				}
			}
		}
		//처음 입력시 안익은 토마토가 한개도 안들어왔을 경우 바로 0출력 후 끝
		if(startAndComplete) {
			System.out.print("0");
			return;
		}
		
		int max = -1;
		while(!queue.isEmpty()) {
			Tomato current = queue.poll();
			
			for(int i=0; i<4; i++) {
				// 다음 탐색할 위치 계산
				int nextX = current.x + nX[i];
				int nextY = current.y + nY[i];
				// 다음 위치가 배열을 넘어갈 경우 continue
				if(nextX<0 || nextY<0 || nextX>=height || nextY>=width) {
					continue;
				}
				// 다음 위치가 이미 방문이 되있을 경우 continue
				if(visited[nextX][nextY]==1) {
					continue;
				}else {
					/*
					 * 다음 좌표를 방문체크
					 * 다음 토마토 위치를 현재 토마토 값 + 1 (이걸로 일수를 계산할거임)
					 * max와 비교 후 max보다 크다면 max에 저장
					 * 큐에 다음 좌표정보를 가지고 있는 토마토 객체 add
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
		// 남은 토마토가 있는지 체크
		boolean finish = true;
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				if(arr[i][j]==0) {
					finish = false;
				}
			}
		}
		// 매무리 
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
