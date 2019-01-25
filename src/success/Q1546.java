package success;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * 	1546번 : 평균
 * 
 * @author kiwoong
 *
 */
public class Q1546 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		double max = 0;
		int n = Integer.parseInt(br.readLine());
		double[] arr = new double[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		double sum = 0;
		for(int i=0; i<arr.length; i++	) {
			arr[i] = arr[i]*100/max;
			sum += arr[i];
		}
		
 		System.out.print(String.format("%.2f", sum/n));
 		//System.out.print(sum/n);
	}
}
