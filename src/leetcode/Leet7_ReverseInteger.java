package leetcode;

public class Leet7_ReverseInteger {
	public static void main(String[] args){
		int n = 1534236469;
		int answer = reverse(n);
		System.out.println(answer);
	}
	static int reverse(int x) {
		int t = Math.abs(x);
		StringBuffer sb = new StringBuffer(Integer.toString(t));
		System.out.println(sb);
		sb.reverse();
		int ret = 0;
		try {
			ret = Integer.parseInt(sb.toString());
		}catch(NumberFormatException e) {
			return ret;
		}
		if(x<0) {
			ret *= -1;
		}
		return ret;
	}
}
