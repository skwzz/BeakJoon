package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leet22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> answer = generateParenthesis(sc.nextInt());
		for(int i=0; i<answer.size(); i++) {
			System.out.println(answer.get(i));
		}
		
	}
	
	public static List<String> generateParenthesis(int n){
		List<String> li = new ArrayList<String>();
		process(n, 0, 0, li, "");
		return li;
	}
	
	public static void process(int n, int numOpen, int numClose, List<String> li, String str) {
		// termination check
		if(numOpen==n && numClose==n) {
			li.add(str);
			return;
		}
		// recursion
		if(numOpen < n) {
			process(n, numOpen+1, numClose, li, str+"("); // open bracket
		}
		if(numClose < numOpen) {
			process(n, numOpen, numClose+1, li, str+")"); // close bracket
		}
	}
}
