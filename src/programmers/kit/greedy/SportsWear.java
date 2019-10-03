package programmers.kit.greedy;

public class SportsWear {
	public static void main(String[] args) {
		int n = 3;
		int[] lost = {3};
		int[] reserve = {1};
		
		int[] arr = new int[n+1];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]++;
		}
		for(int i=0; i<lost.length; i++) {
			arr[lost[i]]--;
		}
		for(int i=0; i<reserve.length; i++) {
			arr[reserve[i]]++;
		}
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]==0) {
				findWear(arr, i);
			}
		}
		int answer = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>0) {
				answer++;
			}
		}
		System.out.println(answer);
	}
	
	public static void findWear(int[] arr, int idx) {
		if(idx==1) {
			if(arr[idx+1]==2) {
				arr[idx+1]--;
				arr[idx]++;
			}
		}else if(idx==arr.length-1) {
			if(arr[idx-1]==2) {
				arr[idx-1]--;
				arr[idx]++;
			}
		}else {
			if(arr[idx-1]==2) {
				arr[idx-1]--;
				arr[idx]++;
			}else if(arr[idx+1]==2) {
				arr[idx+1]--;
				arr[idx]++;
			}
		}
	}
}

