package baekjoon_OLD;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1874 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		boolean check = true;
		
		int s = Integer.parseInt(br.readLine());
		int[] arr = new int[s];
		int num = 1;
		for(int i=0; i<s; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			
			if(check) {
				while(num<=arr[i]) {
					stack.push(num++);
					sb.append("+\n");
				}
				if(stack.isEmpty()) {
					check = false;
				}else {
					while(stack.peek()>=arr[i]) {
						stack.pop();
						sb.append("-\n");
						if(stack.isEmpty()) {
							break;
						}
					}
				}
			}
		}
		
		if(check) {
			System.out.print(sb.toString());
		}else {
			System.out.print("NO");
		}
	}
}
