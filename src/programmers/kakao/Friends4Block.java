package programmers.kakao;
import java.util.LinkedList;
import java.util.Queue;

public class Friends4Block {
	static int[][] check;
	static char[][] arr;
	static int answer;
	public static void main(String[] args) {
		
	    int m = 6;
	    int n = 6;
	    String[] board = {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};
		
		check = new int[m][n];
		arr = new char[m][n];
		answer = 0;
		
		// 보드값 2차원 배열로 옮김
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = board[i].charAt(j);
			}
		}
		
		boolean goNext = true;
		while(goNext) {
			
			goNext = false;
			
			// 2x2가 있는지 체크
			for(int i=0; i<arr.length-1; i++) {
				for(int j=0; j<arr[0].length-1; j++) {
					char target = arr[i][j];
					//밑의 if는 두번째 루프부터 사용될 조건문
					if(target == ' ') {
						continue;
					}
					// 자신의 우, 하, 우하방 이 동시에 값이 같다면  check 표시.
					// 그리고 다음 루프를 돌수 있도록 goNext를 true.
					if(arr[i][j+1] == target && arr[i+1][j] == target && arr[i+1][j+1] == target) {
						check[i][j] = 1;
						check[i+1][j] = 1;
						check[i][j+1] = 1;
						check[i+1][j+1] = 1;
						goNext = true;
					}
				}
			}
			// 파괴될 블록의 갯수를 answer에 더함
			// 파괴될 블록이 0이라면 바로 while 빠져나감.
			// 아니라면 블록을 내리고 체커보드 초기화
			int tempCnt = countChecker();
			if(tempCnt==0) {
				break;
			}else {
				answer+=tempCnt;
			}
			
			// 블록 내리는 작업
			for(int i=0; i<check[0].length; i++) {
				Queue<Character> q = new LinkedList<>();
				for(int j=check.length-1; j>=0; j--) {
					if(check[j][i]!=1) {
						q.add(arr[j][i]);
					}
				}
				int tempZeroCnt = check.length - q.size();
				for(int j=0; j<tempZeroCnt; j++	) {
					q.add(' ');
				}
				
				for(int j=check.length-1; j>=0; j--) {
					arr[j][i] = q.poll();
				}
			}
			// 체커보드 초기화
			check = new int[m][n];
			
		}// end of while
		
		System.out.println("ANSWER : "+answer);
	}
	
	public static int countChecker() {
		int oneCnt = 0;
		for(int i=0; i<check.length; i++) {
			for(int j=0; j<check[0].length; j++) {
				if(check[i][j]==1) {
					oneCnt++;
				}
			}
		}
		return oneCnt;
	}
}
