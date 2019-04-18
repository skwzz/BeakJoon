package vip;

public class ISB_Sort {
	public static void main(String[] args) {
		ISB_Sort isb = new ISB_Sort();
		
		int[] arr = new int[15];
		System.out.println("Insert Sort start");
		initRandom(arr);
		printArr(arr);
		
		isb.insertSort(arr);
		printArr(arr);
		
		System.out.println("Select Sort start");
		initRandom(arr);
		printArr(arr);
		isb.selectSort(arr);
		printArr(arr); 
		
		System.out.println("Bubble Sort start");
		initRandom(arr);
		printArr(arr);
		isb.bubbleSort(arr);
		printArr(arr);
	}
	
	public void insertSort(int[] arr) {
		int temp = 0;
		for(int i=0; i<arr.length; i++	) {
			for(int j=i; j>=1; j--) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}else {
					break;
				}
					
			}
		}
	}
	
	public void selectSort(int[] arr) { // 최소값을 맨앞으로
		int min = 0;
		int temp = 0;
		for(int i=0; i<arr.length-1; i++) {
			min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	
	public void bubbleSort(int[] arr) { //비교하면서 큰수를 위로 끌어올림
		int temp = 0;
		for(int i=arr.length-1; i>=0; i--) {
			for(int j=0; j<i; j++	) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void initRandom(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
		}
	}
	public static void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
}
