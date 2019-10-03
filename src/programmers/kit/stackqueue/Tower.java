package programmers.kit.stackqueue;

import java.util.Stack;

public class Tower {
	public static void main(String[] args) {
//		int[] arr = {6, 9, 5, 7, 4};
//		int[] arr = {3, 9, 9, 3, 5, 7, 2};
//		int[] arr = {1, 5, 3, 6, 7, 6, 5};
		int[] arr = {1};
		Stack<Integer> s = new Stack<Integer>();
		
		for(int i=arr.length-1; i>=1; i--) {
			int current = arr[i];
			boolean findTower = false;
			for(int j=i-1; j>=0; j--) {
				if(current<arr[j]) {
					s.push(j+1);
					findTower = true;
					break;
				}
			}
			if(!findTower) {
				s.push(0);
			}
		}
		s.push(0);
		
		int answer[] = new int[s.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = s.pop();
			System.out.print(answer[i]+" ");
		}
	}
}
