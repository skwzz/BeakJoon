import java.util.Arrays;
import java.util.Comparator;

public class QTest {
	public static void main(String[] args) {
		String str1 = "Aaa";
		String str2 = "aAa";
		String str3 = "aaA";
		String str4 = "AAa";
		String str5 = "AaA";
		String str6 = "aAA";
		
		String[] arr = new String[6];
		arr[0] = str1;
		arr[1] = str2;
		arr[2] = str3;
		arr[3] = str4;
		arr[4] = str5;
		arr[5] = str6;
		Comparator<String> mc = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2)*(-1);
			}
			
		};
		Arrays.sort(arr, mc);
		for(int i=0; i<arr.length; i++) { 
			System.out.println(arr[i]);
		}
	}
}
