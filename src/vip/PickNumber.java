package vip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PickNumber {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> al = new ArrayList<>();
		boolean[] check = new boolean[n+1];
		
		pick(n, al, check);		
	}
	
	public static void pick(int n, ArrayList<Integer> al, boolean[] check) {
		// base case
		if(al.size()==n) {
			for(int i=0; i<al.size(); i++) {
				System.out.print(al.get(i)+" ");
			}
			System.out.println();
			return;
		}
		// non base
		for(int i=1; i<=n; i++	) {
			if(check[i]) 
				continue;
			check[i] = true;
			al.add(i);
			pick(n, al, check);
			al.remove(al.size()-1);
			check[i] = false;
		}
	}
}
