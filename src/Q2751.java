import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2751 {
	static int[] temp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Q2751 tt = new Q2751();
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		temp = new int[num];
		int arrSize = arr.length;
		
		for(int i=0; i<arrSize; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		tt.mergeS(arr, 0, arrSize-1);
		printArr(arr);
	}
	
	public void mergeS(int[] arr, int start, int end) {	
		int mid = 0;
		if(start<end) {	
			mid = (start+end)/2;		
			mergeS(arr, start, mid);
			mergeS(arr, mid+1, end);    
			merge(arr, start, mid, end);
		}
	}
	
	public void merge(int[] data, int start, int mid, int end) {
		int i=start;
		int j=mid+1;
		int k=start;	
		
		while(i<=mid && j<=end) {	
			
			if(data[i]<=data[j]) {  
				temp[k++]=data[i++];
			}else {
				temp[k++]=data[j++];
			}
		}
		while(i<=mid) {
			temp[k++]=data[i++];
		}
		while(j<=end) {
			temp[k++]=data[j++];
		}
		
		for(int v=start; v<=end; v++) {
			data[v] = temp[v]; 
		}
	}
	
	public static void printArr(int[] arr) {
		int arrSize = arr.length;
		for(int i=0; i<arrSize; i++) {
			System.out.println(arr[i]);
		}
	}
}
