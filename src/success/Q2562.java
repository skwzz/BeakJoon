package success;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2562 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		int max = 0;
		int idx = 0;
		for(int i=0; i<9; i++) {
			num = Integer.parseInt(br.readLine());
			if(max<num) {
				max = num;
				idx = i+1;
			}
		}
		System.out.println(max+"\n"+idx);
	}
}