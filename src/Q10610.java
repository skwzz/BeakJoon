import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10610 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		char[] temp =str.toCharArray();
		int[] arr = new int[temp.length];
		
		boolean zeroChecker = false;
		for(int i=0; i<arr.length; i++) {
			arr[i] = temp[i]-48;
			if(arr[i] == 0) {
				zeroChecker = true;
			}
		}
		
		if(!zeroChecker) {
			System.out.print("-1");
			return;
		}
		
		System.out.print("가능성있음");
	}
}
