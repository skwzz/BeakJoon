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
	// ?ƒ?•˜ì¢Œìš° ?ƒ?ƒ‰?š© ë°°ì—´
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
		// 1 : ?µ?? ?† ë§ˆí†  , 0 : ?•ˆ?µ?? ?† ë§ˆí†  , -1 : ?† ë§ˆí† ê°? ?•ˆ?“¤?–´ê°??‡?Œ
		boolean startAndComplete = true; // 0?´ ?•ˆ?“¤?–´?™”?„ ê²½ìš° ì²´í¬?š©
		
		for(int i=0; i<height; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<width; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				if(arr[i][j] == 0) {
					startAndComplete = false;
				}
				// 1?´ ?“¤?–´?™”?„ ê²½ìš° ë°”ë¡œ ë°©ë¬¸ì²´í¬ ?›„ ??— ?† ë§ˆí†  ?œ„ì¹˜ì •ë³´ë?? ê°?ì§?ê³ ìˆ?Š” ê°ì²´ë¥? add
				if(arr[i][j] == 1) {
					visited[i][j] = 1;
					queue.add(new Tomato(i, j));
				}
				// -1?¸ ê²½ìš° ë¯¸ë¡œì°¾ê¸°?˜ ë²½ì²˜?Ÿ¼ ?ƒê°?. ?•´?‹¹ ?œ„ì¹˜ë?? ë°©ë¬¸ì²´í¬
				if(arr[i][j] == -1) {
					visited[i][j] = 1;
				}
			}
		}
		//ì²˜ìŒ ?…? ¥?‹œ ?•ˆ?µ?? ?† ë§ˆí† ê°? ?•œê°œë„ ?•ˆ?“¤?–´?™”?„ ê²½ìš° ë°”ë¡œ 0ì¶œë ¥ ?›„ ?
		if(startAndComplete) {
			System.out.print("0");
			return;
		}
		
		int max = -1;
		while(!queue.isEmpty()) {
			Tomato current = queue.poll();
			
			for(int i=0; i<4; i++) {
				// ?‹¤?Œ ?ƒ?ƒ‰?•  ?œ„ì¹? ê³„ì‚°
				int nextX = current.x + nX[i];
				int nextY = current.y + nY[i];
				// ?‹¤?Œ ?œ„ì¹˜ê? ë°°ì—´?„ ?„˜?–´ê°? ê²½ìš° continue
				if(nextX<0 || nextY<0 || nextX>=height || nextY>=width) {
					continue;
				}
				// ?‹¤?Œ ?œ„ì¹˜ê? ?´ë¯? ë°©ë¬¸?´ ?˜?ˆ?„ ê²½ìš° continue
				if(visited[nextX][nextY]==1) {
					continue;
				}else {
					/*
					 * ?‹¤?Œ ì¢Œí‘œë¥? ë°©ë¬¸ì²´í¬
					 * ?‹¤?Œ ?† ë§ˆí†  ?œ„ì¹˜ë?? ?˜„?¬ ?† ë§ˆí†  ê°? + 1 (?´ê±¸ë¡œ ?¼?ˆ˜ë¥? ê³„ì‚°?• ê±°ì„)
					 * max?? ë¹„êµ ?›„ maxë³´ë‹¤ ?¬?‹¤ë©? max?— ???¥
					 * ??— ?‹¤?Œ ì¢Œí‘œ? •ë³´ë?? ê°?ì§?ê³? ?ˆ?Š” ?† ë§ˆí†  ê°ì²´ add
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
		// ?‚¨?? ?† ë§ˆí† ê°? ?ˆ?Š”ì§? ì²´í¬
		boolean finish = true;
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				if(arr[i][j]==0) {
					finish = false;
				}
			}
		}
		// ë§¤ë¬´ë¦? 
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
