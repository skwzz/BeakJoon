
public class Testman {
	public static void main(String[] args) {
		int x = 1;
		int y = 4;
		int xor = x ^ y;
		int cnt = 0;
		for(int i=0; i<32; i++) {
			cnt += (xor>>i) & 1;
		}
		System.out.println(xor);
		System.out.println(cnt);
	}
}
