import java.io.IOException;
import java.util.Scanner;

public class Q1912 {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		int[] val = new int[num];
		int[] target = new int[num];
		int max = -1001;
		for(int i=0; i<num; i++	) {
			val[i] = in.nextInt();
			target[i] = val[i];
			if(val[i]>max) {
				max = val[i];
			}
		}
		
		for(int i=1; i<num; i++) {
			for(int j=0; j<num-i; j++) {
				target[j] = target[j]+val[j+i];
				if(target[j]>max) {
					max = target[j];
				}
			}
		}
		System.out.print(max);
	}
}
