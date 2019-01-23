package success;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1260 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int dot = Integer.parseInt(st.nextToken());
		int edge = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		Vertex[] v = new Vertex[dot+1];
		for(int i=0; i<v.length; i++) {
			v[i] = new Vertex();
		}
		
		int a = 0;
		int b = 0;
		for(int i=0; i<edge; i++) {
			st = new StringTokenizer(br.readLine());
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			v[a].al.add(b);
			v[b].al.add(a);
		}
		
		for(int i=0; i<v.length; i++) {
			if(v[i].al.size()!=0) {
				Collections.sort(v[i].al);
			}
		}
		
		DFS(v, start);
		clear(v);
		System.out.println("");
		BFS(v, start);
	}
	
	public static void DFS(Vertex[] v, int start) {
		v[start].visit = 1;
		System.out.print(start+" ");
		
		int next = 0;
		for(int i=0; i<v[start].al.size(); i++) {
			next = v[start].al.get(i);
			
			if(v[next].visit==0) {
				DFS(v, next);
			}
		}
	}
	
	public static void BFS(Vertex[] v, int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		v[start].visit = 1;
		
		int temp = 0;
		while(!q.isEmpty()) {
			temp = q.poll();
			System.out.print(temp+" ");
			
			int next = 0;
			for(int i=0; i<v[temp].al.size(); i++) {
				next = v[temp].al.get(i);
				if(v[next].visit==0) {
					v[next].visit = 1;
					q.add(next);
				}
			}
		}
	}
	
	public static void clear(Vertex[] v) {
		for(int i=0; i<v.length; i++) {
			v[i].visit = 0;
		}
	}
}
class Vertex{
	int visit;	// 0: not visited,  1: visited
	ArrayList<Integer> al;
	
	public Vertex() {
		visit = 0;
		al = new ArrayList<Integer>();
	}
}
