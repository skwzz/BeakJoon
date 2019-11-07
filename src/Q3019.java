import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3019 {
	static int c;
	static int p;
	static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		c = Integer.parseInt(st.nextToken());
		p = Integer.parseInt(st.nextToken());
		arr = new int[c];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int answer = 0;
		
		switch(p) {
			case 1:
				answer = c + solve(new int[] {0,0,0,0});
				break;
			case 2:
				answer = solve(new int[] {0,0});
				break;
			case 3:
				answer = solve(new int[] {1,1,0}) + solve(new int[] {0,1});
				break;
			case 4:
				answer = solve(new int[] {0,1,1}) + solve(new int[] {1,0});
				break;
			case 5:
				answer = solve(new int[] {1,0})
						+ solve(new int[] {0,1})
						+ solve(new int[] {0,0,0})
						+ solve(new int[] {0,1,0});
				break;
			case 6:
				answer = solve(new int[] {0,0,0})
						+ solve(new int[] {0,2})
						+ solve(new int[] {1,0,0})
						+ solve(new int[] {0,0});
				break;
			case 7:
				answer = solve(new int[] {0,0,0})
						+ solve(new int[] {2,0})
						+ solve(new int[] {0,0,1})
						+ solve(new int[] {0,0});
				break;
		}
		System.out.println(answer);
		
	}
	
	public static int solve(int[] block) {
		int ret = 0;
		for(int i=0; i<=c-block.length; i++) {
			int temp = block[0] + arr[i];
			boolean check = true;
			for(int j=0; j<block.length; j++) {
				if(block[j]+arr[i+j]!=temp) {
					check = false;
					break;
				}
			}
			if(check) {
				ret++;
			}
		}
		return ret;
	}
}
