package vip.sort;

public class BubbleSortImproved {
	public static void main(String[] args) {
		int[] arr = new int[] {65, 55, 45, 35, 25, 15, 10};
		boolean swapped = true;
		
		for(int i=arr.length-1; i>=0 && swapped; i--) {
			swapped = false;
			for(int j=0; j<i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
