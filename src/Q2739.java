import java.util.Scanner;

public class Q2739 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int mul = 0;
		for(int i=1; i<10; i++) {
			mul = n*i;
			System.out.println(n+" * "+i+" = "+mul);
		}
	}
}
