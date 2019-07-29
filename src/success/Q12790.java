package success;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q12790 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<testCase; i++	) {
			st = new StringTokenizer(br.readLine());
			int hp1 = Integer.parseInt(st.nextToken());
			int mp1 = Integer.parseInt(st.nextToken());
			int atk1 = Integer.parseInt(st.nextToken());
			int def1 = Integer.parseInt(st.nextToken());
			int hp2 = Integer.parseInt(st.nextToken());
			int mp2 = Integer.parseInt(st.nextToken());
			int atk2 = Integer.parseInt(st.nextToken());
			int def2 = Integer.parseInt(st.nextToken());
			int hp = hp1 + hp2;
			int mp = mp1 + mp2;
			int atk = atk1 + atk2;
			int def = def1 + def2;
			if(hp<1) {
				hp = 1;
			}
			if(mp<1) {
				mp = 1;
			}
			if(atk<0) {
				atk = 0;
			}
			
			int sum = hp + (5*mp) + (2*atk) + (2*def);
			System.out.println(sum);
		}
		
	}
}
