package programmers.kakao;

import java.util.LinkedList;
import java.util.Queue;

public class DartGame {
	static int[] point = new int[3];
	static int idx = 0;
	public static void main(String[] args) {
		String str = "1D2S#10S";
		
		char[] arr = str.toCharArray();
		
		Queue<Character> q = new LinkedList<>();
		for(int i=0; i<arr.length; i++) {
			q.add(arr[i]);
			System.out.print(arr[i]+" ");
			if(arr[i]=='S' || arr[i]=='D' || arr[i]=='T') {
				if(i!=arr.length-1 && (arr[i+1]=='*' || arr[i+1]=='#')) {
					System.out.print(arr[i+1]+" ");
					q.add(arr[i+1]);
					i++;
				}
				System.out.println("");
				makePoint(q);
			}
		}
		int answer = 0;
		for(int i=0; i<point.length; i++) {
			answer+=point[i];
		}
		System.out.println("ANSWER : "+answer);
	}
	
	static void makePoint(Queue<Character> q) {
		System.out.println("들어옴");
		int num = q.poll()-48;
		if(q.peek()=='0') {
			q.poll();
			num = 10;
		}
		char bonus = q.poll();
		char option = ' ';
		if(!q.isEmpty()) {
			option = q.poll();
		}
	
		if(bonus=='D') {
			num = (int)Math.pow(num,2);
		}else if(bonus=='T') {
			num = (int)Math.pow(num,3);
		}
		point[idx] = num;
		
		if(option=='*') {
			point[idx] *= 2;
			if(idx!=0) {
				point[idx-1] *= 2;
			}
		}else if(option=='#') {
			point[idx] *= -1;
		}
		idx++;
	}
}
