package success;
import java.util.Scanner;

public class Q1475 {
	static int[] arr;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int num;
		arr = new int[9]; // 6이랑 9는 6에 한꺼번에 넣는다
		
		//숫자를 하나씩 꺼내 해당 배열에 넣는다 (6, 9는 arr[6]으로)
		for(int i=0; i<str.length(); i++) {
			num = Integer.parseInt(str.charAt(i)+"");
			if(num==9) {
				arr[6]++;
			}else {
				arr[num]++;
			}
		}
		
		int max = 0;
		int idx = 0;
		
		//배열중 arr[6]을 제외한 나머지 요소중 최대값(최소 필요세트수)을 갖는 위치의 idx를 저장
		for(int i=0; i<arr.length; i++) {
			if(i==6) {
				continue;
			}
			if(max<arr[i]) {
				max = arr[i];
				idx = i;
			}
		}
		
		//arr[6]의 값을 사용해 최소 필요 세트수를 구함
		int n = arr[6];
		if(n%2!=0) {
			n = n/2+1;
		}else {
			n/=2;
		}
		
		//두 최소 필요 세트중 최대값을 구해 출력
		System.out.print(Math.max(arr[idx], n));
		
		
	}
}
