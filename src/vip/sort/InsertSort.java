package vip.sort;

public class InsertSort {
	public static void main(String[] args) {
		int[] arr = new int[] {65, 55, 45, 35, 25, 15, 10};
		int temp = 0;
		int j;
		
		for(int i=1; i<arr.length; i++) {
			temp = arr[i];
			
			for(j=i-1; j>=0 && arr[j]>temp; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
