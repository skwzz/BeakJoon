package baekjoon_OLD;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2133 {
	static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		arr = new int[num+1];
		Q2133 test = new Q2133();
		int answer = test.dp2133(num);
		System.out.println(answer);
		
	}
	public int dp2133(int num) {
		if(num==0) return 1;
		if(num==1) return 0;
		if(num==2) return 3;
		if(arr[num]!=0) return arr[num];
		int result = 3*dp2133(num-2);
		for(int i=3; i<=num; i++	) {
			if(i%2==0) {
				result += 2*dp2133(num-i);
			}
		}
		return arr[num] = result;
	}
}
