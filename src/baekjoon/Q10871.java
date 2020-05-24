package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * Xë³´ë‹¤ ?ž‘???ˆ˜
 * @author kiwoong
 *
 */
public class Q10871 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[x];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<x; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<x; i++) {
			if(arr[i] < y) {
				System.out.print(arr[i]+" ");
			}
		}

	}
}
