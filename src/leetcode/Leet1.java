package leetcode;

import java.util.HashMap;

public class Leet1 {
	public static void main(String[] args) {
		int[] arr = {2, 7, 11, 15};
		int n = 9;
		
		int[] answer = twoSum(arr, n);
		System.out.print(answer[0] + " " + answer[1]);
		
		int[] answer2 = twoSum2(arr, n);
		System.out.print(answer2[0] + " " + answer2[1]);
	}
	
	// Brute-force
	public static int[] twoSum(int[] nums, int target) {
		int[] a = new int[2];
		
		for(int i=0; i<nums.length-1; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]+nums[j]==target) {
					a[0] = i;
					a[1] = j;
				}
			}
		}
		
		return a;
	}
	
	// HashMap
	public static int[] twoSum2(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>(); 
		
		for(int i=0; i<nums.length; i++) {
			int cur = nums[i];
			if(map.containsKey(target-cur)) {
				int[] answer = new int[2];
				answer[0] = map.get(target-cur);
				answer[1] = i;
				return answer;
			}else {
				map.put(cur, i);
			}
		}
		return null;
	}
}
