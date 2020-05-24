package baekjoon_OLD;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1996 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int testCase = Integer.parseInt(br.readLine());
		/* testCase 반복�? ?��?��?��?��?�� */
		for(int k=0; k<testCase; k++) {
			st = new StringTokenizer(br.readLine());
			int printNum = Integer.parseInt(st.nextToken());
			int target = Integer.parseInt(st.nextToken());
			Queue<Printer> queue = new LinkedList<Printer>();
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<printNum; i++) {
				int pri = Integer.parseInt(st.nextToken());
				queue.add(new Printer(i, pri ));
			}
			
			
			int answer = 1;
			while(!queue.isEmpty()) {
				Printer current = queue.poll();
				boolean check = true;
				
				Iterator it = queue.iterator();
				while(it.hasNext()) {
					Printer other = (Printer)it.next();
					if(current.priority < other.priority) {
						check = false;
						break;
					}
				}
				if(!check) {
					queue.add(current);
				}else {
					if(current.idx == target) {
						System.out.println(answer);
					}else {
						answer++;
					}
				}
			}
		}
	}
}
class Printer{
	int idx;
	int priority;
	
	public Printer(int idx, int priority){
		this.idx = idx;
		this.priority = priority;
	}
}
