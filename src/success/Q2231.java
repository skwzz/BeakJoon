package success;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2231 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		
		int idx = 1;
		int temp;
		int sum;
		boolean checker = false;
		
		while(idx<=num) {
			sum = idx;
			temp = idx;
			
			int r = 0;
			while(temp>0) {
				r = temp%10;
				sum+=r;
				temp /= 10;
			}
			if(sum == num) {
				checker = true;
				System.out.println(idx);
				break;
			}
			idx++;
		}
		
		
		if(!checker) {
			System.out.println(0);
		}
	}
}
