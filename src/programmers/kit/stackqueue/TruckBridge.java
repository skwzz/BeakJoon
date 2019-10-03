package programmers.kit.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class TruckBridge {
	public static void main(String[] args) {
		int bridgeLength = 2;
		int maxWeight = 10;
		int[] truckWeight = {7, 4, 5, 6};
		int sum = 0;
		int time = 0;
		
		Queue<Integer> bridge = new LinkedList<>();
		Queue<Integer> truck = new LinkedList<>();
		
		
		for(int i=0; i<truckWeight.length; i++) {
			truck.add(truckWeight[i]);
		}
		
		for(int i=0; i<bridgeLength; i++) {
			bridge.add(0);
		}
		
		while(true) {
			time++;
			System.out.print(time+" - ");
			System.out.println(bridge);
			int nextWeight = 0;
			if(!truck.isEmpty()) {
				nextWeight = truck.peek();
			}
			sum -= bridge.poll();
			
			if(sum+nextWeight<maxWeight) {
				bridge.add(truck.poll());
				sum+=nextWeight;
			}else {
				bridge.add(0);
			}
			
			
			
			if(sum==0 && truck.isEmpty()) {
				break;
			}
			if(time==10) {
				break;
			}
		}
		System.out.println("sum:"+sum);
		System.out.println("ANSWER : "+time);
	}
}
