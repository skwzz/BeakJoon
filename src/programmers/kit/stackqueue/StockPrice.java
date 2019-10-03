package programmers.kit.stackqueue;

public class StockPrice {
	public static void main(String[] args) {
		int[] price = {1, 2, 3, 2, 3};
		int[] result = new int[price.length];
		
		for(int i=0; i<price.length-1; i++) {
			int curPrice = price[i];
			System.out.println("CURRENT : "+curPrice);
			for(int j=i+1; j<price.length; j++) {
				result[i]++;
				if(curPrice>price[j]) {
					break;
				}
			}
		}
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+" ");
		}
		
	}
}
