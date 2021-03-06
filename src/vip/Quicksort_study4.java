package vip;

public class Quicksort_study4 {
	public static void main(String[] args) {
		Quicksort_study4 qs = new Quicksort_study4();
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
		}
		printArr(arr);
		
		qs.sort(arr, 0, arr.length-1);
		printArr(arr);
	}
	
	public void sort(int[] arr, int low, int high) {
		int pivot;
		if(low<high) {
			pivot = partition(arr, low, high);
			sort(arr, low, pivot-1);
			sort(arr, pivot+1, high);
		}
	}
	
	public int partition(int[] arr, int low, int high) {
		int left = low;
		int right = high;
		int pivot = arr[high];
		int temp;
		while(left<right) {
			while(arr[left]<pivot) {
				left++;
			}
			while(left<right && arr[right]>=pivot) {
				right--;
			}
			temp = arr[right];
			arr[right] = arr[left];
			arr[left] = temp;
		}
		arr[high] = arr[left];
		arr[left] = pivot;
		return left;
	}
	
	public void swap(int[] arr, int left, int right) {
		int temp = arr[right];
		arr[right] = arr[left];
		arr[left] = temp;
	}
	
	public static void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
}
