package baekjoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2252 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int student = Integer.parseInt(st.nextToken());
		int edge = Integer.parseInt(st.nextToken());
		
		int[] edgeCnt = new int[student+1];
		ArrayList<Integer>[] arr = new ArrayList[student+1];
		for(int i=0; i<arr.length; i++) {
			arr[i] = new ArrayList<Integer>();
		}
		
		
		for(int i=0; i<edge; i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			//num1 -> num2  (ì§„ìž…ì°¨ìˆ˜ë¥? ?Š˜? ¤ì¤?)
			edgeCnt[num2]++;
			arr[num1].add(num2);
		}
		
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=1; i<edgeCnt.length; i++) {
			if(edgeCnt[i]==0) {
				queue.add(i);
			}
		}
		
		for(int i=0; i<student; i++) {
			int current = queue.remove();
			bw.write(current+" ");
			int next;
			for(int j=0; j<arr[current].size(); j++) {
				next = arr[current].get(j);
				edgeCnt[next]--;
				if(edgeCnt[next]==0) {
					queue.add(next);
				}
			}
		}
		
		bw.flush();
		bw.close();
	}
}

