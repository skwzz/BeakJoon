package vip;

public class Quicksort_study {
	public static void main(String[] args){
		Quicksort_study qs = new Quicksort_study();
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
			System.out.print(arr[i]+" ");
		}
		
		//int[] arr = {3, 5, 8, 1, 2, 9, 4, 7, 6};
		qs.Quicksort(arr, 0, arr.length-1);
		System.out.println("");
		System.out.println("sorted array");
		printArr(arr);
	}
	
	public void Quicksort(int[] arr, int low, int high) {
		int pivot;
		if(low<high) {
			pivot = partition(arr, low, high);
			Quicksort(arr, low, pivot-1);
			Quicksort(arr, pivot, high);
		}
	}
	
	public int partition(int[] arr, int low, int high) {
		int temp;  //for swap
		int left = low;
		int right = high;
		int pivot_item = arr[(left+right)/2];
		
		while(left<=right	) {
			while(arr[left]<pivot_item	) {
				left++;
			}
			while(arr[right]>pivot_item) {
				right--;
			}
			if(left<=right	) {
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
				
			}
		}
		return left;
	}
	public static void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
}
