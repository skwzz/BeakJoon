import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11004 {
	public static void main(String[] args) throws IOException{
		Q11004 tt = new Q11004();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[size];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		tt.mergeS(arr, 0, arr.length-1);
		
		System.out.println(arr[k-1]);
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
        int[] temp = new int[data.length]; 
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
}
