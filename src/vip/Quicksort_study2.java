package vip;

public class Quicksort_study2 {
	public static void main(String[] args) {
		int[] arr = new int[20];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
			System.out.print(arr[i]+" ");
		}
		
		Quicksort_study2 qs = new Quicksort_study2();
		qs.sort(arr, 0, arr.length-1);
		System.out.println("sorted array");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void sort(int[] arr, int low, int high) {
		if(low<high) {
			int pivot = partition(arr, low, high);
			sort(arr, low, pivot-1);
			sort(arr, pivot+1, high);
		}
	}
	
	public int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = (low-1);
		
		for(int j=low; j<high; j++) {
			if(arr[j]<=pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}
}
