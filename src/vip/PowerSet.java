package vip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PowerSet {
	private static int[] data = {0, 1, 2, 3};
	private static boolean[] include = new boolean[data.length];
	public static void main(String[] args) throws IOException{
		powerSet(0);
	}
	public static void powerSet(int k) {
		if(k==data.length) {
			for(int i=0; i<data.length; i++) {
				if(include[i]) {
					System.out.print(data[i]+" ");
				}
			}
			System.out.println();
			return;
		}else {
			include[k] = false;
			powerSet(k+1);
			include[k] = true;
			powerSet(k+1);
		}
	}
	
	
}
