package success;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10845 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		MQ10845 mq = new MQ10845(n);
		String oper;
		int data;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			oper = st.nextToken();
			/*for(int j=0; j<mq.myQueue.length; j++) {
				System.out.print(mq.myQueue[j]+" ");
			}
			System.out.println("");*/
			switch(oper) {
			case "push":
				data = Integer.parseInt(st.nextToken());
				mq.push(data);
				break;
			case "pop":
				System.out.println(mq.pop());
				break;
			case "size":
				System.out.println(mq.size());
				break;
			case "empty":
				System.out.println(mq.empty());
				break;
			case "front":
				System.out.println(mq.front());
				break;
			case "back":
				System.out.println(mq.back());
				break;
			default:
				break;
				
			}
		}
		
	}
}

class MQ10845{
	int[] myQueue;
	int size;
	int head;
	int tail;
	
	public MQ10845(int length) {
		myQueue = new int[length];
		size = 0;
		head = 0;
		tail = 0;
	}
	
	public void push(int data) {
		myQueue[tail++] = data;
		size++;
	}
	
	public int pop() {
		// to do : finish this
		if(size==0) {
			return -1;
		}else {
			int temp = myQueue[head];
			head++;
			size--;
			return temp;
		}
		
	}
	
	public int size() {
		return size;
	}
	
	public int empty() {
		if(size==0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public int front() {
		if(size==0) {
			return -1;
		}else {
			return myQueue[head];
		}
	}
	
	public int back() {
		if(size==0) {
			return -1;
		}else {
			return myQueue[tail-1];
		}
	}
}
