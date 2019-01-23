package success;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
/**
 * 괄호
 * @author kiwoong
 *
 */
public class Q9012 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		String[] s_arr = new String[n];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			s_arr[i] = st.nextToken();
		}
		
		for(int i=0; i<s_arr.length; i++) {
			if(isVPS(s_arr[i])) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
	
	static boolean isVPS(String str) {
		Stack<Character> ms = new Stack<Character>();
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c=='(') {
				ms.push(c);
			}else {
				if(!ms.isEmpty()) {
					ms.pop();
				}else {
					return false;
				}
			}
		}
		return ms.isEmpty();
	}
}
