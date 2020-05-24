package baekjoon_OLD;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 	name : OX?´ì¦ˆ
 * 
 * @author kiwoong
 *
 */
public class Q8958 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		int start = 0;
		
		while(start<count) {
			
			String str = br.readLine();
			
			int point = 1;
			int result = 0;
			
			char c = ' ';
			for(int i=0; i<str.length(); i++) {
				c = str.charAt(i);
				
				if(c=='O') {
					result += point;
					point++;
				}else {
					point = 1;
				}
			}
			System.out.println(result);
			
			start++;
		}
	}
}
