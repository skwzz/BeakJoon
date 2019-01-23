import java.util.Scanner;

public class Q1065 {
	static int[] arr = new int[3];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int result = 0;
		for(int i=1; i<=x; i++) {
			result += isHansu(i); 
		}
		
		System.out.print(result);
	}
	
	public static int isHansu(int x) {
		if(1<=x || x<100) {
			return 1;
		}
		if(x==1000) {
			return 0;
		}
		
		int idx = 0;
		int r = 0; //나머지
		while(x>0) {
			arr[idx++] = x%10;
			x = x/10;
		}
		
		if(arr[0]-arr[1] == arr[1]-arr[2]) {
			return 1;
		}
		
		return 0;
	}
}
