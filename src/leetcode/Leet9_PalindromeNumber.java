package leetcode;

public class Leet9_PalindromeNumber {
	public static void main(String[] args) {
		int n = 12;
		boolean answer = isPalindrome2(n);
		System.out.println(answer);
	}
	
	static boolean isPalindrome1(int n) {
		if(n<0) {
			return false;
		}else if(n<10) {
			return true;
		}else{
			char[] arr = Integer.toString(n).toCharArray();
			for(int i=0; i<arr.length; i++) {
				if(arr[i]!=arr[arr.length-1-i]) {
					return false;
				}
			}
			return true;
		}
	}
	
	static boolean isPalindrome2(int n) {
		if(n<0) {
			return false;
		}else if(n<10) {
			return true;
		}else{
			int nor = n;
			int rev = 0;
			while(n>0) {
				rev = (rev*10) + (n%10);
				n/=10;
			}
			System.out.println(nor);
			System.out.println(rev);
			return nor==rev;
		}
	}
}
