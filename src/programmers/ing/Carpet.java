package programmers.ing;

public class Carpet {
	public static void main(String[] args) {
		int brown = 24;
		int red = 24;
		
		Carpet cp = new Carpet();
		int[] arr = cp.solution(brown, red);
		cp.printArr(arr);
		
		
	}
	public int[] solution (int brown, int red) {
		int[] answer = new int[2];
		int height;
		int width = 3;
		int size = brown + red; //10, 2
		int[][] carpet;
		
		while(true) {
			// 카펫을 만들지 못할경우
			if(size%width!=0) {
				width++;
				continue;
			}
			
			height = size/width;
			//System.out.println("heigth:"+height+", width:"+width);
			carpet = new int[height][width];
			//System.out.println("size:"+size+" carpet.length:"+carpet.length+", carpet[0].length:"+carpet[0].length);
			if(brown!= carpet.length*2 + (carpet[0].length-2)*2) {
				width++;
				continue;
			}else {
				break;
			}
		}
		
		answer[0] = height;
		answer[1] = width;
		return answer;
	}
	
	public void printArr(int[] arr) {
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i!=arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
