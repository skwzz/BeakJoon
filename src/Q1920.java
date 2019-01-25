import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1920 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int numCnt;
		int[] arr;
		int searchCnt;
		int search;
		
		numCnt = Integer.parseInt(br.readLine());
		arr = new int[numCnt];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<numCnt; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		searchCnt = Integer.parseInt(br.readLine());
		for(int i=0; i<searchCnt; i++) {
			search = Integer.parseInt(br.readLine());
			if(binarySearch(arr, search)) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}
	}
	
	public static boolean binarySearch(int[] arr, int num) {
		return false;
	}
}
