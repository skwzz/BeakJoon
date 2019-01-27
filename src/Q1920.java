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
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		searchCnt = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<searchCnt; i++) {
			search = Integer.parseInt(st.nextToken());
			if(binarySearch(arr, search)) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}
	}
	
	public static boolean binarySearch(int[] arr, int num) {
		int low = 0;
		int high = arr.length-1;
		int mid = 0;
		
		while(low<=high) {
			mid = (low+high)/2;
			if(arr[mid]==num) {
				return true;
			}else if(arr[mid]>num) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return false;
	}
}
