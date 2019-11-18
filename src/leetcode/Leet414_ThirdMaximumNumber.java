package leetcode;
import java.util.Arrays;
import java.util.HashMap;

public class Leet414_ThirdMaximumNumber {
	public static void main(String[] args) {
		int[] nums = {1,1,2};
		int answer = thirdMax(nums);
		System.out.println(answer);
	}
	
	static int thirdMax(int[] nums) {
		Arrays.sort(nums);
		if(nums.length<3) {
			return nums[nums.length-1];
		}
		
		int cnt = 0;
		int tmp = 0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=nums.length-1; i>=0; i--) {
			if(nums[i]!=tmp) {
				tmp = nums[i];
				cnt++;
				hm.put(cnt, i);
				if(hm.size()==3) {
					break;
				}
			}
		}
		if(hm.size()<3) {
			return nums[hm.get(1)];
		}
		return nums[hm.get(hm.size())];
	}
}
