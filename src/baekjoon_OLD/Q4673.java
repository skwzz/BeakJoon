package baekjoon_OLD;

public class Q4673 {
	static int[] checker = new int[10001];
	
	public static void main(String[] args) {
		for(int i=1; i<=10000; i++) {
			selfNumberFunc(i);
		}
		
		for(int i=1; i<checker.length; i++) {
			if(checker[i]==0) {
				System.out.println(i);
			}
		}
		
	}
	
	static void selfNumberFunc(int n) {
		int nsf = 0;	//not self number
		nsf += n;
		
		while(n!=0) {
			nsf += n%10;
			n/=10;
		}
		if(nsf<=10000) {
			checker[nsf] = 1;
		}
	}
}
