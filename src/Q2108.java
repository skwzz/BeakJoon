import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.PriorityQueue;

public class Q2108 {
	static int[] temp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int ans1 = 0; 	// 산술 평균
		int ans2;		// 중앙값
		int ans3;		// 최빈값
		int ans4;		// 범위
		
		int[] arr = new int[num];
		temp = new int[num];
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		for(int i=0; i<arr.length; i++) {
			arr[i]=Integer.parseInt(br.readLine());
			if(!ht.containsKey(arr[i])) {
				ht.put(arr[i], 1);
			}else {
				ht.put(arr[i], ht.get(arr[i])+1);
			}
			ans1 += arr[i];
		}
		
		mergeS(arr, 0, arr.length-1);
		ans2 = arr[arr.length/2];
		ans4 = arr[arr.length-1] - arr[0];
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("-=-=-=-==-=-");
		Enumeration e = ht.keys();
		int k;
		int v;
		while(e.hasMoreElements()) {
			k = (int) e.nextElement();
			v = (int) ht.get(k);
			System.out.println("KEY:"+k+" VALUE:"+v);
		}
		PriorityQueue<Hashtable<Integer, Integer>> pq = new PriorityQueue<Hashtable<Integer, Integer>>();
	}
	
	public static void mergeS(int[] arr, int start, int end) {	
		int mid = 0;
		if(start<end) {	
			mid = (start+end)/2;		
			mergeS(arr, start, mid);
			mergeS(arr, mid+1, end);    
			merge(arr, start, mid, end);
		}
	}
	
	public static void merge(int[] data, int start, int mid, int end) {
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
