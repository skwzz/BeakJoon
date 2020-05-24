package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11651 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		
		int num = Integer.parseInt(br.readLine());
		Point11651[] arr = new Point11651[num];
		for(int i=0; i<arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[i] = new Point11651(a, b);
		}
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].x+" "+arr[i].y);
		}
		
	}
}
class Point11651 implements Comparable<Point11651>{
	int x;
	int y;
	public Point11651(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point11651 o) {
		// TODO Auto-generated method stub
		if(this.y > o.y) {
			return 1;
		}else if(this.y == o.y) {
			if(this.x > o.x) {
				return 1;
			}else {
				return -1;
			}
		}else {
			return -1;
		}
	}
}
