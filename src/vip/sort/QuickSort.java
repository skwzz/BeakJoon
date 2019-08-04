package vip.sort;

public class QuickSort {
	public static void main(String[] args) {
//		int[] arr = new int[] {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int[] arr = new int[] {3, 7, 8, 1, 5, 9, 6, 10, 2, 4};
		
		QuickSort test = new QuickSort();
		test.sort(arr, 0, arr.length-1);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void sort(int[] arr, int start, int end) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		int pivot;
		if(start<end) {
			pivot = partition(arr, start, end);
			sort(arr, start, pivot-1);
			sort(arr, pivot+1, end);
		}
	}
	public int partition(int[] arr, int start, int end) {
		int left = start;
		int right = end;
		int pivot = arr[left];
		int temp;
		
		while(left<right) { // 엇갈리지 않을동안 
			// 피봇보다 작거나 같은 값을 찾을때 까지 right를 왼쪽으로 옮김.
			while(pivot<arr[right]) {
				right--;
			}
			// 피봇보다 큰 값을 찾으면서 엇갈리지 안을때 까지 
			while(pivot>=arr[left] && left<right) {
				left++;
			}
			temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}
		arr[start] = arr[right];
		arr[right] = pivot;
		return right;
	}
}
