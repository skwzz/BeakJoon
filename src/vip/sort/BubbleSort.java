package vip.sort;
/**
 * Bubble Sort
 * 맨 앞부터 현재 수와 다음 수를 비교해서 크면 비교하면서 큰수가 점점 배열의 뒤로 가게끔.
 * O(n^2)   (최선의 경우에도)
 * BubbleSortImproved 클래스처럼 한다면 최선의 경우 O(n)으로 향상 가능
 * @author KiwoongSon
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
//		int[] arr = new int[] {4, 2, 1, 7, 3};
		int[] arr = new int[] {65, 55, 45, 35, 25, 15, 10};
		
		for(int i=arr.length-1; i>=0; i--) {
			for(int j=0; j<i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
