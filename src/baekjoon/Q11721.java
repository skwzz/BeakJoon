package baekjoon;
import java.util.Scanner;

/**
 * ?�� 개씩 ?��?�� 출력?���?
 * 
 * @author kiwoong
 *
 */
public class Q11721 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		
		for(int i=0; i<str.length(); i++) {
			if(i!=0 && i%10==0) {
				System.out.println("");
			}
			System.out.print(str.charAt(i));
		}
	}
}
