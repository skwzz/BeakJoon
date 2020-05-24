package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5622 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		/*
		 * 
		 * 1
		 * 2 : ABC
		 * 3 : DEF
		 * 4 : GHI
		 * 5 : JKL
		 * 6 : MNO
		 * 7 : PQRS
		 * 8 : TUV
		 * 9 : WXYZ
		 * 0 : oper
		 *  UPPER CASE ASCII 65~90
		 *   9 7 9 3 5 3 - 36
		 */
		int answer = 0;
		int flag = 0;
		char c = ' ';
		for(int i=0; i<str.length(); i++) {
			c = str.charAt(i);
			switch(c) {
			case 'A':
			case 'B':
			case 'C':
				flag = 2;
				break;
			case 'D':
			case 'E':
			case 'F':
				flag = 3;
				break;
			case 'G':
			case 'H':
			case 'I':
				flag = 4;
				break;
			case 'J':
			case 'K':
			case 'L':
				flag = 5;
				break;
			case 'M':
			case 'N':
			case 'O':
				flag = 6;
				break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				flag = 7;
				break;
			case 'T':
			case 'U':
			case 'V':
				flag = 8;
				break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				flag = 9;
				break;
			}
			
			answer += (flag+1);
		}
		System.out.println("answer:"+answer);
	}
}
