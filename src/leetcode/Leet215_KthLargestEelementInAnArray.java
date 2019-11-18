package leetcode;
import java.util.Arrays;
import java.util.HashMap;

public class Leet215_KthLargestEelementInAnArray {
	public static void main(String[] args) {
		int[] nums = {3,2,1,5,6,4};
		int k = 2;
		int answer = thirdMax(nums, k);
		System.out.println(answer);
	}
	
	static int thirdMax(int[] nums, int k) {
		Arrays.sort(nums);
		int cnt = 0;
		int ret = 0;
		for(int i=nums.length-1; i>=0; i--) {
			cnt++;
			if(cnt==k) {
				ret = nums[i];
			}
		}
		return ret;
	}
}
