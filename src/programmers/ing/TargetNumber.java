package programmers.ing;

public class TargetNumber {
	public static void main(String[] args) {
		TargetNumber tn = new TargetNumber();
		int[] arr = {1, 1, 1, 1, 1};
		int target = 5;
		
		System.out.println(tn.solution(arr, target, 0, 0));
		
	}
	
	public int solution(int[] numbers, int target, int index, int sum) {
		int answer = DFS(numbers, target, index, sum);
		return answer;
	}
	
	public static int DFS(int[] numbers, int target, int index, int sum) {
		if(index==numbers.length) {
			if(sum==target) {
				return 1;
			}else {
				return 0;
			}
		}else {
			return DFS(numbers, target, index+1, sum+numbers[index])
					+DFS(numbers, target, index+1, sum-numbers[index]);
		}
	}
}
