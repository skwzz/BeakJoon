package baekjoon;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

public class Q10932 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		String answer = "";
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-512");
			md.update(str.getBytes());
			byte[] mb = md.digest();
			
			 for (int i = 0; i < mb.length; i++) {
                byte temp = mb[i];
                String s = Integer.toHexString(new Byte(temp));
                while (s.length() < 2) {
                    s = "0" + s;
                }
                s = s.substring(s.length() - 2);
                answer += s;
            }
			 System.out.println(answer);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
