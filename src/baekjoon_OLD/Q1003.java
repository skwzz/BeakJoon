package baekjoon_OLD;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q1003 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] temp = new int[num];
		int max = 0;
		for(int i=0; i<temp.length; i++) {
			temp[i] = Integer.parseInt(br.readLine());
			if(max<temp[i]) {
				max = temp[i];
			}
		}
		
		ArrayList<Cnt> al = new ArrayList<Cnt>();
		for(int i=0; i<=max; i++) {
			if(i==0) {
				al.add(new Cnt(1, 0));
			}else if(i==1) {
				al.add(new Cnt(0, 1));
			}else {
				int zc = al.get(i-1).getZero() + al.get(i-2).getZero();
				int oc = al.get(i-1).getOne() + al.get(i-2).getOne();
				al.add(new Cnt(zc, oc));
			}
		}
		for(int i=0; i<temp.length; i++) {
			System.out.println(al.get(temp[i]).getZero()+" "+al.get(temp[i]).getOne());
		}
	}
}
class Cnt{
	private int zero;
	private int one;
	
	public Cnt(int zero, int one) {
		this.zero = zero;
		this.one = one;
	}
	public int getZero() {
		return this.zero;
	}
	public int getOne() {
		return this.one;
	}
}
