package success;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * 스택 사용하기(기초)
 * @author kiwoong
 *
 */
public class Q10828 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		MyStack ms = new MyStack(n);
		int x=0;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			if(str.equals("push")) {
				x = Integer.parseInt(st.nextToken());
			}
			switch(str) {
				case "push":
					ms.push(x);
					break;
				case "pop":
					ms.pop();
					break;
				case "size":
					ms.size();
					break;
				case "empty":
					ms.empty();
					break;
				case "top":
					ms.top();
					break;
				default:
					break;	
			}
		}
	}
}
class MyStack{
	
	int[] arr;
	int size;
	
	public MyStack(int n) {
		arr = new int[n];
		size = 0;
	}
	public void push(int x) {
		arr[size] = x;
		size++;
	}
	public void pop() {
		if(size==0) {
			System.out.println(-1);
		}else {
			System.out.println(arr[size-1]);
			arr[size-1] = 0;
			size--;
		}
	}
	public void size() {
		System.out.println(size);
	}
	public void empty() {
		if(size==0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
	public void top() {
		if(size==0) {
			System.out.println(-1);
		}else {
			System.out.println(arr[size-1]);
		}
	}
	public void printStack() {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
