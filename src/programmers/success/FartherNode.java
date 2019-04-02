package programmers.success;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class FartherNode {
	static int max = 0;
	public static void main(String[] args) {
		
		int n = 6;
		int[][] vertex = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
		
		Vertex[] v = new Vertex[n+1];
		for(int i=0; i<v.length; i++) {
			v[i] = new Vertex();
		}
		
		int n1, n2;
		for(int i=0; i<vertex.length; i++) {
			System.out.println(vertex[i][0]+" "+vertex[i][1]);
			n1 = vertex[i][0];
			n2 = vertex[i][1];
			if(!v[n1].al.contains(n2)) {
				v[n1].al.add(n2);
			}
			if(!v[n2].al.contains(n1)) {
				v[n2].al.add(n1);
			}
		}
		if(v[1].al.size()==0) {
			System.out.println("0");
		}else {
			for(int i=0; i<v.length; i++) {
				Collections.sort(v[i].al);
			}
			v[1].visited = true;
			System.out.println("----------BFS START----------");
			bfs(v);
			System.out.println("----------BFS END----------");
		}
		/*
		System.out.println("=====================");
		for(int i=0; i<v.length; i++) {
			System.out.print(i+" : ");
			for(int j=0; j<v[i].al.size(); j++) {
				System.out.print(v[i].al.get(j)+" ");
			}
			System.out.println("");
		}
		*/
		for(int i=0; i<v.length; i++) {
			System.out.println("v["+i+"] : "+v[i].dist);
		}
		
		int answer = 0;
		for(int i=0; i<v.length; i++) {
			if(max==v[i].dist) {
				answer++;
			}
		}
		System.out.println("answer:"+answer);
		
	}
	public static void bfs(Vertex[] v) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		int num;
		int next;
		
		while(!q.isEmpty()) {
			for(int i=0; i<q.size(); i++) {
				System.out.print(q.peek()+" ");
			}
			System.out.println("");
			num = q.poll();
			
			for(int i=0; i<v[num].al.size(); i++) {
				next = v[num].al.get(i);
				System.out.println("next:"+next);
				if(!v[next].visited) {
					v[next].visited = true;
					v[next].dist = v[num].dist+1;
					if(max<=v[next].dist) {
						max = v[next].dist;
					}
					q.add(next);
				}
				/*
				if(!v[next].visited) {
					v[next].dist = v[i].dist+1;
					v[next].visited = true;
					q.add(next);
				}
				*/
			}
		}
	}
}
class Vertex{
	int dist;
	boolean visited;
	ArrayList<Integer> al;
	
	public Vertex() {
		dist = 0;
		visited = false;
		al = new ArrayList<Integer>();
	}
}
