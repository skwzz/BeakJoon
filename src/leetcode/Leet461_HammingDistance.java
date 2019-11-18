package leetcode;

public class Leet461_HammingDistance {
	public static void main(String[] args) {
		int a = 1;
		int b = 4;
		int xor = a^b;
		System.out.println("XOR:"+xor);
		int cnt = 0;
		for(int i=0; i<32; i++) {
			cnt += (xor>>i)&1;
		}
		System.out.println("ANSWER:"+cnt);
	}
}
