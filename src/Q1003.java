import java.util.Scanner;

public class Q1003 {
	static int[] memo;
	static int[] callOZ = new int[2];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int loopCnt = in.nextInt();
		int n = 0;
		for(int i=0; i<loopCnt; i++) {
			n = in.nextInt();
			memo = new int[n+1];
			fibo(n);
			
			System.out.println(callOZ[0]+" "+callOZ[1]);
			callOZ = new int[2];
		}
	}
	
	public static int fibo(int n) {
		if(n==0	) {
			callOZ[0]++;
			return 0;
		}else if(n==1) {
			callOZ[1]++;
			return 1;
		}else {
			return fibo(n-1)+fibo(n-2);
		}
	}
}
