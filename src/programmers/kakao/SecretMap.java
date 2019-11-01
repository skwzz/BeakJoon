package programmers.kakao;

import java.text.DecimalFormat;

public class SecretMap {
	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 18};
		
		String[] answer = new String[n];
		
		for(int i=0; i<arr1.length; i++) {
			StringBuffer sb = new StringBuffer();
			for(int j=0; j<n; j++) {
				sb.append("0");
			}
			DecimalFormat df = new DecimalFormat(sb.toString());
			String str1 = df.format(Integer.parseInt(Integer.toBinaryString(arr1[i])));
			String str2 = df.format(Integer.parseInt(Integer.toBinaryString(arr2[i])));
			
			sb = new StringBuffer();
			for(int j=0; j<str1.length(); j++) {
				int a = str1.charAt(j)-48;
				int b = str2.charAt(j)-48;
				if((a|b)==1) {
					sb.append("#");
				}else {
					sb.append(" ");
				}
			}
			answer[i] = sb.toString();
		}
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		
	}
}
