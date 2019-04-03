package success;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1100 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		int result = 0;
		for(int i=0; i<8; i++) {
			str = br.readLine();
			char[] arr = str.toCharArray();
			int checker;
			if(i%2==0) {
				checker = 1; // 하
			}else {
				checker = 0; // 검
			}
			for(int j=0; j<arr.length; j++) {
				if(arr[j]=='F' && checker==1) {
					result++;
				}
				if(checker==1) {
					checker--;
				}else {
					checker++;
				}
			}
		}
		System.out.println(result);
		
	}
}
