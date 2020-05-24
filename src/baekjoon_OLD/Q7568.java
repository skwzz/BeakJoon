package baekjoon_OLD;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7568 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int num = Integer.parseInt(br.readLine());
		Student[] arr = new Student[num];
		
		for(int i=0; i<num; i++	) {
			st = new StringTokenizer(br.readLine());
			int weight = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());
			
			arr[i] = new Student(weight, height);
		}
		
		for(int i=0; i<arr.length; i++	) {
			for(int j=0; j<arr.length; j++) {
				if(i==j) {
					continue;
				}
				if(arr[i].weight > arr[j].weight && arr[i].height > arr[j].height) {
					arr[j].rank++;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i].rank+" ");
		}
	}
}

class Student{
	int weight;
	int height;
	int rank;
	
	public Student(int weight, int height) {
		this.weight = weight;
		this.height = height;
		this.rank = 1;
	}
}
