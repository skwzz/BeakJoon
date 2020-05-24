package baekjoon_OLD;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Q1325 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		PriorityQueue<Long> pq = new PriorityQueue<>(new MyComparator());
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			long temp = Long.parseLong(br.readLine());
			
			if(temp>0) {
				pq.add(temp);
			}else {
				if(pq.size()==0) {
					System.out.println("0");
				}else {
					System.out.println(pq.poll());
				}
			}
		}
	}
}

class MyComparator implements Comparator<Long>{

	@Override
	public int compare(Long o1, Long o2) {
		if(o1 > o2) return 1;
		if(o1 < o2) return -1;
		return 0;
	}
	
}
