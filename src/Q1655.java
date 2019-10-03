import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q1655 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<num; i++) {
			int temp = Integer.parseInt(br.readLine());
			al.add(temp);
			Collections.sort(al);
			
			if(al.size()%2==0) {
				System.out.println( al.get( (al.size()/2)-1 ) );
			}else {
				System.out.println(al.get(al.size()/2));
			}
		}
		
		
	}
}
