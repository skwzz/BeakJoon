package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1924 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[3];
		String[] day = new String[] {"", "MON","TUE","WED","THU","FRI","SAT","SUN"};
		for(int i=0; i<arr.length; i++) {
			arr[i] = 1;
		}
		// MON, TUE, WED, THU, FRI, SAT, SUN
		//  1    2    3    4    5    6    7
		
		int month = Integer.parseInt(st.nextToken());
		int date = Integer.parseInt(st.nextToken());
		
		while(true) {
			if(arr[0]==month && arr[1]==date) {
				System.out.print(day[arr[2]]);
				break;
			}
			
			arr[2]++;
			if(arr[2]>7) {
				arr[2]=1;
			}
			arr[1]++;
			if(arr[0]==1 || arr[0]==3 || arr[0]==5 || arr[0]==7 || arr[0]==8 || arr[0]==10 || arr[0]==12) {
				if(arr[1]>31) {
					arr[0]++;
					arr[1] = 1;
				}
			}else if(arr[0]==4 || arr[0]==6 || arr[0]==9 || arr[0]==11) {
				if(arr[1]>30) {
					arr[0]++;
					arr[1] = 1;
				}
			}else if(arr[0]==2) {
				if(arr[1]>28) {
					arr[0]++;
					arr[1] = 1;
				}
			}
			
		}
	}
}
