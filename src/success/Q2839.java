package success;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2839 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int temp = 0;
		
		while(true) {
			if(num%5==0) {
				System.out.print(num/5 + temp);
				break;
			}else if(num<=0) {
				System.out.print("-1");
				break;
			}
			
			num -= 3;
			temp++;
		}
	}
}
