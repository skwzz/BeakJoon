package vip.sort;
/**
 * Selection Sort
 * O(n^2)
 * 최선의 경우 O(n)
 * 배열을 돌면서 최소값을 선택하고 그것을 맨 앞쪽으로 옮기는 형태
 *
 * @author KiwoongSon
 *
 */
public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = new int[] {65, 55, 45, 35, 25, 15, 10};
		int min = 0;
		for(int i=0; i<arr.length-1; i++) {
			min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[min]>arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			
			for(int z=0; z<arr.length; z++) {
				System.out.print(arr[z]+" ");
			}
			System.out.println("");
		}
		
		/*for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}*/
	}
}
